#include <cmath>
#include <vector>
#include <unordered_set>
#include <set>
using namespace std;

int closestNumInSet(set<int>& s, int num) { // O(logn)
    set<int>::iterator aboveNumIt = s.lower_bound(num); // iterator to first number in s greater than num
    if (aboveNumIt == s.end()) return *--aboveNumIt; // num is greater than the final num in s

    int closestNum = *aboveNumIt;
    // check the number below aboveNumIt to see if it's closer to num
    if (aboveNumIt != s.begin()) {
        aboveNumIt--;
        if (abs(*aboveNumIt - num) < abs(closestNum - num)) closestNum = *aboveNumIt;
    }

    return closestNum;
}

bool containsNearbyAlmostDuplicate(vector<int>& nums, int indexDiff, int valueDiff) { // O(n*log(indexDiff))
    set<int> numSet = {nums[0]};
    for (int i = 1; i < nums.size(); i++) {
        int closestNum = closestNumInSet(numSet, nums[i]);
        if (abs(closestNum - nums[i]) <= valueDiff) return true;
        
        if (i >= indexDiff) numSet.erase(nums[i - indexDiff]);
        numSet.insert(nums[i]);
    }
    return false;
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////
bool containsNearbyAlmostDuplicateBrute(vector<int>& nums, int indexDiff, int valueDiff) { // O(n*indexDiff)
    unordered_set<int> numSet;
    for (int i = 0; i < nums.size(); i++) {
        for (int num : numSet) {
            if (abs(num - nums[i]) <= valueDiff) return true;
        }
        if (i >= indexDiff) numSet.erase(nums[i - indexDiff]);
        numSet.insert(nums[i]);
    }
    return false;
}
