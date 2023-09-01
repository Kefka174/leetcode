#include <iostream>
#include <vector>
using namespace std;

int search(vector<int>& nums, int target) {
    int topIndex = nums.size() - 1;
    int bottomIndex = 0;

    while (bottomIndex <= topIndex) {
        int middleIndex = (topIndex + bottomIndex) / 2;
        
        if (target == nums[middleIndex]) return middleIndex;
        if (target > nums[middleIndex]) bottomIndex = middleIndex + 1;
        else topIndex = middleIndex - 1;
    }
    
    return -1;
}