#include <iostream>
#include <vector>
using namespace std;

int search(vector<int>& nums, int target) {
    int topIndex = nums.size() - 1;
    int bottomIndex = 0;

    while (bottomIndex <= topIndex) {
        int middleIndex = ((topIndex - bottomIndex) / 2) + bottomIndex;
        
        if (target == nums[middleIndex]) return middleIndex;
        if (target > nums[middleIndex]) bottomIndex = middleIndex + 1;
        else topIndex = middleIndex - 1;
    }
    
    return -1;
}

int main() {
    vector<int> v1 = {-1, 0, 3, 5, 9, 12};
    cout << "found at: " << search(v1, 9) << endl;
    cout << "found at: " << search(v1, 2) << endl;
}