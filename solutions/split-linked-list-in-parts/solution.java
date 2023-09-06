class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int listLength = linkedListLength(head);
        ListNode[] parts = new ListNode[k];
        for (int i = 0; i < k; i++) {
            int nodesInPart = (int)Math.ceil((double)listLength / (k - i));
            ListNode index = head;
            for (int j = 1; j < nodesInPart; j++)
                if (index != null) index = index.next;
                
            parts[i] = head;
            if (index != null) {
                head = index.next;
                index.next = null;
            }
            else head = null;
            listLength -= nodesInPart;
        }
        return parts;
    }

    private int linkedListLength(ListNode node) {
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
}


public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}