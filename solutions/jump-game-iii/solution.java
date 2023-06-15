import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean canReachRecursive(int[] arr, int start) {
        if (arr[start] == 0) return true;
        
        int leftJumpIndex = start + arr[start];
        int rightJumpIndex = start - arr[start];
        arr[start] *= -1;

        boolean leftReaches = false, rightReaches = false;
        if (leftJumpIndex < arr.length && leftJumpIndex >= 0 && arr[leftJumpIndex] >= 0) 
            leftReaches = canReachRecursive(arr, leftJumpIndex);
        if (rightJumpIndex < arr.length && rightJumpIndex >= 0 && arr[rightJumpIndex] >= 0) 
            rightReaches = canReachRecursive(arr, rightJumpIndex);

        return leftReaches || rightReaches;
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public boolean canReach(int[] arr, int start) { // O(n) dfs
        Set<Integer> visitedIndices = new HashSet<>();
        Deque<Integer> indiciesToVisit = new ArrayDeque<>();
        visitedIndices.add(start);
        indiciesToVisit.push(start);

        while (!indiciesToVisit.isEmpty()) {
            int currentIndex = indiciesToVisit.pop();
            if (arr[currentIndex] == 0) return true;

            checkIndexAndAddToStack(currentIndex + arr[currentIndex], arr.length, visitedIndices, indiciesToVisit);
            checkIndexAndAddToStack(currentIndex - arr[currentIndex], arr.length, visitedIndices, indiciesToVisit);
        }
        return false;
    }

    void checkIndexAndAddToStack(int index, int arrLength, Set<Integer> visitedIndices, Deque<Integer> indiciesToVisit) {
        boolean canJumpToIndex = index < arrLength && index >=0 && !visitedIndices.contains(index);
        if (canJumpToIndex) {
            visitedIndices.add(index);
            indiciesToVisit.push(index);
        }
    }
}