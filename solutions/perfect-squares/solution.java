import java.util.Arrays;

class Solution {
    public int numSquares(int n) { // O(n * sqrt(n))
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 1, n + 1, Integer.MAX_VALUE);
        for (int i = 1; i < n + 1; i++) {
            int square = 1, oddNum = 3;
            while (square <= i) {
                dp[i] = Math.min(dp[i], dp[i - square] + 1);
                square += oddNum;
                oddNum += 2;
            }
        }
        return dp[n];
    }
}