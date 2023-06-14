import java.util.ArrayDeque;
import java.util.Deque;

class Solution { // inorder traversal
    public int getMinimumDifference(TreeNode root) {
        int minDifference = Integer.MAX_VALUE;
        int prevValue = -1;
        Deque<TreeNode> stack = new ArrayDeque<>();
        digLeft(root, stack);

        while (!stack.isEmpty()) {
            TreeNode currentNode = stack.pop();
            if (prevValue != -1) {
                int currentDiff = currentNode.val - prevValue;
                if (currentDiff < minDifference) minDifference = currentDiff;
            }
            prevValue = currentNode.val;
            if (currentNode.right != null) digLeft(currentNode.right, stack);
        }
        
        return minDifference;
    }

    void digLeft(TreeNode node, Deque<TreeNode> stack) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}


class TreeNode {
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