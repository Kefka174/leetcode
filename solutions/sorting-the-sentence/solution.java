class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sordedWords = new String[words.length];
        for (String word : words) {
            int placement = word.charAt(word.length() - 1) - '1';
            sordedWords[placement] = word.substring(0, word.length() - 1);
        }
        return String.join(" ", sordedWords);
    }
}