import java.util.Map;

class Solution {
    public int numTilingsRecursive(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return recursiveHelper(n, memo);
    }

    private int recursiveHelper(int n, Map<Integer, Integer> memo) {
        if (n == 0) return 1;
        if (n <= 2) return n;
        
        if (!memo.containsKey(n)) {
            long answerN = ((long)2 * recursiveHelper(n - 1, memo)) + recursiveHelper(n - 3, memo);
            memo.put(n, (int)(answerN % 1000000007));
        }
        return memo.get(n);
    }
}