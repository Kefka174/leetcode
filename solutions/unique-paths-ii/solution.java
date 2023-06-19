class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[] pathsToRowAbove = new int[obstacleGrid[0].length];
        int pathsToLeftCell = 1;
        for (int[] row : obstacleGrid) {
            for (int cellNum = 0; cellNum < row.length; cellNum++) {
                int pathsToCurrentCell = 0;
                if (row[cellNum] != 1) pathsToCurrentCell += pathsToLeftCell + pathsToRowAbove[cellNum];
                
                pathsToRowAbove[cellNum] = pathsToCurrentCell;
                pathsToLeftCell = pathsToCurrentCell;
            }
            pathsToLeftCell = 0;
        }
        return pathsToRowAbove[pathsToRowAbove.length - 1];
    }
}