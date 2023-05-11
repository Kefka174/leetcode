#include <vector>
#include <algorithm> // copy_if
#include <unordered_set>
#include <queue>
using namespace std;

vector<vector<int>> permuteIterative(vector<int>& nums) {
    vector<vector<int>> allPermutatoins;
    unordered_set<int> numsSet (nums.begin(), nums.end());
    queue<pair<vector<int>, unordered_set<int>>> permQueue;
    permQueue.push({vector<int>(), numsSet});

    while (!permQueue.empty()) {
        vector<int> currentPermutation = permQueue.front().first;
        unordered_set<int> numsToUse = permQueue.front().second;
        permQueue.pop();

        for (int num : numsToUse) {
            unordered_set setWithoutNum = numsToUse;
            setWithoutNum.erase(num);
            vector<int> permWithNum = currentPermutation;
            permWithNum.push_back(num);

            if (setWithoutNum.empty()) allPermutatoins.push_back(permWithNum);
            else permQueue.push({permWithNum, setWithoutNum});
        }
    }
    return allPermutatoins;
}


///////////////////////////////////////////////////////////////////////////////////////////////////
vector<vector<int>> permuteRecursive(vector<int>& nums) {
    if (nums.size() == 1) return vector<vector<int>>{{nums[0]}};

    vector<vector<int>> permutations;
    for (int i = 0; i < nums.size(); i++) {
        int numI = nums[i];
        // make a copy of nums without numI
        vector<int> numsWithoutI(nums.size() - 1);
        copy_if(nums.begin(), nums.end(), numsWithoutI.begin(), [numI](int j){return j != numI;});
        
        // recursively generate permutations of nums without numI
        vector<vector<int>> permsWithoutI = permuteRecursive(numsWithoutI);
        for (vector<int>& perm : permsWithoutI) perm.push_back(numI); // add numI to each
        permutations.insert(permutations.end(), permsWithoutI.begin(), permsWithoutI.end());
    }
    return permutations;
}


///////////////////////////////////////////////////////////////////////////////////////////////////
vector<vector<int>> permuteRecursiveSwapping(vector<int>& nums) { // fastest because vectors/sets aren't being copied
    vector<vector<int>> permutations;
    recursiveHelper(nums, 0, permutations);
    return permutations;
}

void recursiveHelper(vector<int>& nums, int swappingNum, vector<vector<int>>& permutations) {
    if (swappingNum == nums.size()) permutations.push_back(nums);
    else {
        for (int i = swappingNum; i < nums.size(); i++) {
            swap(nums[i], nums[swappingNum]);
            recursiveHelper(nums, swappingNum + 1, permutations);
            swap(nums[i], nums[swappingNum]);
        }
    }
}