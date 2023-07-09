import java.util.Set;

class Solution {
    public void setZeroes(int[][] matrix) { // O(m + n) space
        Set<Integer> zeroRows = new HashSet<>();
        Set<Integer> zeroCols = new HashSet<>();
        for (int rowNum = 0; rowNum < matrix.length; rowNum++) {
            for (int colNum = 0; colNum < matrix[0].length; colNum++) {
                if (matrix[rowNum][colNum] == 0) {
                    zeroRows.add(rowNum);
                    zeroCols.add(colNum);
                }
            }
        }

        for (int rowNum = 0; rowNum < matrix.length; rowNum++) {
            for (int colNum = 0; colNum < matrix[0].length; colNum++) {
                if (zeroRows.contains(rowNum) || zeroCols.contains(colNum))
                    matrix[rowNum][colNum] = 0;
            }
        }
    }
}