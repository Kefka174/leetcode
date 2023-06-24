import java.util.Map;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

class Solution {
    public int[] topKFrequentBucket(int[] nums, int k) { // O(n)
        int maxFrequency = 0;
        Map<Integer, Integer> frequencyCounter = new HashMap<>();
        for (int num : nums) {
            frequencyCounter.merge(num, 1, Integer::sum);
            if (frequencyCounter.get(num) > maxFrequency) maxFrequency = frequencyCounter.get(num);
        }

        List<Integer>[] frequencyBuckets = new ArrayList[maxFrequency];
        for (int num : frequencyCounter.keySet()) {
            int placement = maxFrequency - frequencyCounter.get(num);
            if (frequencyBuckets[placement] == null) frequencyBuckets[placement] = new ArrayList<>();
            frequencyBuckets[placement].add(num);
        }

        int[] kFrequent = new int[k];
        int arrIndex = 0, frequencyIndex = 0;
        while (arrIndex < k) {
            while (frequencyBuckets[frequencyIndex] == null) frequencyIndex++;
            for (int i = 0; arrIndex < k && i < frequencyBuckets[frequencyIndex].size(); i++) {
                kFrequent[arrIndex] = frequencyBuckets[frequencyIndex].get(i);
                arrIndex++;
            }
            frequencyIndex++;
        }
        return kFrequent;
    }


    public int[] topKFrequentSorted(int[] nums, int k) { // O(n*logn)
        Map<Integer, Integer> frequencyCounter = new HashMap<>();
        for (int num : nums) frequencyCounter.merge(num, 1, Integer::sum);

        int[] frequencyBuckets = frequencyCounter.entrySet().stream()
                                                  .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                                  .mapToInt(Map.Entry::getKey)
                                                  .toArray();
        return Arrays.copyOfRange(frequencyBuckets, 0, k);
    }
}