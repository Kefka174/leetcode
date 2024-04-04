class Solution {
    public int minimumLength(String s) {
        int leftIndex = 0, rightIndex = s.length() - 1;
        while (leftIndex < rightIndex && s.charAt(leftIndex) == s.charAt(rightIndex)) {
            char currentChar = s.charAt(leftIndex);
            while (leftIndex <= rightIndex && s.charAt(leftIndex) == currentChar) leftIndex++;
            while (leftIndex < rightIndex && s.charAt(rightIndex) == currentChar) rightIndex--;
        }
        return rightIndex - leftIndex + 1;
    }
}