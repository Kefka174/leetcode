#include <vector>
#include <unordered_set>
using namespace std;

bool containsNearbyDuplicate(vector<int>& nums, int k) {
    if (k == 0) return false;
    unordered_set<int> numSet;
    for (int i = 0; i < nums.size(); i++) {
        if (numSet.count(nums[i])) return true;
        
        if (i >= k) numSet.erase(nums[i - k]);
        numSet.insert(nums[i]);
    }
    return false;
}