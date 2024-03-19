class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) return word;
        }
        return "";
    }

    private boolean isPalindrome(String s) {
        int leftIndex = 0, rightIndex = s.length() - 1;
        while (leftIndex < rightIndex) {
            if (s.charAt(leftIndex) != s.charAt(rightIndex)) return false;
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}