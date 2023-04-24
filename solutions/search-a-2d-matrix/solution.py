"""
:type matrix: List[List[int]]
:type target: int
:rtype: bool
"""
def searchMatrix(matrix, target):
    topIndex = (len(matrix) * len(matrix[0])) - 1
    bottomIndex = 0

    while bottomIndex <= topIndex:
        midIndex = ((topIndex - bottomIndex) // 2) + bottomIndex
        midRow, midCol = numToRowCol(midIndex, len(matrix[0]))

        if matrix[midCol][midRow] == target: return True

        if target > matrix[midCol][midRow]: bottomIndex = midIndex + 1
        else: topIndex = midIndex - 1
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
assert searchMatrix([[1,3]], 1) == True
assert searchMatrix([[-10,-9,-7,-6,-5],[-2,0,2,3,4],[5,6,8,9,9],[10,11,12,14,15]], 14) == True
assert searchMatrix([[-10,-9,-7,-6,-5],[-2,0,2,3,4],[5,6,8,9,9],[10,11,12,14,15]], 25) == False