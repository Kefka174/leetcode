import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) { // O(n * logk)
        PriorityQueue<Integer> heap = new PriorityQueue<>(k + 1);
        for (int num : nums) {
            heap.add(num);
            if (heap.size() > k) heap.poll();
        }

        return heap.poll();
    }
}