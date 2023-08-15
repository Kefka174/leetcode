import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) { // O(n + k*logn)
        PriorityQueue<Integer> heap = new PriorityQueue<>(nums.length);
        for (int num : nums) heap.add(-num);

        for (int i = 0; i < k - 1; i++) heap.remove();
        return -heap.remove();
    }
}