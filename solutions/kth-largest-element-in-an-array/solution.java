import java.util.PriorityQueue;

class Solution {
    public int findKthLargestCountingSort(int[] nums, int k) { // O(n + (max - min))
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        int[] numCounts = new int[max - min + 1];
        for (int num : nums) numCounts[num - min]++;

        for (int i = numCounts.length - 1; i >= 0; i--) {
            if (numCounts[i] >= k) return i + min;
            k -= numCounts[i];
        }
        return 0; // unreachable
    }


    /////////////////////////////////////////////////////////////////
    public int findKthLargest(int[] nums, int k) { // O(n * logk)
        PriorityQueue<Integer> heap = new PriorityQueue<>(k + 1);
        for (int num : nums) {
            heap.add(num);
            if (heap.size() > k) heap.poll();
        }

        return heap.poll();
    }
}