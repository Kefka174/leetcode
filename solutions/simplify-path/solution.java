import java.util.Deque;

class Solution {
    public String simplifyPath(String path) {
        Deque pathDeque = new ArrayDeque<>();
        for (String dir : path.split("/")) {
            if (dir.length() != 0 && !dir.equals(".")) {
                if (dir.equals("..")) pathDeque.pollFirst();
                else pathDeque.addFirst(dir);
            }
        }
        
        StringBuilder simplePath = new StringBuilder();
        while (!pathDeque.isEmpty()) 
            simplePath.append("/" + pathDeque.removeLast());
        if (simplePath.length() == 0) return "/";
        return simplePath.toString();
    }
}