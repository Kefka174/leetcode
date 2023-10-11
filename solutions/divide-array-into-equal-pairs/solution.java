import java.util.Set;

class Solution {
    public boolean divideArray(int[] nums) {
        Set<Integer> partialPairs = new HashSet<>();
        for (int num : nums) {
            if (partialPairs.contains(num)) {
                partialPairs.remove(num);
            }
            else partialPairs.add(num);
        }
        return partialPairs.isEmpty();
    }
}