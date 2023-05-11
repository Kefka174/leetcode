#include <vector>
#include <algorithm> // copy_if
using namespace std;

vector<vector<int>> permute(vector<int>& nums) {
    if (nums.size() == 1) return vector<vector<int>>{{nums[0]}};

    vector<vector<int>> permutations;
    for (int i = 0; i < nums.size(); i++) {
        int numI = nums[i];
        // make a copy of nums without numI
        vector<int> numsWithoutI(nums.size() - 1);
        copy_if(nums.begin(), nums.end(), numsWithoutI.begin(), [numI](int j){return j != numI;});
        
        // recursively generate permutations of nums without numI
        vector<vector<int>> permsWithoutI = permute(numsWithoutI);
        for (vector<int>& perm : permsWithoutI) perm.push_back(numI); // add numI to each
        permutations.insert(permutations.end(), permsWithoutI.begin(), permsWithoutI.end());
    }
    return permutations;
}