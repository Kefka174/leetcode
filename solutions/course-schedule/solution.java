import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) { // iterative dfs
        Map<Integer, List<Integer>> prereqMap = new HashMap<>();
        for (int[] coursePair : prerequisites) {
            if (!prereqMap.containsKey(coursePair[0])) 
                prereqMap.put(coursePair[0], new ArrayList<>());
            prereqMap.get(coursePair[0]).add(coursePair[1]);
        }

        Set<Integer> visitedCourses = new HashSet<>();
        Set<Integer> parentSet = new HashSet<>();
        Deque<Integer> parentStack = new ArrayDeque<>();
        while (!parentStack.isEmpty() || !prereqMap.isEmpty()) {
            if (parentStack.isEmpty()) 
                parentStack.push(prereqMap.keySet().iterator().next());
            
            int currentCourse = parentStack.peek();
            parentSet.add(currentCourse);
            visitedCourses.add(currentCourse);
            if (prereqMap.containsKey(currentCourse)) { // current course has prereqs
                for (int prereq : prereqMap.get(currentCourse)) {
                    if (parentSet.contains(prereq)) return false;
                    if (!visitedCourses.contains(prereq)) parentStack.push(prereq);
                }
                prereqMap.remove(currentCourse);
            }
            else { // current course has no prereqs
                while (!parentStack.isEmpty() && parentSet.contains(parentStack.peek()))
                    parentSet.remove(parentStack.pop());
            }
        }

        return true;
    }
}