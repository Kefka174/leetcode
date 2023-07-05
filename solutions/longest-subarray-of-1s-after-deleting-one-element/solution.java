class Solution {
    public int longestSubarray(int[] nums) {
        int currentStreak = 0, prevStreak = 0, gapSize = 0;
        int longestLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) currentStreak++;
            else {
                if (gapSize < 2 && currentStreak + prevStreak > longestLength) 
                    longestLength = currentStreak + prevStreak;

                gapSize = 1;
                while (i + 1 < nums.length && nums[i + 1] == 0) {
                    gapSize++;
                    i++;
                }

                prevStreak = currentStreak;
                currentStreak = 0;
            }

            if (currentStreak > longestLength) longestLength = currentStreak;
        }

        if (gapSize == 0) longestLength--;
        else if (gapSize == 1 && currentStreak + prevStreak > longestLength) 
            longestLength = currentStreak + prevStreak;
        return longestLength;
    }
}