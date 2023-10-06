import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ret = new ArrayList<>(2);
        Map<Integer, Integer> numFrequencies = new HashMap<>();
        for (int num : nums) {
            numFrequencies.merge(num, 1, Integer::sum);
            if (numFrequencies.get(num) > nums.length / 3 && 
                (ret.isEmpty() || ret.get(0) != num)) {
                ret.add(num);
            }
            if (ret.size() == 2) return ret;
        }
        return ret;
    }
}