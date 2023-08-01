class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxStreak = 0;
        int currentStreak = 0;
        for (int num : nums) {
            if (num == 1) {
                currentStreak++;
                if (currentStreak > maxStreak) maxStreak = currentStreak;
            }
            else currentStreak = 0;
        }
        return maxStreak;
    }
}