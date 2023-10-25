from typing import List

class Solution:
    def findMiddleIndex(self, nums: List[int]) -> int:
        prefixSum = 0
        for i in range(1, len(nums)):
            prefixSum += nums[i - 1]
        
        suffixSum, middleIndex = 0, -1
        for i in range(len(nums) - 1, -1, -1):
            if suffixSum == prefixSum:
                middleIndex = i
            prefixSum -= nums[i - 1]
            suffixSum += nums[i]
        return middleIndex