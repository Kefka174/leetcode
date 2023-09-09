import java.util.Arrays;

class Solution {
    public int minDistance(String word1, String word2) {
        int[][] memo = new int[word1.length() + 1][word2.length() + 1];
        for (int[] row : memo)
            Arrays.fill(row, -1);
        return recursiveHelper(word1, 0, word2, 0, memo);
    }

    private int recursiveHelper(String word1, int word1Index, String word2, int word2Index, int[][] memo) {
        if (memo[word1Index][word2Index] == -1) {
            if (word1Index == word1.length() && word2Index == word2.length())
                memo[word1Index][word2Index] = 0;
            else if (word1Index == word1.length())
                memo[word1Index][word2Index] = word2.length() - word2Index;
            else if (word2Index == word2.length())
                memo[word1Index][word2Index] = word1.length() - word1Index;
            else {
                if (word1.charAt(word1Index) == word2.charAt(word2Index))
                    memo[word1Index][word2Index] = recursiveHelper(word1, word1Index + 1, word2, word2Index + 1, memo);
                else {
                    int replace = recursiveHelper(word1, word1Index + 1, word2, word2Index + 1, memo);
                    int delete = recursiveHelper(word1, word1Index + 1, word2, word2Index, memo);
                    int insert = recursiveHelper(word1, word1Index, word2, word2Index + 1, memo);

                    memo[word1Index][word2Index] = 1 + Math.min(Math.min(replace, delete), insert);
                }
            }
        }
        return memo[word1Index][word2Index];
    }
}