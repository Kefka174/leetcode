class Solution {
    public int maxAreaBrute(int[] height) { // O(n^2)
        int maximumArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int iToJArea = Math.min(height[i], height[j]) * (j - i);
                if (iToJArea > maximumArea) maximumArea = iToJArea;
            }
        }
        return maximumArea;
    }
}