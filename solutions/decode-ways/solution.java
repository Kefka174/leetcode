class Solution {
    public int numDecodings(String s) {
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        
        int currentCount = 1, prevCount = 1, prevPrevCount = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 0) {
                if (i - 1 < 0 || digits[i - 1] > 2 || digits[i - 1] == 0) return 0;
                i -= 2;
            }
            else if (i + 1 < digits.length && digits[i + 1] != 0) {
                if (digits[i] <= 2 && (digits[i] != 2 || digits[i + 1] <= 6)) { 
                    // digits[i] can be first digit of a two-digit pair
                    currentCount += prevPrevCount;
                }
                prevPrevCount = prevCount;
                prevCount = currentCount;
            }
        }
        return currentCount;
    }
}