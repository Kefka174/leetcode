from typing import List

class Solution:
    def maxFrequency(self, nums: List[int], k: int) -> int:
        sortedNums = sorted(nums, reverse = True)
        maxWindowSize, startIndex, endIndex = 0, 0, 0
        currentK = k
        while endIndex < len(nums):
            maxWindowVal = sortedNums[startIndex]
            while endIndex < len(nums) and maxWindowVal - sortedNums[endIndex] <= currentK:
                currentK -= maxWindowVal - sortedNums[endIndex]
                endIndex += 1

            maxWindowSize = max(maxWindowSize, (endIndex - startIndex))

            while startIndex < len(nums) - 1 and sortedNums[startIndex] == maxWindowVal:
                startIndex += 1
            currentK += (maxWindowVal - sortedNums[startIndex]) * (endIndex - startIndex)

        return maxWindowSize