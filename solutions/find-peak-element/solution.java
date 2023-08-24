class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1 || nums[0] > nums[1]) return 0;
        if (nums[nums.length -1] > nums[nums.length - 2]) return nums.length - 1;

        int leftIndex = 1, middleIndex = 0;
        int rightIndex = nums.length - 2;

        while (leftIndex <= rightIndex) {
            middleIndex = (leftIndex + rightIndex) / 2;

            if (nums[middleIndex] > nums[middleIndex - 1] && 
                nums[middleIndex] > nums[middleIndex + 1]) 
                return middleIndex;
            else if (nums[middleIndex - 1] > nums[middleIndex + 1])
                rightIndex = middleIndex - 1;
            else 
                leftIndex = middleIndex + 1;
        }
        return middleIndex;
    }
}