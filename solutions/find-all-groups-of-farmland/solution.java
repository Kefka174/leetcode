import java.util.List;

class Solution {
    public int[][] findFarmland(int[][] land) {
        List<int[]> farmlands = new ArrayList<>();
        for (int row = 0; row < land.length; row++) {
            for (int col = 0; col < land[0].length; col++) {
                boolean isTopLeftCorner = land[row][col] == 1 
                        && (row == 0 || land[row - 1][col] == 0) 
                        && (col == 0 || land[row][col - 1] == 0);
                if (isTopLeftCorner) {
                    int bottomRightRow = row, bottomRightCol = col;
                    while (bottomRightRow + 1 < land.length 
                            && land[bottomRightRow + 1][col] == 1) bottomRightRow++;
                    while (bottomRightCol + 1 < land[0].length 
                            && land[row][bottomRightCol + 1] == 1) bottomRightCol++;
                    farmlands.add(new int[] {row, col, bottomRightRow, bottomRightCol});
                }
            }
        }
        return farmlands.toArray(new int[farmlands.size()][4]);
    }
}