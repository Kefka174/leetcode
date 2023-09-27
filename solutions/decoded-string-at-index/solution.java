import java.util.Deque;

class Solution {
    public String decodeAtIndexBrute(String s, int k) {
        Deque<int[]> loopStack = new ArrayDeque<>();
        int index = 0;
        while (k > 0) {
            if (Character.isDigit(s.charAt(index))) {
                if (loopStack.isEmpty() || index != loopStack.peek()[1]) {
                    loopStack.push(new int[] {s.charAt(index) - '1', index});
                    index = -1;
                }
                else if (loopStack.peek()[0] == 1) loopStack.pop();
                else {
                    loopStack.peek()[0]--;
                    index = -1;
                }
            }
            else k--;
            index++;
        }
        return s.substring(index - 1, index);
    }
}