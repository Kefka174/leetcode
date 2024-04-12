import java.util.Deque;

class Solution {
    public String makeGood(String s) {
        Deque<Character> charStack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (!charStack.isEmpty() && charStack.peek() != s.charAt(i)
                    && Character.toLowerCase(charStack.peek()) == Character.toLowerCase(s.charAt(i))) {
                charStack.pop();
            }
            else charStack.push(s.charAt(i));
        }
        
        char[] goodString = new char[charStack.size()];
        for (int i = goodString.length - 1; i >= 0; i--) {
            goodString[i] = charStack.pop();
        }
        return new String(goodString);
    }
}