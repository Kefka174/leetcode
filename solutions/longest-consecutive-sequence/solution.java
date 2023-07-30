import java.util.Map;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) { // O(n) time and space
        Set<Integer> numsSeen = new HashSet<>();
        Map<Integer, Integer> sequenceBorders = new HashMap<>();
        int longestSequence = 0;
        for (int num : nums) {
            if (!numsSeen.contains(num)) {
                numsSeen.add(num);
                int lowerBorder = num, upperBorder = num;
                if (sequenceBorders.containsKey(num - 1)) {
                    lowerBorder = sequenceBorders.get(num - 1);
                    sequenceBorders.remove(num - 1);
                }
                if (sequenceBorders.containsKey(num + 1)) {
                    upperBorder = sequenceBorders.get(num + 1);
                    sequenceBorders.remove(num + 1);
                }

                sequenceBorders.put(lowerBorder, upperBorder);
                sequenceBorders.put(upperBorder, lowerBorder);
                if (upperBorder - lowerBorder + 1 > longestSequence) longestSequence = upperBorder - lowerBorder + 1;
            }
        }
        return longestSequence;
    }
}