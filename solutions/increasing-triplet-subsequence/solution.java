class Solution {
    public boolean increasingTriplet(int[] nums) {
        int potentialFirst = nums[0];
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= potentialFirst) potentialFirst = nums[i];
            else {
                if (nums[i] <= second) {
                    first = Math.min(first, potentialFirst);
                    second = nums[i];
                    potentialFirst = first;
                }
                else return true;
            }
        }
        return false;
    }
}