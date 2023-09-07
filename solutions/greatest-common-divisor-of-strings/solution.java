class Solution {
    public String gcdOfStrings(String longerStr, String shorterStr) {
        if (shorterStr.length() > longerStr.length()) { // make longerStr the longest
            String temp = longerStr;
            longerStr = shorterStr;
            shorterStr = temp;
        }

        String gcd = "";
        StringBuilder partialDivisor = new StringBuilder(shorterStr.length());
        for (int i = 0; i < shorterStr.length(); i++) {
            if (longerStr.charAt(i) != shorterStr.charAt(i)) return "";

            partialDivisor.append(longerStr.charAt(i));
            if (longerStr.length() % partialDivisor.length() == 0 &&
                shorterStr.length() % partialDivisor.length() == 0)
                gcd = partialDivisor.toString();
        }

        if (!isDivisor(partialDivisor.toString(), gcd.length(), gcd) ||
            !isDivisor(longerStr, shorterStr.length(), gcd))
            return "";
        return gcd;
    }

    private boolean isDivisor(String string, int startIndex, String divisor) {
        for (int i = startIndex; i < string.length(); i++) {
            if (string.charAt(i) != divisor.charAt(i % divisor.length()))
                return false;
        }
        return true;
    }
}