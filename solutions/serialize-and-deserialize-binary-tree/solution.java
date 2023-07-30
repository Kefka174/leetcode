import java.util.Deque;

public class Codec {
    public String serialize(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        if (root != null) queue.add(root);
        StringBuilder str = new StringBuilder();
        str.append(getNodeVal(root) + ',');

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            str.append(getNodeVal(currentNode.left) + ',');
            str.append(getNodeVal(currentNode.right) + ',');
            
            if (currentNode.left != null) queue.add(currentNode.left);
            if (currentNode.right != null) queue.add(currentNode.right);
        }
        return str.toString();
    }

    private String getNodeVal(TreeNode node) {
        if (node == null) return "Null";
        else return Integer.toString(node.val);
    }

    public TreeNode deserialize(String data) {
        String[] valueStrings = data.split(",");
        int index = 0;

        Deque<TreeNode> parentQueue = new ArrayDeque<>();
        TreeNode root = createNodeFromString(valueStrings[index++]);
        if (root != null) parentQueue.add(root);

        while (index < valueStrings.length) {
            TreeNode currentParent = parentQueue.poll();
            currentParent.left = createNodeFromString(valueStrings[index++]);
            currentParent.right = createNodeFromString(valueStrings[index++]);
            
            if (currentParent.left != null) parentQueue.add(currentParent.left);
            if (currentParent.right != null) parentQueue.add(currentParent.right);
        }
        return root;
    }

    private TreeNode createNodeFromString(String s) {
        if (s.equals("Null")) return null;
        else return new TreeNode(Integer.parseInt(s));
    }
}


public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
