import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> ranges = new ArrayList<>();
        if (nums.length == 0) return ranges;

        int currentRangeStart = nums[0];
        int currentRangeEnd = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != currentRangeEnd + 1) {
                ranges.add(rangeAsString(currentRangeStart, currentRangeEnd));
                
                currentRangeStart = nums[i];
                currentRangeEnd = nums[i];
            }
            else currentRangeEnd++;
        }
        ranges.add(rangeAsString(currentRangeStart, currentRangeEnd));
        
        return ranges;
    }

    private String rangeAsString(int rangeStart, int rangeEnd) {
        if (rangeStart == rangeEnd) return Integer.toString(rangeStart);
        else return rangeStart + "->" + rangeEnd;
    }
}