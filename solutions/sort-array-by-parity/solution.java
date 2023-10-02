class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] sortedNums = nums.clone();
        int frontIndex = 0, backIndex = sortedNums.length - 1;
        while (frontIndex < backIndex) {
            while (frontIndex < backIndex && sortedNums[frontIndex] % 2 == 0)
                frontIndex++;
            while (frontIndex < backIndex && sortedNums[backIndex] % 2 != 0)
                backIndex--;

            int temp = sortedNums[frontIndex];
            sortedNums[frontIndex] = sortedNums[backIndex];
            sortedNums[backIndex] = temp;
        }
        return sortedNums;
    }
}