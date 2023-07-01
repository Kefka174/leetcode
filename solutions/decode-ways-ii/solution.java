class Solution {
    public int numDecodings(String s) {
        int M = 1000000007;
        long currentCount = 1, prevCount = 1, prevPrevCount = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                if (i == 0 || s.charAt(i - 1) > '2' || s.charAt(i - 1) == '0') return 0;
                if (s.charAt(i - 1) == '*') {
                    currentCount *= 2;
                    prevCount *= 2;
                    prevPrevCount *= 2;
                }
                i--;
            }
            else {
                boolean canBeSingleDigit = (i == s.length() - 1 || s.charAt(i + 1) != '0');
                boolean canBeFirstOfPair = digitCanBeFirstOfPair(s, i);

                if (canBeSingleDigit && s.charAt(i) == '*') currentCount *= 9;
                if (canBeFirstOfPair) {
                    if (s.charAt(i) == '1' && s.charAt(i + 1) == '*') 
                        currentCount += 9 * prevPrevCount;
                    else if (s.charAt(i) == '2' && s.charAt(i + 1) == '*') 
                        currentCount += 6 * prevPrevCount;
                    else if (s.charAt(i) == '*' && s.charAt(i + 1) == '*') 
                        currentCount += 15 * prevPrevCount;
                    else if (s.charAt(i) == '*' && s.charAt(i + 1) <= '6') 
                        currentCount += 2 * prevPrevCount;
                    else currentCount += prevPrevCount;
                }
                // problem asks for the answer to be modulo (10^9 + 7) due to memory limitations
                prevPrevCount = prevCount % M;
                prevCount = currentCount % M;
                currentCount = currentCount % M;
            }
        }
        return (int)currentCount;
    }

    private boolean digitCanBeFirstOfPair(String s, int index) {
        if (index == s.length() - 1) return false;
        boolean digitIsLessThan26 = (s.charAt(index) <= '2') && 
                                    (s.charAt(index) != '2' || s.charAt(index + 1) <= '6');
        boolean nextDigitCanBeInPair = (index + 2 == s.length() || s.charAt(index + 2) != '0');
        return digitIsLessThan26 && nextDigitCanBeInPair;
    }
}