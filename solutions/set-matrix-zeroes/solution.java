import java.util.Set;

class Solution {
    // Instead of sets, uses the first row and first column as indicators that 
    // a given row or column needs to be set to zeroes
    public void setZeroes(int[][] matrix) { // O(1) space
        boolean firstRowShouldBeZeroes = false;
        boolean firstColShouldBeZeroes = false;
        for (int rowNum = 0; rowNum < matrix.length; rowNum++) {
            for (int colNum = 0; colNum < matrix[0].length; colNum++) {
                if (matrix[rowNum][colNum] == 0) {
                    if (rowNum == 0) firstRowShouldBeZeroes = true;
                    if (colNum == 0) firstColShouldBeZeroes = true;
                    matrix[rowNum][0] = 0;
                    matrix[0][colNum] = 0;
                }
            }
        }

        for (int rowNum = matrix.length - 1; rowNum >= 0; rowNum--) {
            for (int colNum = matrix[0].length - 1; colNum >= 0; colNum--) {
                boolean rowOrColHasZero = (matrix[rowNum][0] == 0 || matrix[0][colNum] == 0);
                if ((rowNum == 0 && firstRowShouldBeZeroes) ||
                    (colNum == 0 && firstColShouldBeZeroes) ||
                    (rowNum != 0 && colNum != 0 && rowOrColHasZero))
                    matrix[rowNum][colNum] = 0;
            }
        }
    }


    //////////////////////////////////////////////////////////////////////
    public void setZeroesWithMemory(int[][] matrix) { // O(m + n) space
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