import java.util.Deque;

class Solution {
    public int pairSumStack(ListNode head) { // O(n) time and space
        Deque<Integer> valueStack = new ArrayDeque<>();
        ListNode fastIndex = head, slowIndex = head;
        while (fastIndex != null && fastIndex.next != null) {
            fastIndex = fastIndex.next.next;
            valueStack.push(slowIndex.val);
            slowIndex = slowIndex.next;
        }

        int maxSum = Integer.MIN_VALUE;
        while (!valueStack.isEmpty()) {
            int sum = slowIndex.val + valueStack.pop();
            if (sum > maxSum) maxSum = sum;
            slowIndex = slowIndex.next;
        }
        return maxSum;
    }
}


public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}