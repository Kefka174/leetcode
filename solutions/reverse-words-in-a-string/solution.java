class Solution {
    public String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder(s.length() + 1);
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i] != "")
                reversed.append(words[i] + " ");
        }
        reversed.deleteCharAt(reversed.length() - 1);

        return reversed.toString();
    }
}