import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> ranges = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int rangeStart = nums[i];
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) i++;

            if (rangeStart == nums[i]) ranges.add(Integer.toString(nums[i]));
            else ranges.add(rangeStart + "->" + nums[i]);
        }
        return ranges;
    }
}