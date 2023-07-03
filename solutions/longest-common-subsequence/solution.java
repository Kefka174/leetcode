import java.util.Map;
import javafx.util.Pair;

class Solution {
    public int longestCommonSubsequenceIterative(String text1, String text2) {
        if (text2.length() > text1.length()) { // swaps so text2 is shorter
            String temp = text1;
            text1 = text2;
            text2 = temp;
        }

        int[] currentRow = new int[text2.length() + 1];

        for (int i = 1; i <= text1.length(); i++) {
            int prevRow = 0, prevRowCol = 0;
            for (int j = 1; j <= text2.length(); j++) {
                prevRowCol = prevRow;
                prevRow = currentRow[j];
                if (text1.charAt(i - 1) == text2.charAt(j - 1))
                    currentRow[j] = 1 + prevRowCol;
                else 
                    currentRow[j] = Math.max(prevRow, currentRow[j - 1]);
            }
        }

        return currentRow[text2.length()];
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int longestCommonSubsequenceRecursive(String text1, String text2) {
        Map<Pair<Integer, Integer>, Integer> memo = new HashMap<>();
        return recursiveHelper(text1, text2, 0, 0, memo);
    }

    private int recursiveHelper(String s1, String s2, int index1, int index2, Map<Pair<Integer, Integer>, Integer> memo) {
        if (index1 == s1.length() || index2 == s2.length()) return 0;
        Pair<Integer, Integer> memoKey = new Pair(index1, index2);
        if (memo.containsKey(memoKey)) return memo.get(memoKey);

        int total = 0;
        if (s1.charAt(index1) == s2.charAt(index2)) 
            total = 1 + recursiveHelper(s1, s2, index1 + 1, index2 + 1, memo);
        else {
            int skip1 = recursiveHelper(s1, s2, index1 + 1, index2, memo);
            int skip2 = recursiveHelper(s1, s2, index1, index2 + 1, memo);
            total = Math.max(skip1, skip2);
        }

        memo.put(memoKey, total);
        return total;
    }
}