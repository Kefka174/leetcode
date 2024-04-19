import java.util.Queue;

class Solution {
    // iterative level order traversal
    public TreeNode addOneRow(TreeNode root, int val, int targetDepth) {
        if (targetDepth == 1) return new TreeNode(val, root, null);

        Queue<TreeNode> targetDepthParentNodes = getNodesAtLevel(root, targetDepth - 1);
        for (TreeNode node : targetDepthParentNodes) {
            node.left = new TreeNode(val, node.left, null);
            node.right = new TreeNode(val, null, node.right);
        }
        
        return root;
    }

    private Queue<TreeNode> getNodesAtLevel(TreeNode root, int level) {
        Queue<TreeNode> currentLevel = new LinkedList<>();
        Queue<TreeNode> nextLevel = new LinkedList<>();
        currentLevel.add(root);
        int depth = 1;
        while (depth < level) {
            TreeNode current = currentLevel.poll();
            if (current.left != null) nextLevel.add(current.left);
            if (current.right != null) nextLevel.add(current.right);

            if (currentLevel.isEmpty()) {
                currentLevel = nextLevel;
                nextLevel = new LinkedList<>();
                depth++;
            }
        }
        return currentLevel;
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