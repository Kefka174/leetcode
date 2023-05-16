#include <vector>
#include <unordered_map>
using namespace std;

bool containsNearbyDuplicate(vector<int>& nums, int k) {
    unordered_map<int, int> numMap;
    for (int i = 0; i < nums.size(); i++) {
        if (numMap.count(nums[i]) && i - numMap[nums[i]] <= k) return true;
        numMap[nums[i]] = i;
    }
    return false;
}