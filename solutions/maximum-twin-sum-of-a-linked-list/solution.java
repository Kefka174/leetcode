import java.util.Deque;

class Solution {
    // Modifies the original list, reversing the first half
    public int pairSumModifyList(ListNode head) { // O(n) time O(1) space
        ListNode fastIndex = head, slowIndex = head;
        ListNode prevSlowIndex = null;
        while (fastIndex != null && fastIndex.next != null) {
            fastIndex = fastIndex.next.next;
            
            ListNode nextSlowIndex = slowIndex.next;
            slowIndex.next = prevSlowIndex;
            prevSlowIndex = slowIndex;
            slowIndex = nextSlowIndex;
        }

        int maxSum = Integer.MIN_VALUE;
        while (slowIndex != null) {
            int sum = slowIndex.val + prevSlowIndex.val;
            if (sum > maxSum) maxSum = sum;
            slowIndex = slowIndex.next;
            prevSlowIndex = prevSlowIndex.next;
        }
        return maxSum;
    }


    /////////////////////////////////////////////////////////////////
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