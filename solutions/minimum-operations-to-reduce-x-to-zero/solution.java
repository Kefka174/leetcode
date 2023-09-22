import java.util.Map;
import javafx.util.Pair;

class Solution {
    // Finds the longest consecutive subArray that leaves the sum of the rest of nums equal to x
    public int minOperationsMaxSubArray(int[] nums, int x) {
        int numsSum = 0;
        for (int num : nums) numsSum += num;

        int currentTotal = 0, currentLength = 0, maxLength = -1;
        for (int i = 0; i < nums.length; i++) {
            currentLength++;
            currentTotal += nums[i];

            while (currentTotal > numsSum - x && currentLength > 0) {
                currentLength--;
                currentTotal -= nums[i - currentLength];
            }

            if (currentTotal == numsSum - x && currentLength > maxLength)
                maxLength = currentLength;
        }

        if (maxLength == -1) return -1;
        return nums.length - maxLength;
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int minOperationsBrute(int[] nums, int x) { // Dynamic with memoization
        Map<Pair<Integer, Pair<Integer, Integer>>, Integer> memo = new HashMap<>();
        return recursiveHelper(nums, x, 0, nums.length - 1, memo);
    }

    private int recursiveHelper(int[] nums, int x, int startIndex, int endIndex, 
                                Map<Pair<Integer, Pair<Integer, Integer>>, Integer> memo) {
        if (x == 0) return 0;
        else if (x < 0 || startIndex > endIndex) return -1;

        Pair<Integer, Pair<Integer, Integer>> xStartEndTrio = new Pair(x, new Pair(startIndex, endIndex));
        if (!memo.containsKey(xStartEndTrio)) {
            int minUsingStart = recursiveHelper(nums, x - nums[startIndex], startIndex + 1, endIndex, memo);
            int minUsingEnd = recursiveHelper(nums, x - nums[endIndex], startIndex, endIndex - 1, memo);
            memo.put(xStartEndTrio, minPositiveNumPlusOne(minUsingStart, minUsingEnd));
        }
        return memo.get(xStartEndTrio);
    }

    private int minPositiveNumPlusOne(int first, int second) {
        boolean firstValid = first != -1, 
                secondValid = second != -1;
        if (!firstValid && !secondValid) return -1;
        else if (!firstValid && secondValid) return second + 1;
        else if (firstValid && !secondValid) return first + 1;
        else return Math.min(first, second) + 1;
    }
}