import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        Comparator absComparator = Comparator.comparing((Integer a) -> Math.abs(a)).thenComparing((a)->a);
        PriorityQueue<Integer> workerHeap = new PriorityQueue<>(candidates * 2, absComparator);
        int lowerIndex = 0, upperIndex = costs.length - 1;
        long workerCost = 0;
        while (lowerIndex < candidates) {
            workerHeap.add(-costs[lowerIndex]);
            lowerIndex++;
        }
        while (upperIndex > costs.length - 1 - candidates && upperIndex >= lowerIndex) {
            workerHeap.add(costs[upperIndex]);
            upperIndex--;
        }

        for (int i = 0; i < k; i++) {
            int cheapestWorker = workerHeap.poll();
            workerCost += Math.abs(cheapestWorker);
            if (lowerIndex <= upperIndex) {
                if (cheapestWorker < 0) {
                    workerHeap.add(-costs[lowerIndex]);
                    lowerIndex++;
                }
                else {
                    workerHeap.add(costs[upperIndex]);
                    upperIndex--;
                }
            }
        }
        return workerCost;
    }
}