import java.util.Deque;

class Solution {
    public String decodeAtIndex(String s, int k) { // O(s.length)
        Deque<StringBuilder> stringStack = new ArrayDeque<>();
        Deque<Long> lengthStack = new ArrayDeque<>();
        StringBuilder currentString = new StringBuilder();
        int index = 0;
        long decodedLength = 0;
        while (decodedLength < k) {
            if (!Character.isDigit(s.charAt(index))) {
                currentString.append(s.charAt(index));
                decodedLength++;
                if (decodedLength == k) 
                    return s.substring(index, index + 1);
            }
            else { // char at index is a digit
                if (!currentString.isEmpty()) {
                    stringStack.push(currentString);
                    lengthStack.push(decodedLength);
                    currentString = new StringBuilder();
                }
                decodedLength *= s.charAt(index) - '0';
                if (decodedLength < k) {
                    stringStack.push(new StringBuilder());
                    lengthStack.push(decodedLength);
                }
            }
            index++;
        }
        
        while (!stringStack.isEmpty()) {
            if (!currentString.isEmpty() && k > lengthStack.peek() && 
                k - lengthStack.peek() <= currentString.length()) {
                k -= lengthStack.peek();
                return currentString.substring(k - 1, k);
            }

            k %= lengthStack.peek();
            if (k == 0) k = lengthStack.pop().intValue();
            else lengthStack.pop();
            currentString = stringStack.pop();
        }
        return currentString.substring(k - 1, k);
    }
}