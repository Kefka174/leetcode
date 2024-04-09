import java.util.Map;

class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer, ListNode> firstNodeWithPrefix = new HashMap<>();
        Map<ListNode, Integer> nodePrefixes = new HashMap<>();
        ListNode currentNode = head, emptyHead = new ListNode(0, head);
        firstNodeWithPrefix.put(0, emptyHead);
        int prefixSum = 0;
        while (currentNode != null) {
            prefixSum += currentNode.val;
            if (!firstNodeWithPrefix.containsKey(prefixSum)) {
                firstNodeWithPrefix.put(prefixSum, currentNode);
                nodePrefixes.put(currentNode, prefixSum);
            }
            else {
                removeNodes(prefixSum, currentNode, firstNodeWithPrefix, nodePrefixes);
            }
            currentNode = currentNode.next;
        }
        return emptyHead.next;
    }

    private void removeNodes(int prefixSum, ListNode stopNode, 
            Map<Integer, ListNode> firstNodeWithPrefix, Map<ListNode, Integer> nodePrefixes) {
        ListNode indexNode = firstNodeWithPrefix.get(prefixSum).next;
        while (indexNode != stopNode) {
            if (nodePrefixes.containsKey(indexNode)) {
                firstNodeWithPrefix.remove(nodePrefixes.get(indexNode));
                nodePrefixes.remove(indexNode);
            }
            indexNode = indexNode.next;
        }
        firstNodeWithPrefix.get(prefixSum).next = stopNode.next;
    }
}


public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}