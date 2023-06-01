#include <vector>
#include <unordered_map>
#include <unordered_set>
#include <iostream>
using namespace std;

struct hashFunction { // vector<int> hashing
  size_t operator()(const vector<int>& vect) const {
    std::size_t seed = vect.size();
    for(auto& i : vect) {
        seed ^= i + 0x9e3779b9 + (seed << 6) + (seed >> 2);
    }
    return seed;
  }
};

vector<vector<int>> threeSumBrute(vector<int>& nums) { // O(n^2) time and space
    unordered_map<int, vector<pair<int, int>>> twoSums;
    for (int i = 0; i < nums.size(); i++) {
        for (int j = i + 1; j < nums.size(); j++) {
            int sum = nums[i] + nums[j];
            pair<int, int> indexPair = {i, j};
            if (nums[i] > nums[j]) indexPair = {j, i}; // keep values sorted increasing

            if (twoSums.count(sum)) twoSums[sum].push_back(indexPair);
            else twoSums.insert({sum, {indexPair}});
        }
    }

    unordered_set<vector<int>, hashFunction> validTriplets; // set so there aren't duplicates
    for (int i = 0; i < nums.size(); i++) {
        for (pair<int, int> indexPair : twoSums[-nums[i]]) {
            if (i != indexPair.first && i != indexPair.second) {
                // insert in sorted order
                if (nums[i] < nums[indexPair.first]) validTriplets.insert({nums[i], nums[indexPair.first], nums[indexPair.second]});
                else if (nums[i] < nums[indexPair.second]) validTriplets.insert({nums[indexPair.first], nums[i], nums[indexPair.second]});
                else validTriplets.insert({nums[indexPair.first], nums[indexPair.second], nums[i]});
            }
        }
    }
    return vector<vector<int>> (validTriplets.begin(), validTriplets.end());
}


/////////////////////////////////////////////// Solution Testing
void printVector2D(vector<vector<int>>& vect) {
    cout << "< ";
    for (vector<int> nums : vect) {
        cout << "< ";
        for (int num : nums) cout << num << ", ";
        cout << "> ";
    }
    cout << ">" << endl;
}

int main() {
    vector<int> v1{-1,0,1,2,-1,-4};
    vector<vector<int>> r1 = threeSumBrute(v1);
    printVector2D(r1);

    return 0;
}