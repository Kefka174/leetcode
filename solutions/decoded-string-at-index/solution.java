import java.util.Deque;

class Solution {
    public String decodeAtIndex(String s, int k) {
        Deque<Long> lengthStack = new ArrayDeque<>();
        long decodedLength = 0;
        while (decodedLength < k) {
            if (!Character.isDigit(s.charAt(lengthStack.size()))) decodedLength++;
            else decodedLength *= s.charAt(lengthStack.size()) - '0';
            lengthStack.push(decodedLength);
        }
        
        while (k != 0 || Character.isDigit(s.charAt(lengthStack.size())))
            k %= lengthStack.pop();
        
        return s.substring(lengthStack.size(), lengthStack.size() + 1);
    }
}