class Solution {
    public String longestPalindrome(String s) { // O(n^2)
        String longestSubstring = "";
        for (int i = 0; i < s.length(); i++) {
            String iAsMiddle = longestPalindromeFromIndicies(s, i - 1, i + 1);
            if (iAsMiddle.length() > longestSubstring.length())
                longestSubstring = iAsMiddle;

            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                String iAsFirstOfMiddlePair = longestPalindromeFromIndicies(s, i - 1, i + 2);
                if (iAsFirstOfMiddlePair.length() > longestSubstring.length())
                    longestSubstring = iAsFirstOfMiddlePair;
            }
        }
        return longestSubstring;
    }

    private String longestPalindromeFromIndicies(String s, int startIndex, int endIndex) {
        while (startIndex >= 0 && endIndex < s.length() && 
               s.charAt(startIndex) == s.charAt(endIndex)) {
            startIndex--;
            endIndex++;
        }
        return s.substring(startIndex + 1, endIndex);
    }
}