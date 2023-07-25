class Solution {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) rotateLayer(matrix, i);
    }

    private void rotateLayer(int[][] matrix, int layer) {
        Point topRight = new Point(layer, matrix[0].length - 1 - layer);
        Point botRight = new Point(matrix.length - 1 - layer, matrix[0].length - 1 - layer);
        Point botLeft = new Point(matrix.length - 1 - layer, layer);
        Point topLeft = new Point(layer, layer);
        for (int i = 0; i < matrix.length - 1 - (2 * layer); i++) {
            int temp = matrix[topRight.row][topRight.col];
            matrix[topRight.row][topRight.col] = matrix[topLeft.row][topLeft.col];
            matrix[topLeft.row][topLeft.col] = matrix[botLeft.row][botLeft.col];
            matrix[botLeft.row][botLeft.col] = matrix[botRight.row][botRight.col];
            matrix[botRight.row][botRight.col] = temp;

            topRight.row++;
            botRight.col--;
            botLeft.row--;
            topLeft.col++;
        }
    }

    class Point {
        int row;
        int col;
    
        Point(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}