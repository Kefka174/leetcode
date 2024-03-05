import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class Solution {
    public int amountOfTime(TreeNode root, int start) {
        Deque<TreeNode> rootStack = targetNodeRoots(root, start);
        Queue<TreeNode> currentLevel = new ArrayDeque<>(), 
                        nextLevel = new ArrayDeque<>();
        nextLevel.add(rootStack.pop());
        Set<TreeNode> processedNodes = new HashSet<>();
        processedNodes.add(null);
        int time = -1;
        while (!currentLevel.isEmpty() || !nextLevel.isEmpty()) { // bfs
            if (currentLevel.isEmpty()) {
                currentLevel = nextLevel;
                nextLevel = new ArrayDeque<>();
                if (!rootStack.isEmpty()) {
                    nextLevel.add(rootStack.pop());
                }
                time += 1;
            }

            TreeNode currentNode = currentLevel.poll();
            if (!processedNodes.contains(currentNode.left)) {
                nextLevel.add(currentNode.left);
            }
            if (!processedNodes.contains(currentNode.right)) {
                nextLevel.add(currentNode.right);
            }
            processedNodes.add(currentNode);
        }
        return time;
    }

    private Deque<TreeNode> targetNodeRoots(TreeNode root, int target) { // dfs
        Set<TreeNode> processedNodes = new HashSet<>();
        processedNodes.add(null);
        Deque<TreeNode> nodeStack = new ArrayDeque<>();
        nodeStack.add(root);
        while (nodeStack.peek().val != target) {
            if (!processedNodes.contains(nodeStack.peek().left)) {
                nodeStack.push(nodeStack.peek().left);
            }
            else if (!processedNodes.contains(nodeStack.peek().right)) {
                nodeStack.push(nodeStack.peek().right);
            }
            else {
                processedNodes.add(nodeStack.pop());
            }
        }
        return nodeStack;
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