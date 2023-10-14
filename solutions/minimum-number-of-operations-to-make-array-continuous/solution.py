from typing import List

class Solution:
    def minOperations(self, nums: List[int]) -> int: # O(nlogn)
        sortedUniqueNums = sorted(set(nums))
        startIndex, endIndex = 0, 0

        while (endIndex < len(sortedUniqueNums) and 
               sortedUniqueNums[endIndex] <= sortedUniqueNums[0] + (len(nums) - 1)):
            endIndex += 1

        if endIndex == len(sortedUniqueNums):
            return len(nums) - len(sortedUniqueNums)
        
        maxWindowCount = endIndex
        while endIndex < len(sortedUniqueNums) - 1:
            endIndex += 1
            while sortedUniqueNums[startIndex] < sortedUniqueNums[endIndex] - (len(nums) - 1):
                startIndex += 1
            
            if (endIndex - startIndex) + 1 > maxWindowCount:
                maxWindowCount = (endIndex - startIndex) + 1

        return len(nums) - maxWindowCount