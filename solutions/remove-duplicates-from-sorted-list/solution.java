class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;

        ListNode previousNode = head;
        ListNode currentNode = head.next;
        while (currentNode != null) {
            while (currentNode != null && currentNode.val == previousNode.val) currentNode = currentNode.next;
            previousNode.next = currentNode;
            previousNode = currentNode;
        }
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