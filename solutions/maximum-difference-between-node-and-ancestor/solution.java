class Solution {
    public int maxAncestorDiff(TreeNode root) {
        return recursiveHelper(root, root.val, root.val);
    }

    private int recursiveHelper(TreeNode node, int min, int max) {
        min = Math.min(min, node.val);
        max = Math.max(max, node.val);
        int diff = Math.abs(min - max);

        if (node.left != null) {
            diff = Math.max(diff, recursiveHelper(node.left, min, max));
        }
        if (node.right != null) {
            diff = Math.max(diff, recursiveHelper(node.right, min, max));
        }
        return diff;
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