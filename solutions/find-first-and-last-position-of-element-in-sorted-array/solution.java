class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstIndex = binarySearch(0, nums.length - 1, target, nums);
        boolean targetNotInNums = nums.length == 0 
                                  || firstIndex == nums.length 
                                  || nums[firstIndex] != target;
        if (targetNotInNums) return new int[] {-1, -1};
        int lastIndex = binarySearch(firstIndex, nums.length - 1, target + 1, nums) - 1;
        return new int[] {firstIndex, lastIndex};
    }

    private int binarySearch(int startIndex, int endIndex, int target, int[] arr) {
        if (startIndex > endIndex) return startIndex;

        int middleIndex = (startIndex + endIndex) / 2;
        if (arr[middleIndex] >= target) {
            return binarySearch(startIndex, middleIndex - 1, target, arr);
        }
        else {
            return binarySearch(middleIndex + 1, endIndex, target, arr);
        }
    }
}