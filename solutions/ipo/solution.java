import java.util.PriorityQueue;

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<int[]> capitalMinHeap = new PriorityQueue<>(capital.length, (a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> profitMaxHeap = new PriorityQueue<>(capital.length, (a, b) -> b[1] - a[1]);
        for (int i = 0; i < capital.length; i++) 
            capitalMinHeap.add(new int[] {capital[i], profits[i]});

        int totalCapital = w;
        for (int i = 0; i < k; i++) {
            while (!capitalMinHeap.isEmpty() && capitalMinHeap.peek()[0] <= totalCapital)
                profitMaxHeap.add(capitalMinHeap.poll());
            
            if (profitMaxHeap.isEmpty()) return totalCapital;
            totalCapital += profitMaxHeap.poll()[1];
        }
        return totalCapital;
    }
}