#include <iostream>
#include <vector>
using namespace std;

void printArr(int arr[], int size) {
    cout << "[";
    for (int i = 0; i < size; i++) {
        cout << arr[i] << ",";
    }
    cout << "]\n";
}

int pivotIndex(vector<int>& nums) {
    if (nums.size() < 2) return 0;

    // calculate leftSums
    vector<int> leftSums(nums.size(), 0);
    for (int i = 1; i < nums.size(); i++) {
        leftSums[i] = leftSums[i-1] + nums[i-1];
    }
    // calculate rightSums
    vector<int> rightSums(nums.size(), 0);
    for (int i = nums.size() - 2; i >= 0; i--) {
        rightSums[i] = rightSums[i+1] + nums[i+1];
    }

    // compare sums to find pivot
    for (int i = 0; i < nums.size(); i++) {
        if (leftSums[i] == rightSums[i]) return i;
    }
    return -1;
}

int main() {
    vector<int> test1{1, 7, 3, 6, 5, 6};
    vector<int> test2{1, 2, 3};
    vector<int> test3{2, 1, -1};
    cout << pivotIndex(test1) << "\n";
    cout << pivotIndex(test2) << "\n";
    cout << pivotIndex(test3) << "\n";
    return 0;
}