import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.Deque;
import javafx.util.Pair;

class Solution {
    public int minJumpsBFS(int[] arr) { // times out
        Map<Integer, List<Integer>> valueIndicies = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!valueIndicies.containsKey(arr[i])) valueIndicies.put(arr[i], new ArrayList<>());
            valueIndicies.get(arr[i]).add(i);
        }
        Set<Integer> visitedIndicesSet = new HashSet<>();
        visitedIndicesSet.add(0);
        Deque<Pair<Integer, Integer>> indiciesToVisitQueue = new ArrayDeque<>(); // pair of index, jumpCount
        indiciesToVisitQueue.add(new Pair(0, 0));

        while (!indiciesToVisitQueue.isEmpty()) {
            int currentIndex = indiciesToVisitQueue.peekFirst().getKey();
            int jumpCount = indiciesToVisitQueue.peekFirst().getValue();
            indiciesToVisitQueue.remove();

            if (currentIndex == arr.length - 1) return jumpCount;
            // jump backwards and forwards
            addToSetAndQueue(currentIndex - 1, jumpCount + 1, visitedIndicesSet, indiciesToVisitQueue);
            addToSetAndQueue(currentIndex + 1, jumpCount + 1, visitedIndicesSet, indiciesToVisitQueue);
            // jump to similar vals
            for (int indexWithCurrentVal : valueIndicies.get(arr[currentIndex])) {
                if (indexWithCurrentVal != currentIndex) {
                    addToSetAndQueue(indexWithCurrentVal, jumpCount + 1, visitedIndicesSet, indiciesToVisitQueue);
                }
            }
        }
        return arr.length - 1; // unreachable
    }

    private void addToSetAndQueue(int index, int jumpCount, Set<Integer> visitedSet, Deque<Pair<Integer, Integer>> pairDequeue) {
        if (index > 0 && !visitedSet.contains(index)) {
            pairDequeue.add(new Pair(index, jumpCount));
            visitedSet.add(index);
        }
    }
}