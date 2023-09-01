import java.util.Deque;
import java.util.List;

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return leafSequence(root1).equals(leafSequence(root2));
    }

    private List<Integer> leafSequence(TreeNode root) {
        List<Integer> leafs = new ArrayList<>();
        Deque<TreeNode> nodeStack = new ArrayDeque<>();
        nodeStack.push(root);
        while (!nodeStack.isEmpty()) {
            TreeNode currentNode = nodeStack.pop();
            if (currentNode.left == null && currentNode.right == null)
                leafs.add(currentNode.val);
            else {
                if (currentNode.left != null) 
                    nodeStack.push(currentNode.left);
                if (currentNode.right != null)
                    nodeStack.push(currentNode.right);
            }
        }
        return leafs;
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