class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, previousNode = null;
        int carryingTheOne = 0; // 0 or 1

        while (l1 != null || l2 != null || carryingTheOne != 0) {
            int currentVal = carryingTheOne;
            if (l1 != null) {
                currentVal += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                currentVal += l2.val;
                l2 = l2.next;
            }
            
            if (currentVal > 9) carryingTheOne = 1;
            else carryingTheOne = 0;

            ListNode currentNode = new ListNode(currentVal % 10);
            if (head == null) head = currentNode;
            if (previousNode != null) previousNode.next = currentNode;
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