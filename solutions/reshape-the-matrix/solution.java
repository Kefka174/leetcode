class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if ((mat.length * mat[0].length) != (r * c)) return mat;

        int[][] reshaped = new int[r][c];
        for (int i = 0; i < r * c; i++) {
            int reshapedRow = i / c;
            int reshapedCol = i % c;
            int matRow = i / mat[0].length;
            int matCol = i % mat[0].length;

            reshaped[reshapedRow][reshapedCol] = mat[matRow][matCol];
        }
        return reshaped;
    }
}