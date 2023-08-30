class Solution {
    public int compress(char[] chars) {
        int charsIndex = 0, currentCharCount = 1;
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 == chars.length || chars[i] != chars[i + 1]) {
                chars[charsIndex] = chars[i];
                charsIndex++;
                if (currentCharCount > 1) {
                    String charCountString = Integer.toString(currentCharCount);
                    for (int j = 0; j < charCountString.length(); j++) {
                        chars[charsIndex] = charCountString.charAt(j);
                        charsIndex++;
                    }
                    currentCharCount = 1;
                }
            }
            else currentCharCount++;
        }
        return charsIndex;
    }
}