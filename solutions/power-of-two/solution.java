class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        boolean foundOneBit = false;
        for (int i = 0; i < 32; i++) {
            if ((n >> i & 1) == 1) {
                if (!foundOneBit) foundOneBit = true;
                else return false;
            }
        }
        return foundOneBit;
    }
}