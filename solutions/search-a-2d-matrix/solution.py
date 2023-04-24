from math import ceil
"""
:type matrix: List[List[int]]
:type target: int
:rtype: bool
"""
def searchMatrix(matrix, target):
    searchAreaSize = (len(matrix) * len(matrix[0])) / float(2)
    midIndex = int(ceil(searchAreaSize))

    while searchAreaSize >= 0.5:
        midRow, midCol = numToRowCol(midIndex - 1, len(matrix[0]))
        if midCol >= len(matrix): return False

        if matrix[midCol][midRow] == target: return True

        searchAreaSize /= 2
        if target > matrix[midCol][midRow]: midIndex += int(ceil(searchAreaSize))
        else: midIndex -= int(ceil(searchAreaSize))
        
    return False

def numToRowCol(num, rowLength):
    row = num % rowLength
    col = num // rowLength
    return row, col


assert searchMatrix([[1,3,5,7],[10,11,16,20],[23,30,34,60]], 3) == True
assert searchMatrix([[1,3,5,7],[10,11,16,20],[23,30,34,60]], 1) == True
assert searchMatrix([[1,3,5,7],[10,11,16,20],[23,30,34,60]], 60) == True
assert searchMatrix([[1,3,5,7],[10,11,16,20],[23,30,34,60]], 13) == False
assert searchMatrix([[1,3],[5,6]], 3) == True
assert searchMatrix([[1,3],[5,6]], 10) == False
assert searchMatrix([[1]], 1) == True
assert searchMatrix([[1,4,6]], 4) == True
assert searchMatrix([[2,4,6]], 1) == False
assert searchMatrix([[1,3]], 3) == True
assert searchMatrix([[-10,-9,-7,-6,-5],[-2,0,2,3,4],[5,6,8,9,9],[10,11,12,14,15]], 14) == True
assert searchMatrix([[-10,-9,-7,-6,-5],[-2,0,2,3,4],[5,6,8,9,9],[10,11,12,14,15]], 25) == False