import javafx.util.Pair;

class Solution {
    public int getSum(int a, int b) {
        int sum = 0;
        boolean carry = false;
        for (int i = 0; i < 32; i++) {
            boolean aBit = getBit(a, i);
            boolean bBit = getBit(b, i);
            Pair<Boolean, Boolean> bitAndCarry = fullAdder(aBit, bBit, carry);

            sum |= bitToInt(bitAndCarry.getKey(), i);
            carry = bitAndCarry.getValue();
        }

        return sum;
    }

    // returns pair of (sum, carry)
    private Pair<Boolean, Boolean> fullAdder(boolean a, boolean b, boolean carry) {
        Pair<Boolean, Boolean> firstHalf = halfAdder(a, b);
        Pair<Boolean, Boolean> secondHalf = halfAdder(firstHalf.getKey(), carry);

        boolean sum = secondHalf.getKey();
        boolean carryOut = firstHalf.getValue() | secondHalf.getValue();
        return new Pair(sum, carryOut);
    }

    // returns pair of (sum, carry)
    private Pair<Boolean, Boolean> halfAdder(boolean a, boolean b) {
        boolean sum = a ^ b;
        boolean carry = a & b;
        return new Pair(sum, carry);
    }

    private boolean getBit(int num, int index) {
        int bit = num>>index & 1;
        if (bit == 1) return true;
        else return false;
    }

    private int bitToInt(boolean bit, int index) {
        int num = bit ? 1 : 0;
        return num << index;
    }
}