class Solution {
    public boolean canJump(int[] nums) {
        int gapSize = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] == 0 || nums[i] <= gapSize) gapSize++;
            else gapSize = 0;
        }
        
        if (gapSize > 0) return false;
        return true;
    }
}