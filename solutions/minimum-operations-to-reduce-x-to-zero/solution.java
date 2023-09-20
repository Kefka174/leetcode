import java.util.Map;
import javafx.util.Pair;

class Solution {
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