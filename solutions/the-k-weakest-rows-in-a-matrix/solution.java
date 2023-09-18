import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Comparator strengthIndexComp = Comparator.comparing((int[] a) -> -a[0]).thenComparing((a) -> -a[1]);
        int[] weakestRows = new int[k];
        PriorityQueue<int[]> rowHeap = new PriorityQueue<>(k + 1, strengthIndexComp);
        for (int i = 0; i < mat.length; i++) {
            int rowStrength = binarySearch(mat[i]);
            rowHeap.add(new int[] {rowStrength, i});
            if (rowHeap.size() > k) rowHeap.poll();
        }

        for (int i = k - 1; i >=0; i--)
            weakestRows[i] = rowHeap.poll()[1];
        return weakestRows;
    }

    private int binarySearch(int[] arr) {
        int bottomIndex = 0, topIndex = arr.length - 1;
        while (bottomIndex <= topIndex) {
            int middleIndex = (bottomIndex + topIndex) / 2;
            if (arr[middleIndex] == 0)
                topIndex = middleIndex - 1;
            else 
                bottomIndex = middleIndex + 1;
        }
        return bottomIndex;
    }
}