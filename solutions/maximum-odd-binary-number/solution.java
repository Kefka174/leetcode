class Solution {
    public String maximumOddBinaryNumber(String s) {
        int oneCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') oneCount++;
        }

        StringBuilder ret = new StringBuilder(s.length());
        for (int i = 0; i < s.length() - 1; i++) {
            if (oneCount > 1) {
                ret.append('1');
                oneCount--;
            }
            else ret.append('0');
        }
        ret.append('1');
        return ret.toString();
    }
}