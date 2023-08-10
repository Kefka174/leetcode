class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root != null && root.val == key) return replaceNode(root);
        
        TreeNode keyNodeParent = findNodeParent(root, key);
        if (keyNodeParent != null) {
            if (keyNodeParent.left != null && keyNodeParent.left.val == key)
                keyNodeParent.left = replaceNode(keyNodeParent.left);
            else keyNodeParent.right = replaceNode(keyNodeParent.right);
        }
        return root;
    }

    private TreeNode findNodeParent(TreeNode root, int value) {
        TreeNode currentNode = root;
        TreeNode currentNodeParent = null;
        while (currentNode != null) {
            if (currentNode.val == value) return currentNodeParent;
            else {
                currentNodeParent = currentNode;
                if (currentNode.val > value) currentNode = currentNode.left;
                else currentNode = currentNode.right;
            }
        }
        return null;
    }

    private TreeNode replaceNode(TreeNode node) {
        if (node.left == null) return node.right;
        else if (node.right == null) return node.left;

        TreeNode originalLeft = node.left, originalRight = node.right;
        TreeNode maxLeftChild = node.left;
        TreeNode maxChildParent = null;
        while (maxLeftChild.right != null) {
            maxChildParent = maxLeftChild;
            maxLeftChild = maxLeftChild.right;
        }

        if (maxChildParent != null) {
            maxChildParent.right = maxLeftChild.left;
            maxLeftChild.left = originalLeft;
        }
        maxLeftChild.right = originalRight;

        return maxLeftChild;
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