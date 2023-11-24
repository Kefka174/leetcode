from typing import List

class Solution:
    def findDiagonalOrderBrute(self, nums: List[List[int]]) -> List[int]:
        diagonalOrder = []
        height, width = len(nums), max(len(x) for x in nums)
        for i in range(height + width):
            if i < height:
                currentRow, currentCol = i, 0
            else:
                currentRow = height - 1
                currentCol = i - currentRow

            while currentRow >= 0 and currentCol < width:
                if currentCol < len(nums[currentRow]):
                    diagonalOrder.append(nums[currentRow][currentCol])
                currentCol += 1
                currentRow -= 1
        return diagonalOrder