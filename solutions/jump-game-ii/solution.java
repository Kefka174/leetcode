class Solution {
    public int jump(int[] nums) { // O(n * v) where v is the value at a given index (effectivly O(n^2))
        int[] minJumpsToEnd = new int[nums.length];
        for (int i = nums.length - 2; i >= 0; i--) {
            int minJumpsFromI = -1; // -1 means it doesn't lead to the end;
            for (int jumpIndex = 1; jumpIndex <= nums[i] && jumpIndex + i < nums.length; jumpIndex++) {
                boolean jumpLeadsToEnd = minJumpsToEnd[i + jumpIndex] != -1;
                boolean jumpIsNewMin = (minJumpsFromI == -1 || minJumpsToEnd[i + jumpIndex] + 1 < minJumpsFromI);
                if (jumpLeadsToEnd && jumpIsNewMin) minJumpsFromI = minJumpsToEnd[i + jumpIndex] + 1;
            }
            minJumpsToEnd[i] = minJumpsFromI;
        }
        return minJumpsToEnd[0];
    }
}