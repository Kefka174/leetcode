class Solution {
    public int findDuplicate(int[] nums) { // Floyds cycle detection
        int slowIndex = nums[0], fastIndex = nums[nums[0]];
        while (slowIndex != fastIndex) {
            slowIndex = nums[slowIndex];
            fastIndex = nums[nums[fastIndex]];
        }

        slowIndex = 0;
        while (slowIndex != fastIndex) {
            slowIndex = nums[slowIndex];
            fastIndex = nums[fastIndex];
        }

        return slowIndex;
    }
}