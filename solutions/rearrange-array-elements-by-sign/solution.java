import java.util.Queue;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> positiveNums = new ArrayDeque<>(nums.length / 2);
        Queue<Integer> negativeNums = new ArrayDeque<>(nums.length / 2);
        for (int num : nums) {
            if (num >= 0) positiveNums.add(num);
            else negativeNums.add(num);
        }

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) nums[i] = positiveNums.poll();
            else nums[i] = negativeNums.poll();
        }
        return nums;
    }
}