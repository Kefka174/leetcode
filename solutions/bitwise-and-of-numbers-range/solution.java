class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        for (int i = 0; i < 32; i++) {
            if ((left >> i & 1) == 1 && nextNumWithZeroAtBit(left, i) <= right) {
                left &= ~(1 << i);
            }
        }
        return left;
    }

    private long nextNumWithZeroAtBit(int num, int bit) {
        long nextNum = num;
        for (int i = 0; i < bit; i++) nextNum &= ~(1 << i);
        while ((nextNum >> bit & 1) == 1) {
            nextNum &= ~(1 << bit);
            bit++;
        }
        nextNum |= ((long)1 << bit);
        return nextNum;
    }
}