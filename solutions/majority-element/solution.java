class Solution {
    public int majorityElement(int[] nums) {
        int element = nums[0];
        int elementCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (elementCount == 0) {
                element = nums[i];
                elementCount++;
            }
            else if (nums[i] == element) elementCount++;
            else elementCount--;
        }
        return element;
    }
}