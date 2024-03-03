import java.util.Queue;

class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        Queue<TreeNode> nodeQueue = new ArrayDeque<>();
        nodeQueue.add(root);
        int sum = 0;
        while (!nodeQueue.isEmpty()) {
            TreeNode currentNode = nodeQueue.poll();
            if (currentNode.val >= low && currentNode.val <= high) {
                sum += currentNode.val;
                if (currentNode.left != null) nodeQueue.add(currentNode.left);
                if (currentNode.right != null) nodeQueue.add(currentNode.right);
            }
            else if (currentNode.val < low && currentNode.right != null) 
                nodeQueue.add(currentNode.right);
            else if (currentNode.left != null) 
                nodeQueue.add(currentNode.left);
        }
        return sum;
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