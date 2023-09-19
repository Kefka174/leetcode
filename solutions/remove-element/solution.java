class Solution {
    public int removeElement(int[] nums, int val) {
        int valCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) valCount++;
            else if (valCount > 0) {
                nums[i - valCount] = nums[i];
            }
        }
        return nums.length - valCount;
    }
}