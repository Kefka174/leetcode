class Solution {
    public int pivotInteger(int n) {
        // simplified from sum of arithmetic subsequence formula
        // n = (n / 2) * [ 2a + (n − 1)d]
        double pivot = Math.sqrt((n * (n + 1) / 2));
        if (pivot % 1 == 0) return (int)pivot;
        else return -1;
    }
}