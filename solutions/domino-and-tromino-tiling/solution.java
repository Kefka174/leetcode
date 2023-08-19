import java.util.Map;

class Solution {
    private static final int MOD = (int)Math.pow(10, 9) + 7;

    public int numTilingsIterative(int n) {
        int[] prevNs = {1, 1, 0};
        for (int i = 1; i < n; i++) {
            long answerI = ((long)2 * prevNs[0]) + prevNs[2];

            prevNs[2] = prevNs[1];
            prevNs[1] = prevNs[0];
            prevNs[0] = (int)(answerI % MOD);
        }
        return prevNs[0];
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////
    public int numTilingsRecursive(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return recursiveHelper(n, memo);
    }

    private int recursiveHelper(int n, Map<Integer, Integer> memo) {
        if (n == 0) return 1;
        if (n <= 2) return n;
        
        if (!memo.containsKey(n)) {
            long answerN = ((long)2 * recursiveHelper(n - 1, memo)) + recursiveHelper(n - 3, memo);
            memo.put(n, (int)(answerN % MOD));
        }
        return memo.get(n);
    }
}