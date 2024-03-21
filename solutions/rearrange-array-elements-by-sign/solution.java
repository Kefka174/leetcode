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

    
    //////////////////////////////////////////////////////////////////////
    public int[] rearrangeArrayTwoPointer(int[] nums) {
        int[] rearranged = new int[nums.length];
        int positiveIndex = 0, negativeIndex = 1;
        for (int num : nums) {
            if (num >= 0) {
                rearranged[positiveIndex] = num;
                positiveIndex += 2;
            }
            else {
                rearranged[negativeIndex] = num;
                negativeIndex += 2;
            }
        }
        return rearranged;
    }
}