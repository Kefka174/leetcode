import java.util.Arrays;
import java.util.Deque;

class Solution {
    public int tribonacci(int n) {
        if (n < 2) return n;
        if (n == 2) return 1;

        Deque<Integer> prevNums = new ArrayDeque<>(Arrays.asList(0, 1, 1));
        int queueSum = 2;
        for (int i = 3; i < n; i++) {
            prevNums.add(queueSum);
            queueSum = (queueSum * 2) - prevNums.poll();
        }
        return queueSum;
    }
}