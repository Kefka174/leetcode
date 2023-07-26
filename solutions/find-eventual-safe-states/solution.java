import java.util.Deque;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) { // iterative dfs
        Set<Integer> nodesToVisit = new HashSet<>();
        for (int i = 0; i < graph.length; i++) nodesToVisit.add(i);
        boolean[] safeNodes = new boolean[graph.length];

        Deque<Integer> processStack = new ArrayDeque<>();
        while (!nodesToVisit.isEmpty() || !processStack.isEmpty()) {
            if (processStack.isEmpty()) 
                processStack.push(nodesToVisit.iterator().next());

            int currentNode = processStack.peek();
            if (nodesToVisit.contains(currentNode)) {
                nodesToVisit.remove(currentNode);
                for (int neighbor : graph[currentNode]) 
                    if (nodesToVisit.contains(neighbor)) processStack.push(neighbor);
            }
            else {
                boolean currentNodeIsSafe = true;
                for (int neighbor : graph[currentNode]) {
                    if (safeNodes[neighbor] == false) currentNodeIsSafe = false;
                }
                if (currentNodeIsSafe) safeNodes[currentNode] = true;
                processStack.pop();
            }
        }

        List<Integer> safeList = new ArrayList<>();
        for (int i = 0; i < safeNodes.length; i++)
            if (safeNodes[i] == true) safeList.add(i);
        return safeList;
    }
}