from typing import List

class Solution:
    def onesMinusZeros(self, grid: List[List[int]]) -> List[List[int]]:
        rowDiffs, colDiffs = [0] * len(grid), [0] * len(grid[0])
        for row in range(len(grid)):
            for col in range(len(grid[0])):
                if grid[row][col] == 1:
                    rowDiffs[row] += 1
                    colDiffs[col] += 1
                else:
                    rowDiffs[row] -= 1
                    colDiffs[col] -= 1

        diffGrid = [[0] * len(grid[0]) for _ in range(len(grid))]
        for row in range(len(grid)):
            for col in range(len(grid[0])):
                diffGrid[row][col] = rowDiffs[row] + colDiffs[col]
        return diffGrid