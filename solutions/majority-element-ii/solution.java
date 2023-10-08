import java.util.List;
import java.util.Map;

class Solution {
    // Modified Boyer-Moore Majority Vote
    public List<Integer> majorityElementBoyer(int[] nums) { // O(n)
        int element1 = 0, element2 = 1;
        int count1 = 0, count2 = 0;
        for (int num : nums) {
            if (num == element1) count1++;
            else if (num == element2) count2++;
            else if (count1 == 0) {
                element1 = num;
                count1 = 1;
            }
            else if (count2 == 0) {
                element2 = num;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == element1) count1++;
            else if (num == element2) count2++;
        }
        
        List<Integer> ret = new ArrayList<>(2);
        if (count1 > nums.length / 3) ret.add(element1);
        if (count2 > nums.length / 3) ret.add(element2);
        return ret;
    }


    /////////////////////////////////////////////////////////////////
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