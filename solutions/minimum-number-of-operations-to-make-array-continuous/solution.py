from typing import List

class Solution:
    def minOperations(self, nums: List[int]) -> int: # O(maxNum - minNum)
        minNum, maxNum = min(nums), max(nums)
        numSet = set(nums)

        windowCount = 0
        for i in range(minNum, minNum + len(nums)):
            if i in numSet:
                windowCount += 1

        if windowCount == len(nums):
            return 0
        
        maxWindowCount = windowCount
        for i in range(minNum + len(nums), maxNum + 1):
            if i - len(nums) in numSet:
                windowCount -= 1
            if i in numSet:
                windowCount += 1

            if windowCount > maxWindowCount:
                maxWindowCount = windowCount

        return len(nums) - maxWindowCount