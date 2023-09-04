import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution {
    // Effectively preorder traversal with reversed insertions, building the list
    // from back to front. Could use second stack to build list instead.
    public List<Integer> postorderTraversalIterative(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        if (root != null) {
            Deque<TreeNode> nodeStack = new ArrayDeque<>();
            nodeStack.push(root);
            while (!nodeStack.isEmpty()) {
                TreeNode currentNode = nodeStack.pop();
                list.addFirst(currentNode.val);
                if (currentNode.left != null) nodeStack.push(currentNode.left);
                if (currentNode.right != null) nodeStack.push(currentNode.right);
            }
        }
        return list;
    }


    //////////////////////////////////////////////////////////////////////
    public List<Integer> postorderTraversalRecursive(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) recursiveHelper(root, list);
        return list;
    }

    private void recursiveHelper(TreeNode node, List<Integer> list) {
        if (node.left != null) recursiveHelper(node.left, list);
        if (node.right != null) recursiveHelper(node.right, list);
        list.add(node.val);
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