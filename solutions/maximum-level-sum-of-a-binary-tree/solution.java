import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> levelQueue = new LinkedList<>();
        Queue<TreeNode> nextLevelQueue = new LinkedList<>();
        levelQueue.add(root);
        int maxSum = root.val;
        int maxSumLevel = 1;
        int currentLevel = 1;
        int currentLevelSum = 0;

        while (!levelQueue.isEmpty()) {
            TreeNode currentNode = levelQueue.remove();
            currentLevelSum += currentNode.val;
            if (currentNode.left != null) nextLevelQueue.add(currentNode.left);
            if (currentNode.right != null) nextLevelQueue.add(currentNode.right);

            if (levelQueue.isEmpty()) { // move to next level
                levelQueue = nextLevelQueue;
                nextLevelQueue = new LinkedList<>();
                if (currentLevelSum > maxSum) {
                    maxSum = currentLevelSum;
                    maxSumLevel = currentLevel;
                }
                currentLevel++;
                currentLevelSum = 0;
            }
        }
        return maxSumLevel;
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