class Solution {
    public boolean isPalindrome(String s) {
        String cleanS = s.replaceAll("[\\W!_]", "").toLowerCase();
        int startIndex = 0;
        int endIndex = cleanS.length() - 1;
        while (startIndex < endIndex) {
            if (cleanS.charAt(startIndex) != cleanS.charAt(endIndex)) return false;

            startIndex++;
            endIndex--;
        }
        return true;
    }
}