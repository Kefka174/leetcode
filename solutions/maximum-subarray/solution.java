class Solution {
    public int maxSubArray(int[] nums) {
        int currentTotal = 0, maxTotal = Integer.MIN_VALUE;
        for (int num : nums) {
            currentTotal = Math.max(currentTotal + num, num);
            if (currentTotal > maxTotal) maxTotal = currentTotal;
        }
        return maxTotal;
    }
}