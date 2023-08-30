class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;

        ListNode slowIndex = head, fastIndex = head.next;
        while (fastIndex.next != null && fastIndex.next.next != null) {
            fastIndex = fastIndex.next.next;
            slowIndex = slowIndex.next;
        }

        slowIndex.next = slowIndex.next.next;
        return head;
    }
}


public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}