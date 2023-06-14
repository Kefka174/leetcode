class Solution {
    public int countNegatives(int[][] grid) {
        int negativeCount = 0;
        int index = grid[0].length - 1;
        for (int[] row : grid) {
            while (index >= 0 && row[index] < 0) index--;
            negativeCount += (grid[0].length - 1) - index;
        }
        return negativeCount;
    }
}