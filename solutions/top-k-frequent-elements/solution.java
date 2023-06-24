import java.util.Map;
import java.util.Comparator;
import java.util.Arrays;

class Solution {
    public int[] topKFrequent(int[] nums, int k) { // O(n*logn)
        Map<Integer, Integer> frequencyCounter = new HashMap<>();
        for (int num : nums) frequencyCounter.merge(num, 1, Integer::sum);

        int[] sortedByFrequency = frequencyCounter.entrySet().stream()
                                                  .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                                  .mapToInt(Map.Entry::getKey)
                                                  .toArray();
        return Arrays.copyOfRange(sortedByFrequency, 0, k);
    }
}