import java.util.Queue;
import javafx.util.Pair;

class Solution {
    public int longestZigZag(TreeNode root) { // iterative dfs
        Queue<Pair<TreeNode, Boolean>> nodeQueue = new ArrayDeque<>();
        nodeQueue.add(new Pair(root, true));
        nodeQueue.add(new Pair(root, false));

        int maxLength = 0;
        while (!nodeQueue.isEmpty()) {
            TreeNode currentNode = nodeQueue.peek().getKey();
            boolean goingLeft = nodeQueue.poll().getValue();
            int zigZagLength = -1;
            while (currentNode != null) {
                if (goingLeft) currentNode = currentNode.left;
                else currentNode = currentNode.right;
                
                zigZagLength++;
                goingLeft = !goingLeft;
                nodeQueue.add(new Pair(currentNode, !goingLeft));
            }
            if (zigZagLength > maxLength) maxLength = zigZagLength;
        }
        return maxLength;
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