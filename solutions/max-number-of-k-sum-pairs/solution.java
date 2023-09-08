import java.util.Arrays;

class Solution {
    public int maxOperations(int[] nums, int k) { // O(nlogn)
        Arrays.sort(nums);
        int operationCount = 0;
        int leftIndex = 0, rightIndex = nums.length - 1;
        while (leftIndex < rightIndex) {
            if (nums[leftIndex] + nums[rightIndex] == k) {
                operationCount++;
                leftIndex++;
                rightIndex--;
            }
            else if (nums[leftIndex] + nums[rightIndex] < k)
                leftIndex++;
            else 
                rightIndex--;
        }
        return operationCount;
    }
}