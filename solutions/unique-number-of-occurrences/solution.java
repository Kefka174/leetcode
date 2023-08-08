import java.util.Map;
import java.util.Set;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> frequencyCounter = new HashMap<>();
        for (int num : arr) frequencyCounter.merge(num, 1, Integer::sum);

        Set<Integer> uniqueFrequencies = new HashSet<>(frequencyCounter.values());
        return uniqueFrequencies.size() == frequencyCounter.size();
    }
}