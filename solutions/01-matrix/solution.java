import java.util.Arrays;
import java.util.Deque;
import javafx.util.Pair;

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] retMatrix = new int[mat.length][mat[0].length];
        for (int[] row : retMatrix) Arrays.fill(row, -1);

        Deque<Pair<Integer, Integer>> floodLevel = new ArrayDeque<>();
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (mat[row][col] == 0) {
                    floodLevel.add(new Pair(row, col));
                    retMatrix[row][col] = 0;
                }
            }
        }

        while (!floodLevel.isEmpty()) {
            int currentRow = floodLevel.peek().getKey();
            int currentCol = floodLevel.poll().getValue();
            fillNeighbors(currentRow, currentCol, retMatrix, floodLevel);
        }
        
        return retMatrix;
    }

    private void fillNeighbors(int row, int col, int[][] mat, Deque<Pair<Integer, Integer>> queue) {
        int nextRowDirection = 0;
        int nextColDirection = 1;
        for (int i = 0; i < 4; i++) {
            int neighborRow = row + nextRowDirection;
            int neighborCol = col + nextColDirection;
            boolean neighborOutOfBounds = neighborRow < 0 || neighborRow == mat.length ||
                                          neighborCol < 0 || neighborCol == mat[0].length;

            if (!neighborOutOfBounds && mat[neighborRow][neighborCol] == -1) {
                mat[neighborRow][neighborCol] = mat[row][col] + 1;
                queue.add(new Pair(neighborRow, neighborCol));
            }

            int temp = nextRowDirection;
            nextRowDirection = nextColDirection;
            nextColDirection = -temp;
        }
    }
}