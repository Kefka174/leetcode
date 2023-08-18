class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode prevNode = null;
        ListNode currenntNode = head;
        while (currenntNode != null && currenntNode.val < x) {
            prevNode = currenntNode;
            currenntNode = currenntNode.next;
        }

        ListNode preXNode = prevNode;
        while (currenntNode != null) {
            if (currenntNode.val < x) {
                prevNode.next = currenntNode.next;

                if (preXNode != null) {
                    currenntNode.next = preXNode.next;
                    preXNode.next = currenntNode;
                    preXNode = preXNode.next;
                }
                else {
                    currenntNode.next = head;
                    head = currenntNode;
                    preXNode = head;
                }
                currenntNode = prevNode;
            }
            prevNode = currenntNode;
            currenntNode = currenntNode.next;
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