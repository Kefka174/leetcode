class Solution {
    public String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder(s.length() + 1);
        for (String word : s.split(" ")) {
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed.append(word.charAt(i));
            }
            reversed.append(" ");
        }
        reversed.deleteCharAt(reversed.length() - 1);
        return reversed.toString();
    }
}