import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import javafx.util.Pair;

class Solution {
    // Uses frequency maps in place of multisets
    // Could use a heap to minimize number of passes from (2*nlogn) to (nlogn + nlogk)
    public long maxScore(int[] nums1, int[] nums2, int k) { // O(n*logn)
        TreeMap<Integer, Integer> sortedNums1 = new TreeMap<>(Collections.reverseOrder());
        for (int num : nums1) sortedNums1.merge(num, 1, Integer::sum);
        
        Pair<Integer, Integer>[] sortedPairs = new Pair[nums2.length];
        for (int i = 0; i < nums2.length; i++) 
            sortedPairs[i] = new Pair(nums2[i], nums1[i]);
        Arrays.sort(sortedPairs, (a, b) -> a.getKey() - b.getKey());
        
        long kLargestSum = sumOfKLargest(sortedNums1, k - 1);
        long max = Long.MIN_VALUE;
        for (int i = 0; i < sortedPairs.length - k + 1; i++) {
            int multiplier = sortedPairs[i].getKey();
            int firstNum = sortedPairs[i].getValue();

            kLargestSum = updateKLargestSum(sortedNums1, firstNum, kLargestSum);
            long currentScore = (firstNum + kLargestSum) * multiplier;
            if (currentScore > max) max = currentScore;
        }
        return max;
    }

    // Removes val from sortedMap. If val is not in sortedMap, it must be a part of the kLargestSum
    // so it is removed and the largest val from sortedMap is moved to the kLargestSum.
    private long updateKLargestSum(TreeMap<Integer, Integer> sortedMap, int val, long kLargestSum) {
        if (sortedMap.containsKey(val)) 
            frequenyMapRemove(sortedMap, val);
        else {
            kLargestSum -= val;
            kLargestSum += sortedMap.firstKey();
            frequenyMapRemove(sortedMap, sortedMap.firstKey());
        }
        return kLargestSum;
    }

    // Removes the k largest ints from a sorted map and returns their sum
    private long sumOfKLargest(TreeMap<Integer, Integer> sortedMap, int k) {
        long kLargest = 0;
        for (int i = 0; i < k; i++) {
            kLargest += sortedMap.firstKey();
            frequenyMapRemove(sortedMap, sortedMap.firstKey());
        }
        return kLargest;
    }

    private <T> void frequenyMapRemove(Map<T, Integer> map, T key) {
        map.merge(key, -1, Integer::sum);
        if (map.get(key) <= 0) map.remove(key);
    }
}