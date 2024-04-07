class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode list2Tail = list2;
        while (list2Tail.next != null) list2Tail = list2Tail.next;

        int index = 0;
        ListNode currentNode = list1;
        while (index < a - 1) {
            currentNode = currentNode.next;
            index++;
        }
        ListNode aNode = currentNode;
        while (index < b + 1) {
            currentNode = currentNode.next;
            index++;
        }
        
        aNode.next = list2;
        list2Tail.next = currentNode;
        return list1;
    }
}


public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}