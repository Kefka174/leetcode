from typing import List
from itertools import chain

class Solution:
    def findDiagonalOrder(self, nums: List[List[int]]) -> List[int]:
        height, width = len(nums), max(len(x) for x in nums)
        diagonalLists = [[] for i in range(height + width - 1)]
        for row in range(len(nums) - 1, -1, -1):
            for col in range(len(nums[row])):
                diagonalLists[row + col].append(nums[row][col])
        return list(chain.from_iterable(diagonalLists))