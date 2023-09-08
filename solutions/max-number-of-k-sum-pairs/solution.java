import java.util.Arrays;
import java.util.Map;

class Solution {
    public int maxOperationsMap(int[] nums, int k) { // O(n)
        Map<Integer, Integer> frequencies = new HashMap<>();
        int operationCount = 0;
        for (int num : nums) {
            if (frequencies.containsKey(num)) {
                operationCount++;
                frequenyMapRemove(frequencies, num);
            }
            else 
                frequencies.merge(k - num, 1, Integer::sum);
        }
        return operationCount;
    }

    private <T> void frequenyMapRemove(Map<T, Integer> map, T item) {
        map.merge(item, -1, Integer::sum);
        if (map.get(item) == 0) map.remove(item);
    }


    /////////////////////////////////////////////////////////////////
    public int maxOperationsSort(int[] nums, int k) { // O(nlogn)
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