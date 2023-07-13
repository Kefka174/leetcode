import java.util.Map;

class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xParent = null, yParent = null;
        Map<TreeNode, TreeNode> parentNodes = new HashMap<>();
        Map<TreeNode, TreeNode> nextLevelNodes = new HashMap<>();
        nextLevelNodes.put(root, null);
        while (!parentNodes.isEmpty() || !nextLevelNodes.isEmpty()) {
            if (parentNodes.isEmpty()) { // move to next level
                if (xParent != null || yParent != null) return false;

                Map<TreeNode, TreeNode> tmp = parentNodes;
                parentNodes = nextLevelNodes;
                nextLevelNodes = tmp;
            }

            TreeNode currentNode = parentNodes.keySet().iterator().next();
            if (currentNode.val == x) xParent = parentNodes.get(currentNode);
            else if (currentNode.val == y) yParent = parentNodes.get(currentNode);
            
            if (xParent != null && yParent != null && xParent != yParent) return true;

            if (currentNode.left != null) nextLevelNodes.put(currentNode.left, currentNode);
            if (currentNode.right != null) nextLevelNodes.put(currentNode.right, currentNode);
            parentNodes.remove(currentNode);
        }
        return false; // unreachable
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