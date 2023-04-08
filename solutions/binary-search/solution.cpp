#include <iostream>
#include <vector>
using namespace std;

int search(vector<int>& nums, int target) {
    if (nums.size() == 0) return -1;
    int topIndex = nums.size() - 1;
    int bottomIndex = 0;

    while (topIndex - bottomIndex > 1) {
        int middleIndex = ((topIndex - bottomIndex) / 2) + bottomIndex;
        
        if (target == nums[middleIndex]) return middleIndex;
        if (target > nums[middleIndex]) bottomIndex = middleIndex;
        else topIndex = middleIndex;
    }
    if (target == nums[bottomIndex]) return bottomIndex;
    if (target == nums[topIndex]) return topIndex;
    return -1;
}

int main() {
    vector<int> v1 = {-1, 0, 3, 5, 9, 12};
    cout << "found at: " << search(v1, 9) << endl;
    cout << "found at: " << search(v1, 2) << endl;
}