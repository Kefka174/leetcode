class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        for (int i = 0; i < nums.size(); i++) {
            // calculate sum of left
            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }
            // calculate sum of right
            int rightSum = 0;
            for (int j = i + 1; j < nums.size(); j++) {
                rightSum += nums[j];
            }
            // compare
            if (leftSum == rightSum) return i;
        }
        return -1;
    }
};