public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slowIndex = head;
        ListNode fastIndex = head;
        while (fastIndex != null && fastIndex.next != null) {
            slowIndex = slowIndex.next;
            fastIndex = fastIndex.next.next;
            if (slowIndex == fastIndex) return true;
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}