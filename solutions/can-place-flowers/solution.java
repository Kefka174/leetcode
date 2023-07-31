class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        
        int availableSpots = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] != 1) {
                boolean leftOpen = (i == 0 || flowerbed[i - 1] == 0);
                boolean rightOpen = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);
                if (leftOpen && rightOpen) {
                    if (++availableSpots >= n) return true;
                    i++;
                }
            }
        }
        return false;
    }
}