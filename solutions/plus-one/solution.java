class Solution {
    public int[] plusOne(int[] digits) {
        int digitLength = digits.length;
        if (arrIsAllNines(digits)) digitLength++;

        int[] ret = new int[digitLength];
        boolean carry = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9 && carry) ret[i] = 0;
            else {
                ret[i] = digits[i];
                if (carry) ret[i]++;
                carry = false;
            }
        }
        
        if (carry) ret[0] = 1;
        return ret;
    }

    private boolean arrIsAllNines(int[] arr) {
        for (int num : arr)
            if (num != 9) return false;
        return true;
    }
}