import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import javafx.util.Pair;

class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) { // O(n*logn)
        TreeMap<Integer, Integer> sortedNums1 = new TreeMap<>(Collections.reverseOrder());
        for (int num : nums1) sortedNums1.merge(num, 1, Integer::sum);
        
        Pair<Integer, Integer>[] sortedPairs = new Pair[nums2.length];
        for (int i = 0; i < nums2.length; i++) 
            sortedPairs[i] = new Pair(nums2[i], nums1[i]);
        Arrays.sort(sortedPairs, (a, b) -> a.getKey() - b.getKey());
        
        Map<Integer, Integer> kLargest = new HashMap<>();
        int numsNeeded = k - 1;
        while (numsNeeded > 0) {
            int largestNum = sortedNums1.firstKey();
            int largestNumFrequency = sortedNums1.get(largestNum);
            if (largestNumFrequency > numsNeeded) {
                kLargest.put(largestNum, numsNeeded);
                sortedNums1.put(largestNum, largestNumFrequency - numsNeeded);
            }
            else {
                kLargest.put(largestNum, largestNumFrequency);
                sortedNums1.remove(largestNum);
            }
            numsNeeded -= largestNumFrequency;
        }
        long kLargestSum = 0;
        for (int num : kLargest.keySet()) 
            kLargestSum += ((long)num * kLargest.get(num));

        long max = Long.MIN_VALUE;
        for (int i = 0; i < sortedPairs.length - k + 1; i++) {
            int multiplier = sortedPairs[i].getKey();
            int firstNum = sortedPairs[i].getValue();

            if (sortedNums1.containsKey(firstNum)) {
                sortedNums1.merge(firstNum, -1, Integer::sum);
                if (sortedNums1.get(firstNum) == 0) sortedNums1.remove(firstNum);
            }
            else {
                kLargestSum -= firstNum;
                
                kLargest.merge(firstNum, -1, Integer::sum);
                if (kLargest.get(firstNum) == 0) sortedNums1.remove(firstNum);
                
                int nextLargest = sortedNums1.firstKey();
                kLargestSum += nextLargest;
                sortedNums1.merge(nextLargest, -1, Integer::sum);
                if (sortedNums1.get(nextLargest) == 0) sortedNums1.remove(nextLargest);
                kLargest.merge(nextLargest, 1, Integer::sum);
            }
            long currentScore = (firstNum + kLargestSum) * multiplier;
            if (currentScore > max) max = currentScore;
        }
        return max;
    }
}