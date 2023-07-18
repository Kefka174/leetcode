class Solution {
    public int maxAreaTwoPointer(int[] height) { // O(n)
        int maximumArea = 0;
        int startIndex = 0;
        int endIndex = height.length - 1;
        while (startIndex < endIndex) {
            int area = Math.min(height[startIndex], height[endIndex]) * (endIndex - startIndex);
            if (area > maximumArea) maximumArea = area;
            
            if (height[startIndex] < height[endIndex]) startIndex++;
            else endIndex--;
        }

        return maximumArea;
    }


    //////////////////////////////////////////////////////////////////////
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