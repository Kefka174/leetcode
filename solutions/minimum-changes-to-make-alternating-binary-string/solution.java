class Solution {
    public int minOperations(String s) {
        int zeroFirstOps = 0, oneFirstOps = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == s.charAt(i) - '0') oneFirstOps++;
            else zeroFirstOps++;
        }
        return Math.min(zeroFirstOps, oneFirstOps);
    }
}