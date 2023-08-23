class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = Integer.MAX_VALUE;
        for (int num : nums) {
            int closestABS = Math.abs(closest);
            int numABS = Math.abs(num);

            if (numABS < closestABS || num == closestABS) 
                closest = num;
        }
        return closest;
    }
}