class Solution {
    public boolean isMonotonicCount(int[] nums) {
        int increasingCount = 1, decreasingCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] <= nums[i]) increasingCount++;
            if (nums[i - 1] >= nums[i]) decreasingCount++;
        }
        return (increasingCount == nums.length) || (decreasingCount == nums.length);
    }
    

    //////////////////////////////////////////////////////////////////////
    public boolean isMonotonicConform(int[] nums) {
        if (nums.length < 2) return true;

        int index = 1;
        while (index < nums.length -1 && nums[index - 1] == nums[index])
            index++;
        boolean increasing = nums[index - 1] < nums[index];

        for (; index < nums.length; index++) {
            if (nums[index - 1] != nums[index] &&
                (nums[index - 1] < nums[index]) != increasing)
                return false;
        }
        return true;
    }
}