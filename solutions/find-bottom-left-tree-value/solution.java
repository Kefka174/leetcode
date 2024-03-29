import java.util.Queue;

class Solution {
    public int findBottomLeftValue(TreeNode root) { // level order traversal
        Queue<TreeNode> currentLevel = new ArrayDeque<>();
        Queue<TreeNode> nextLevel = new ArrayDeque<>();
        nextLevel.add(root);
        int leftValueOfCurrentLevel = root.val;
        while (!currentLevel.isEmpty() || !nextLevel.isEmpty()) {
            if (currentLevel.isEmpty()) {
                currentLevel = nextLevel;
                nextLevel = new ArrayDeque<>();
                leftValueOfCurrentLevel = currentLevel.peek().val;
            }

            TreeNode node = currentLevel.poll();
            if (node.left != null) nextLevel.add(node.left);
            if (node.right != null) nextLevel.add(node.right);
        }
        return leftValueOfCurrentLevel;
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