import java.util.List;
import java.util.Map;

class Solution {
    public Node copyRandomList(Node head) { // O(n) time and space
        if (head == null) return null;

        Node newHead = new Node(head.val);
        Map<Node, Node> oldToNewNode = new HashMap<>();
        oldToNewNode.put(head, newHead);

        Node listIndex = head.next, newListIndex = newHead;
        while (listIndex != null) {
            newListIndex.next = new Node(listIndex.val);
            oldToNewNode.put(listIndex, newListIndex.next);

            newListIndex = newListIndex.next;
            listIndex = listIndex.next;
        }

        listIndex = head;
        newListIndex = newHead;
        while (listIndex != null) {
            newListIndex.random = oldToNewNode.get(listIndex.random);

            listIndex = listIndex.next;
            newListIndex = newListIndex.next;
        }

        return newHead;
    }
}


class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}