import java.util.Set;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ret = new int[2];
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (numSet.contains(num)) ret[0] = num;
            else numSet.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!numSet.contains(i)) ret[1] = i;
        }
        return ret;
    }
}