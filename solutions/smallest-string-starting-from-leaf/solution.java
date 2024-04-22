import java.util.Deque;

class Solution {
    public String smallestFromLeaf(TreeNode root) {
        return recursiveHelper(root, new LinkedList<>());
    }

    private String recursiveHelper(TreeNode node, Deque<Character> charStack) {
        if (node == null) return "";

        charStack.push((char) (node.val + 97));
        String str;
        if (node.left == node.right) str = charStackToString(charStack);
        else {
            String leftString = recursiveHelper(node.left, charStack);
            String rightString = recursiveHelper(node.right, charStack);
            if (!leftString.isEmpty() && !rightString.isEmpty()) {
                str = smallerLexicographicString(leftString, rightString);
            }
            else if (!leftString.isEmpty()) str = leftString;
            else str = rightString;
        }
        charStack.pop();
        return str;
    }

    private String charStackToString(Deque<Character> charStack) {
        StringBuilder str = new StringBuilder(charStack.size());
        for (char c : charStack) str.append(c);
        return str.toString();
    }

    private String smallerLexicographicString(String s1, String s2) {
        if (s1.length() > s2.length()) { // makes s1 the shorter string
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) < s2.charAt(i)) return s1;
            else if (s1.charAt(i) > s2.charAt(i)) return s2;
        }
        return s1;
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