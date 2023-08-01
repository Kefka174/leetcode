import java.util.Deque;

class Solution {
    public int longestOnes(int[] nums, int k) {
        Deque<Integer> zeroQueue = new ArrayDeque<>(k + 1);
        int onesSinceLastZero = 0;
        int maxStreak = 0, currentStreak = 0;
        for (int num : nums) {
            onesSinceLastZero++;
            currentStreak++;

            if (num == 0) {
                zeroQueue.add(onesSinceLastZero);
                onesSinceLastZero = 0;
                if (zeroQueue.size() > k) 
                    currentStreak -= zeroQueue.poll();
            }
            
            if (currentStreak > maxStreak) maxStreak = currentStreak;
        }
        return maxStreak;
    }
}