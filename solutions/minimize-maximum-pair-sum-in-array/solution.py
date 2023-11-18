from typing import List

class Solution:
    def minPairSum(self, nums: List[int]) -> int: # O(nlogn)
        sortedNums, maxSum = sorted(nums), 0
        for i in range(len(nums) // 2):
            maxSum = max(maxSum, sortedNums[i] + sortedNums[-(i + 1)])
        return maxSum