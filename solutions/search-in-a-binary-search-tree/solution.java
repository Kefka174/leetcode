class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode currentNode = root;
        while (currentNode != null && currentNode.val != val) {
            if (currentNode.val > val) currentNode = currentNode.left;
            else currentNode = currentNode.right;
        }
        return currentNode;
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