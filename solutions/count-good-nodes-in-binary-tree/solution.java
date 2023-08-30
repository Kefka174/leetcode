import java.util.Deque;
import javafx.util.Pair;

class Solution {
    public int goodNodesRecursiveDFS(TreeNode root) {
        return recursiveHelper(root, Integer.MIN_VALUE);
    }

    private int recursiveHelper(TreeNode node, int maxValue) {
        int goodNodeCount = 0;
        if (node.val >= maxValue) {
            goodNodeCount++;
            maxValue = node.val;
        }
        if (node.left != null)
            goodNodeCount += recursiveHelper(node.left, maxValue);
        if (node.right != null)
            goodNodeCount += recursiveHelper(node.right, maxValue);
        return goodNodeCount;
    }


    ///////////////////////////////////////////////////////////////////////////
    public int goodNodesIterativeDFS(TreeNode root) {
        int goodNodeCount = 0;
        Deque<Pair<TreeNode, Integer>> nodeStack = new ArrayDeque<>();
        nodeStack.push(new Pair(root, Integer.MIN_VALUE));
        while (!nodeStack.isEmpty()) {
            TreeNode currentNode = nodeStack.peek().getKey();
            int currentMaxValue = nodeStack.pop().getValue();

            if (currentNode.val >= currentMaxValue) {
                goodNodeCount++;
                currentMaxValue = currentNode.val;
            }
            if (currentNode.left != null) 
                nodeStack.push(new Pair(currentNode.left, currentMaxValue));
            if (currentNode.right != null) 
                nodeStack.push(new Pair(currentNode.right, currentMaxValue));
        }
        return goodNodeCount;
    }
}


public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}