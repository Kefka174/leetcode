from typing import List

class Solution:
    def getSumAbsoluteDifferences(self, nums: List[int]) -> List[int]:
        differences = [0] * len(nums)
        prefixSum = 0
        for i in range(len(nums)):
            differences[i] = (i * nums[i]) - prefixSum
            prefixSum += nums[i]

        suffixSum = 0
        for i in range(len(nums) - 1, -1, -1):
            differences[i] += suffixSum - ((len(nums) - 1 - i) * nums[i])
            suffixSum += nums[i]

        return differences