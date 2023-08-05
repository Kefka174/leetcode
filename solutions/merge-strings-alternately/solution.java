class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder(word1.length() + word2.length());
        int lettersInWord1 = word1.length();
        int lettersInWord2 = word2.length();
        
        while (lettersInWord1 + lettersInWord2 > 0) {
            if (lettersInWord1 > 0) {
                mergedString.append(word1.charAt(word1.length() - lettersInWord1));
                lettersInWord1--;
            }
            if (lettersInWord2 > 0) {
                mergedString.append(word2.charAt(word2.length() - lettersInWord2));
                lettersInWord2--;
            }
        }
        
        return mergedString.toString();
    }
}