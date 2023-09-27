class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int minCostToPrevStep = 0, minCostToPrevPrevStep = 0;
        for (int i = 2; i < cost.length + 1; i++) {
            int singleStepCost = minCostToPrevStep + cost[i - 1];
            int doubeStepCost = minCostToPrevPrevStep + cost[i - 2];

            minCostToPrevPrevStep = minCostToPrevStep;
            minCostToPrevStep = Math.min(singleStepCost, doubeStepCost);
        }
        return minCostToPrevStep;
    }
}