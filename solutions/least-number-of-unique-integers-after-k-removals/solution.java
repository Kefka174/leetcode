import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        for (int num : arr) {
            frequencies.merge(num, 1, Integer::sum);
        }
        
        PriorityQueue<Integer> heap = new PriorityQueue<>(frequencies.values());
        while (!heap.isEmpty() && heap.peek() <= k) k -= heap.poll();
        return heap.size();
    }


    ///////////////////////////////////////////////////////////////////////////
    public int findLeastNumOfUniqueIntsCountingSort(int[] arr, int k) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        for (int num : arr) {
            frequencies.merge(num, 1, Integer::sum);
        }
        
        int[] frequencyFrequencies = new int[arr.length + 1];
        for (int freq : frequencies.values()) frequencyFrequencies[freq]++;

        int index = 0, uniqueIntsCount = frequencies.size();
        while (k >= index) {
            if (frequencyFrequencies[index] > 0) {
                k -= index;
                frequencyFrequencies[index]--;
                uniqueIntsCount--;
            }
            else index++;
        }
        return uniqueIntsCount;
    }
}