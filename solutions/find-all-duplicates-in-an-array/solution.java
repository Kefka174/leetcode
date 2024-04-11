import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) { // sorts nonduplicates
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            while (nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) duplicates.add(nums[i]);
        }
        return duplicates;
    }
}