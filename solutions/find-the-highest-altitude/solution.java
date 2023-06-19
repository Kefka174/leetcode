class Solution {
    public int largestAltitude(int[] gain) {
        int maxHeight = 0;
        int currentHeight = 0;
        for (int change : gain) {
            currentHeight += change;
            if (currentHeight > maxHeight) maxHeight = currentHeight;
        }
        return maxHeight;
    }
}