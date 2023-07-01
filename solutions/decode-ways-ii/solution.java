class Solution {
    public int numDecodings(String s) {
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
                boolean canBeSingle = (i == s.length() - 1 || s.charAt(i + 1) != '0');
                boolean canBeFirstOfPair = (i < s.length() - 1 && s.charAt(i) != '0') && 
                                        (i + 2 == s.length() || s.charAt(i + 2) != '0');
                if (canBeSingle) {
                    if (s.charAt(i) == '*') currentCount *= 9;
                }
                if (canBeFirstOfPair) {
                    switch (s.charAt(i)) {
                        case '1':
                            if (s.charAt(i + 1) == '*') currentCount += 9 * prevPrevCount;
                            else currentCount += prevPrevCount;
                            break;
                        case '2':
                            if (s.charAt(i + 1) == '*') currentCount += 6 * prevPrevCount;
                            else if (s.charAt(i + 1) <= '6') currentCount += prevPrevCount;
                            break;
                        case '*':
                            if (s.charAt(i + 1) == '*') currentCount += 15 * prevPrevCount;
                            else if (s.charAt(i + 1) > '6') currentCount += prevPrevCount;
                            else currentCount += 2 * prevPrevCount;
                            break;
                    }
                }
                prevPrevCount = prevCount % 1000000007;
                prevCount = currentCount % 1000000007;
                currentCount = currentCount % 1000000007;
            }
        }
        return (int)currentCount;
    }
}