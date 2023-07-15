import java.util.Collections;
import java.util.Map;

class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> expectedValues = new HashMap<>();
        int longestLength = 1;
        for (int num : arr) {
            int lengthUsingNum = expectedValues.getOrDefault(num, 0) + 1;
            expectedValues.put(num + difference, lengthUsingNum);
            if (lengthUsingNum > longestLength) longestLength = lengthUsingNum;
        }

        return longestLength;
    }
}