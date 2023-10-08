class Solution {
    public int integerBreak(int n) {
        if (n <= 3) return n - 1;
        
        int multTotal = 0, numThrees = 0;
        if (n % 3 == 1) numThrees = (n / 3) - 1;
        else numThrees = n / 3;
        multTotal = (int)Math.pow(3, numThrees);
        n -= 3 * numThrees;

        if (n > 0) multTotal *= n;
        return multTotal;
    }
}