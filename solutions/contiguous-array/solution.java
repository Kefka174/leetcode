import java.util.Map;

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> countIndices = new HashMap<>();
        countIndices.put(0, -1);
        int count = 0, maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) count++;
            else count--;

            if (countIndices.containsKey(count)) {
                maxLength = Math.max(i - countIndices.get(count), maxLength);
            }
            else countIndices.put(count, i);
        }
        return maxLength;
    }
}