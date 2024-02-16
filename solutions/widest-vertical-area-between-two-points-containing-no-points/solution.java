import java.util.Arrays;

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xValues = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            xValues[i] = points[i][0];
        }
        Arrays.sort(xValues);

        int maxWidth = Integer.MIN_VALUE;
        for (int i = 1; i < xValues.length; i++) {
            maxWidth = Math.max(maxWidth, xValues[i] - xValues[i - 1]);
        }
        return maxWidth;
    }
}