import java.util.Map;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int numPairs = 0;
        Map<Integer, Integer> numFrequencies = new HashMap<>();
        for (int num : nums) {
            numPairs += numFrequencies.getOrDefault(num, 0);
            numFrequencies.merge(num, 1, Integer::sum);
        }
        return numPairs;
    }
}