class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode previousNode = null;
        ListNode currentNode = head;
        while (currentNode != null) {
            if (currentNode.next != null && currentNode.val == currentNode.next.val) {
                int valToSkip = currentNode.val;
                while (currentNode != null && currentNode.val == valToSkip)  {
                    currentNode = currentNode.next;
                }
            }
            else { // currentNode is a unique value
                if (previousNode == null) head = currentNode;
                else previousNode.next = currentNode;
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        }
        
        if (previousNode == null) return null;
        previousNode.next = currentNode;
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