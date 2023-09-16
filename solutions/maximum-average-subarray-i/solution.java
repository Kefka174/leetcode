class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxSum = Double.NEGATIVE_INFINITY;
        double windowSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            windowSum += nums[i];
            if (i >= k) windowSum -= nums[i - k];
            if (i >= k - 1 && windowSum > maxSum) maxSum = windowSum;
        }
        if (maxSum == Double.NEGATIVE_INFINITY) return windowSum / k;
        return maxSum / k;
    }
}