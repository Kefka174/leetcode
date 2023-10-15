from typing import List

class Solution:
    def minOperations(self, nums: List[int]) -> int: # O(nlogn)
        sortedUniqueNums = sorted(set(nums))
        startIndex, maxWindowCount = 0, 0
        for endIndex in range(len(sortedUniqueNums)):
            while sortedUniqueNums[startIndex] < sortedUniqueNums[endIndex] - (len(nums) - 1):
                startIndex += 1
                
            maxWindowCount = max(maxWindowCount, (endIndex - startIndex) + 1)

        return len(nums) - maxWindowCount