import java.util.Collections;
import java.util.Map;

class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> expectedValues = new HashMap<>();
        for (int num : arr) {
            int lengthUsingNum = 1;
            if (expectedValues.containsKey(num)) {
                lengthUsingNum = expectedValues.get(num) + 1;
                expectedValues.remove(num);
            }

            if (!expectedValues.containsKey(num + difference) ||
                expectedValues.get(num + difference) < lengthUsingNum)
                expectedValues.put(num + difference, lengthUsingNum);
        }

        return Collections.max(expectedValues.values());
    }
}