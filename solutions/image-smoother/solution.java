import java.util.List;

class Solution {
    public int[][] imageSmootherCondensed(int[][] img) {
        int[][] smoothedImage = new int[img.length][img[0].length];
        for (int row = 0; row < img.length; row++) {
            for (int col = 0; col < img[0].length; col++) {
                int sum = 0, count = 0;
                for (int neighborRow = row - 1; neighborRow <= row + 1; neighborRow++) {
                    for (int neighborCol = col - 1; neighborCol <= col + 1; neighborCol++) {
                        if (neighborRow >= 0 && neighborRow != img.length &&
                            neighborCol >= 0 && neighborCol != img[0].length) {
                                sum += img[neighborRow][neighborCol];
                                count++;
                        }
                    }
                }
                smoothedImage[row][col] = sum / count;
            }
        }
        return smoothedImage;
    }


    ////////////////////////////////////////////////////////////////////////////////
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
        for (int neighborRow = row - 1; neighborRow <= row + 1; neighborRow++) {
            for (int neighborCol = col - 1; neighborCol <= col + 1; neighborCol++) {
                if (neighborRow >= 0 && neighborRow != img.length &&
                    neighborCol >= 0 && neighborCol != img[0].length)
                    neighborValues.add(img[neighborRow][neighborCol]);
            }
        }
        return neighborValues;
    }
}