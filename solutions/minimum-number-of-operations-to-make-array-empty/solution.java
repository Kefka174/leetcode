import java.util.Map;

class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) 
            freqMap.merge(num, 1, Integer::sum);
        
        int opCount = 0;
        for (int frequency : freqMap.values()) {
            if (frequency == 1) return -1;
            opCount += Math.ceil(frequency / 3.0);
        }
        return opCount;
    }
}