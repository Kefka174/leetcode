class Solution {
    public int islandPerimeter(int[][] grid) {
        int shoreCount = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 1) {
                    shoreCount += 4;
                    if (row > 0 && grid[row - 1][col] == 1) shoreCount -= 2;
                    if (col > 0 && grid[row][col - 1] == 1) shoreCount -= 2;
                }
            }
        }
        return shoreCount;
    }
}