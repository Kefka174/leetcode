import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.Deque;
import javafx.util.Pair;

class Solution {
    public int minJumpsBFS(int[] arr) { // O(n)
        Map<Integer, List<Integer>> valueIndicies = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!valueIndicies.containsKey(arr[i])) valueIndicies.put(arr[i], new ArrayList<>());
            valueIndicies.get(arr[i]).add(i);
        }
        Set<Integer> visitedValues = new HashSet<>();
        Set<Integer> visitedIndices = new HashSet<>();
        visitedIndices.add(0);
        Deque<Pair<Integer, Integer>> indiciesToVisit = new ArrayDeque<>(); // pair of index, jumpCount
        indiciesToVisit.add(new Pair(0, 0));

        while (!indiciesToVisit.isEmpty()) {
            int currentIndex = indiciesToVisit.peekFirst().getKey();
            int jumpCount = indiciesToVisit.peekFirst().getValue();
            indiciesToVisit.remove();

            if (currentIndex == arr.length - 1) return jumpCount;

            // jump backwards and forwards
            addToSetAndQueue(currentIndex - 1, jumpCount + 1, visitedIndices, indiciesToVisit);
            addToSetAndQueue(currentIndex + 1, jumpCount + 1, visitedIndices, indiciesToVisit);
            // jump to similar vals
            if (!visitedValues.contains(arr[currentIndex])) {
                for (int indexWithCurrentVal : valueIndicies.get(arr[currentIndex])) {
                    if (indexWithCurrentVal != currentIndex) {
                        addToSetAndQueue(indexWithCurrentVal, jumpCount + 1, visitedIndices, indiciesToVisit);
                    }
                }
                visitedValues.add(arr[currentIndex]);
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