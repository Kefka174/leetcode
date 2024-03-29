import java.util.Queue;

class Solution {
    public int findBottomLeftValue(TreeNode root) { // level order traversal
        Queue<TreeNode> nodeQueue = new ArrayDeque<>();
        nodeQueue.add(root);
        TreeNode currentNode = null;
        while (!nodeQueue.isEmpty()) {
            currentNode = nodeQueue.poll();
            if (currentNode.right != null) nodeQueue.add(currentNode.right);
            if (currentNode.left != null) nodeQueue.add(currentNode.left);
        }
        return currentNode.val;
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