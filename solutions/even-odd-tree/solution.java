import java.util.Queue;

class Solution {
    public boolean isEvenOddTree(TreeNode root) { // level order traversal
        Queue<TreeNode> currentLevel = new ArrayDeque<>();
        currentLevel.add(root);
        Queue<TreeNode> nextLevel = new ArrayDeque<>();
        Integer prevVal = null;
        boolean onEvenLevel = true;
        while (!currentLevel.isEmpty() || !nextLevel.isEmpty()) {
            if (currentLevel.isEmpty()) {
                currentLevel = nextLevel;
                nextLevel = new ArrayDeque<>();
                prevVal = null;
                onEvenLevel = !onEvenLevel;
            }

            TreeNode currentNode = currentLevel.poll();
            if (currentNode.left != null) nextLevel.add(currentNode.left);
            if (currentNode.right != null) nextLevel.add(currentNode.right);

            boolean hasCorrectParity = onEvenLevel == (currentNode.val % 2 != 0);
            boolean trendingInRightDirection = (prevVal == null) 
                || (!prevVal.equals(currentNode.val) 
                    && onEvenLevel == (prevVal < currentNode.val));
            if (!hasCorrectParity || !trendingInRightDirection) return false;
            
            prevVal = currentNode.val;
        }
        return true;
    }
}

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}