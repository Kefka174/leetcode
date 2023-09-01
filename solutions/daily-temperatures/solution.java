import java.util.Deque;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] daysUntilWarmerTemp = new int[temperatures.length];
        Deque<Integer> monoStack = new ArrayDeque<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!monoStack.isEmpty() && temperatures[i] > temperatures[monoStack.peek()]) {
                daysUntilWarmerTemp[monoStack.peek()] = i - monoStack.pop();
            }
            monoStack.push(i);
        }
        return daysUntilWarmerTemp;
    }
}