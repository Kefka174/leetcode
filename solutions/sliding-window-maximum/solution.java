import java.util.Map;
import java.util.TreeMap;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) { // O(n*logk)
        int[] windowMaxes = new int[nums.length - k + 1];
        TreeMap<Integer, Integer> window = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (i >= k) countingMapRemove(nums[i - k], window);
            window.merge(nums[i], 1, Integer::sum);
            if (i >= k - 1) windowMaxes[i - k + 1] = window.lastKey();
        }
        return windowMaxes;
    }

    private void countingMapRemove(int num, Map<Integer, Integer> map) {
        map.merge(num, -1, Integer::sum);
        if (map.get(num) == 0) map.remove(num);
    }
}