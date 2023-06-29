class Solution {
    public boolean validPalindrome(String s) {
        return isPalindromeWithDeletion(s, 0, s.length() - 1, true);
    }

    private boolean isPalindromeWithDeletion(String s, int startIndex, int endIndex, boolean canDeleteChar) {
        while (startIndex < endIndex) {
            if (s.charAt(startIndex) != s.charAt(endIndex)) {
                if (!canDeleteChar) return false;
                if (endIndex - startIndex > 1) {
                    boolean deleteStart = isPalindromeWithDeletion(s, startIndex + 1, endIndex, false);
                    boolean deleteEnd = isPalindromeWithDeletion(s, startIndex, endIndex - 1, false);
                    return deleteStart || deleteEnd;
                }
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }
}