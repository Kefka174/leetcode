from typing import List, Set

class Solution:
    def numSpecial(self, mat: List[List[int]]) -> int:
        rowVals, colVals = [0] * len(mat), [0] * len(mat[0])
        for row in range(len(mat)):
            for col in range(len(mat[0])):
                if mat[row][col] == 1:
                    rowVals[row] += 1
                    colVals[col] += 1

        specialCellCount = 0
        for row in range(len(mat)):
            for col in range(len(mat[0])):
                if mat[row][col] == rowVals[row] == colVals[col] == 1:
                    specialCellCount += 1
        return specialCellCount