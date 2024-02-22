class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totalCost = 0;
        for (int i = 0; i < colors.length() - 1; i++) {
            int streakCost = neededTime[i], maxCostInStreak = neededTime[i];
            while (i + 1 < colors.length() && 
                   colors.charAt(i) == colors.charAt(i + 1)) {
                streakCost += neededTime[i + 1];
                maxCostInStreak = Math.max(maxCostInStreak, neededTime[i + 1]);
                i++;
            }
            
            if (streakCost != maxCostInStreak) {
                totalCost += streakCost - maxCostInStreak;
            }
        }
        return totalCost;
    }
}