import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();
        String[] phoneDigitChars = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        List<String> combs = Arrays.asList("");
        for (int i = 0; i < digits.length(); i++) {
            String currentDigitChars = phoneDigitChars[digits.charAt(i) - '2'];
            List<String> combsUsingDigit = new ArrayList<>(combs.size() * currentDigitChars.length());

            for (int j = 0; j < currentDigitChars.length(); j++) {
                char currentChar = currentDigitChars.charAt(j);
                for (String partialComb : combs) {
                    combsUsingDigit.add(partialComb + currentChar);
                }
            }
            combs = combsUsingDigit;
        }
        return combs;
    }
}