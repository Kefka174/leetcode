from typing import List, Set

class Solution:
    def numSpecial(self, mat: List[List[int]]) -> int:
        specialRows, normalRows = set(), set()
        specialCols, normalCols = set(), set()
        for row in range(len(mat)):
            for col in range(len(mat[0])):
                if mat[row][col] == 1:
                    self.addToSets(row, specialRows, normalRows)
                    self.addToSets(col, specialCols, normalCols)

        specialCellCount = 0 
        for row in range(len(mat)):
            for col in range(len(mat[0])):
                if mat[row][col] == 1 and row in specialRows and col in specialCols:
                    specialCellCount += 1
        return specialCellCount

    def addToSets(self, val: int, singleSet: Set[int], overflowSet: Set[int]) -> None:
        if val not in overflowSet:
            if val in singleSet:
                singleSet.remove(val)
                overflowSet.add(val)
            else:
                singleSet.add(val)