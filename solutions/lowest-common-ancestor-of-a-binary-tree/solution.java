import java.util.Deque;

class Solution {
    public TreeNode lowestCommonAncestorRecursive(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q || root == null) return root;

        TreeNode nodeInLeft = lowestCommonAncestorRecursive(root.left, p, q);
        TreeNode nodeInRight = lowestCommonAncestorRecursive(root.right, p, q);
        
        if (nodeInLeft != null && nodeInRight != null) return root;
        if (nodeInLeft != null) return nodeInLeft;
        return nodeInRight;
    }


    ////////////////////////////////////////////////////////////////////////////////
    public TreeNode lowestCommonAncestorIterative(TreeNode root, TreeNode p, TreeNode q) {
        Deque<TreeNode> nodeStack = new ArrayDeque<>();
        digLeft(root, nodeStack);
        Deque<TreeNode> ancestorStack = null;

        while (!nodeStack.isEmpty()) { // modified inorder traversal
            TreeNode currentNode = nodeStack.pop();
            if (ancestorStack != null && nodeStack.size() + 1 < ancestorStack.size())
                ancestorStack.pop();
            
            if (currentNode == p || currentNode == q) {
                if (ancestorStack == null) {
                    ancestorStack = new ArrayDeque<>(nodeStack);
                    ancestorStack.push(currentNode);
                }
                else return ancestorStack.peek();
            }

            if (currentNode.right != null) 
                digLeft(currentNode.right, nodeStack);
        }
        return root;
    }

    private void digLeft(TreeNode node, Deque<TreeNode> stack) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}


public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}