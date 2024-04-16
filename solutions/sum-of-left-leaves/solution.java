class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int total = 0;
        boolean hasLeftLeaf = root.left != null && root.left.left == null 
                              && root.left.right == null;
        if (hasLeftLeaf) total += root.left.val;
        else if (root.left != null) total += sumOfLeftLeaves(root.left);
        if (root.right != null) total += sumOfLeftLeaves(root.right);
        return total;
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