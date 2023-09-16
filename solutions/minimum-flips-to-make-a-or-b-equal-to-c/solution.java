class Solution {
    public int minFlips(int a, int b, int c) {
        int flipCount = 0, currentBit = 1;
        for (int i = 0; i < Integer.SIZE; i++) {
            if (((a | b) & currentBit) != (c & currentBit)) {
                if ((c & currentBit) == 0) {
                    if ((a & currentBit) != 0) flipCount++;
                    if ((b & currentBit) != 0) flipCount++;
                }
                else flipCount++;
            }
            currentBit <<= 1;
        }
        return flipCount;
    }
}