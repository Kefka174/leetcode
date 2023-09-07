class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode index = head, prevIndex = null;
        for (int i = 0; i < left - 1; i++) {
            prevIndex = index;
            index = index.next;
        }

        ListNode indexBeforeReverse = prevIndex;
        ListNode firstReversedIndex = index;
        prevIndex = index;
        index = index.next;
        for (int i = left; i < right; i++) {
            ListNode nextNode = index.next;
            index.next = prevIndex;
            prevIndex = index;
            index = nextNode;
        }
        firstReversedIndex.next = index;
        if (left == 1) return prevIndex; // head was reversed

        indexBeforeReverse.next = prevIndex;
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