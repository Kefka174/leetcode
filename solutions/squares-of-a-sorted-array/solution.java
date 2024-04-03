class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];
        int leftIndex = 0, rightIndex = nums.length - 1;
        for (int i = squares.length - 1; i >= 0; i--) {
            if (Math.abs(nums[leftIndex]) >= Math.abs(nums[rightIndex])) {
                squares[i] = nums[leftIndex] * nums[leftIndex];
                leftIndex++;
            }
            else {
                squares[i] = nums[rightIndex] * nums[rightIndex];
                rightIndex--;
            }
        }
        return squares;
    }
}