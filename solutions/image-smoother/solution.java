import java.util.List;

class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] smoothedImage = new int[img.length][img[0].length];
        for (int row = 0; row < img.length; row++) {
            for (int col = 0; col < img[0].length; col++) {
                List<Integer> neighborValues = getNeighborValues(row, col, img);

                int sum = 0;
                for (int value : neighborValues) sum += value;
                smoothedImage[row][col] = sum / neighborValues.size();
            }
        }
        return smoothedImage;
    }

    private List<Integer> getNeighborValues(int row, int col, int[][] img) {
        List<Integer> neighborValues = new ArrayList<>();
        neighborValues.add(img[row][col]);
        int[] nextCardinalDirection = new int[] {0, 1};
        int[] nextDiagonalDirection = new int[] {1, 1};
        for (int i = 0; i < 4; i++) {
            int cardinalRow = row + nextCardinalDirection[0];
            int cardinalCol = col + nextCardinalDirection[1];
            int diagonalRow = row + nextDiagonalDirection[0];
            int diagonalCol = col + nextDiagonalDirection[1];

            boolean cardinalOutOfBounds = cardinalRow < 0 || cardinalRow == img.length || 
                                          cardinalCol < 0 || cardinalCol == img[0].length;
            boolean diagonalOutOfBounds = diagonalRow < 0 || diagonalRow == img.length ||
                                          diagonalCol < 0 || diagonalCol == img[0].length;
            
            if (!cardinalOutOfBounds) neighborValues.add(img[cardinalRow][cardinalCol]);
            if (!diagonalOutOfBounds) neighborValues.add(img[diagonalRow][diagonalCol]);

            int temp = nextCardinalDirection[0];
            nextCardinalDirection[0] = nextCardinalDirection[1];
            nextCardinalDirection[1] = -temp;
            temp = nextDiagonalDirection[0];
            nextDiagonalDirection[0] = nextDiagonalDirection[1];
            nextDiagonalDirection[1] = -temp;
        }
        return neighborValues;
    }
}