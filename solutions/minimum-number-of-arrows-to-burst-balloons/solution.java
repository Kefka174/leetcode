import java.util.Arrays;

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int arrowsShot = 1;
        int prevIntervalEnd = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > prevIntervalEnd) {
                arrowsShot++;
                prevIntervalEnd = points[i][1];
            }
            else 
                prevIntervalEnd = Math.min(points[i][1], prevIntervalEnd);
        }
        return arrowsShot;
    }
}