import java.util.Map;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> charCompliments = Map.of(')', '(', ']', '[', '}', '{');
        Deque<Character> openBrackets = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == ')' || currentChar == ']' || currentChar == '}') {
                if (openBrackets.peekFirst() != charCompliments.get(currentChar)) return false;
                openBrackets.pop();
            }
            else openBrackets.push(currentChar);
        }
        return openBrackets.isEmpty();
    }
}