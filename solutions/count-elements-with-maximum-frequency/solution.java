import java.util.Map;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        int maxFrequency = 0;
        for (int num : nums) {
            frequencies.merge(num, 1, Integer::sum);
            maxFrequency = Math.max(maxFrequency, frequencies.get(num));
        }
        
        int numsWithMaxFrequency = 0;
        for (int frequency : frequencies.values()) {
            if (frequency == maxFrequency) numsWithMaxFrequency++;
        }
        return maxFrequency * numsWithMaxFrequency;
    }
}