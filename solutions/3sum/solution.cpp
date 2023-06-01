#include <vector>
#include <unordered_map>
#include <algorithm>
#include <iostream>
using namespace std;

vector<vector<int>> threeSumTwoPointer(vector<int>& nums) { // O(n^2) time
    sort(nums.begin(), nums.end());
    vector<vector<int>> validTriplets;
    for (int firstIndex = 0; firstIndex < nums.size() - 2 && nums[firstIndex] <= 0; firstIndex++) {
        while (firstIndex != 0 && firstIndex < nums.size() - 2 
                && nums[firstIndex] == nums[firstIndex-1]) firstIndex++; // pass over duplicate first values
        
        int secondIndex = firstIndex + 1;
        int thirdIndex = nums.size() - 1;
        while (secondIndex < thirdIndex) {
            int sum = nums[firstIndex] + nums[secondIndex] + nums[thirdIndex];
            if (sum == 0) {
                validTriplets.push_back({nums[firstIndex], nums[secondIndex], nums[thirdIndex]});
                secondIndex++;
                thirdIndex--;
            }
            else if (sum < 0) secondIndex++;
            else thirdIndex--;

            // pass over duplicate second and third values
            while (secondIndex != firstIndex + 1 && secondIndex < thirdIndex 
                    && nums[secondIndex] == nums[secondIndex - 1]) secondIndex++;
            while (thirdIndex != nums.size() - 1 && thirdIndex > secondIndex
                    && nums[thirdIndex] == nums[thirdIndex + 1]) thirdIndex--;
        }
    }
    return validTriplets;
}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////
vector<vector<int>> threeSumHashMap(vector<int>& nums) { // O(n^2) time, O(unique n) space
    sort(nums.begin(), nums.end());

    unordered_map<int, int> finalIndexOfVal;
    for (int i = 0; i < nums.size(); i++) finalIndexOfVal[nums[i]] = i;

    vector<vector<int>> validTriplets;
    for (int firstIndex = 0; firstIndex < nums.size() - 2 && nums[firstIndex] <= 0; firstIndex++) {
        while (firstIndex != 0 && firstIndex < nums.size() - 2 
                && nums[firstIndex] == nums[firstIndex - 1]) firstIndex++; // pass over duplicate first values

        for (int secondIndex = firstIndex + 1; secondIndex < nums.size() - 1; secondIndex++) {
            while (secondIndex != firstIndex + 1 && secondIndex < nums.size() - 1 
                    && nums[secondIndex] == nums[secondIndex - 1]) secondIndex++; // pass over duplicate second values

            int valNeeded = -(nums[firstIndex] + nums[secondIndex]);
            if (finalIndexOfVal.count(valNeeded) && finalIndexOfVal[valNeeded] > secondIndex) {
                validTriplets.push_back({nums[firstIndex], nums[secondIndex], valNeeded});
            }
        }
    }
    return validTriplets;
}


/////////////////////////////////////////////// Solution Testing
void printVector2D(vector<vector<int>>& vect) {
    cout << "< ";
    for (vector<int> nums : vect) {
        cout << "< ";
        for (int num : nums) cout << num << ", ";
        cout << ">, ";
    }
    cout << ">" << endl;
}

int main() {
    vector<int> v1{-1,0,1,2,-1,-4};
    vector<vector<int>> r1 = threeSumHashMap(v1);
    printVector2D(r1);

    return 0;
}