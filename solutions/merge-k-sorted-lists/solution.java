import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) { // O(log(n)*m) log(number of lists) * length of final list
        PriorityQueue<ListNode> nodeHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode node : lists)
            if (node != null) nodeHeap.add(node);

        ListNode head = nodeHeap.peek();
        ListNode currentNode = new ListNode();
        while (!nodeHeap.isEmpty()) {
            currentNode.next = nodeHeap.poll();
            currentNode = currentNode.next;
            if (currentNode.next != null) nodeHeap.add(currentNode.next);
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