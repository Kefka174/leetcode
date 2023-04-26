"""
:type nums: List[int]
:type target: int
:rtype: int
"""
def search(nums, target):
    pivot = -1
    pivotFound = len(nums) == 1

    for i in range(2): # binary search twice, once to find pivot and once to find target
        bottomIndex = 1 + pivot
        topIndex = len(nums) + pivot
        
        while bottomIndex <= topIndex:
            midIndex = (((topIndex - bottomIndex) // 2) + bottomIndex)
            # check for target or pivot
            if not pivotFound and nums[midIndex - 1] > nums[midIndex]:
                pivot = midIndex - 1
                pivotFound = True
            elif pivotFound and nums[midIndex % len(nums)] == target: return midIndex % len(nums)
            
            # move boundaries
            if not pivotFound: needToMoveTopToMid = nums[midIndex] < nums[topIndex]
            else: needToMoveTopToMid = target < nums[midIndex % len(nums)]

            if needToMoveTopToMid: topIndex = midIndex - 1
            else: bottomIndex = midIndex + 1
        pivotFound = True
    return -1


assert search([4,5,6,7,0,1,2], 0) == 4
assert search([4,5,6,7,0,1,2], 3) == -1
assert search([1], 0) == -1
assert search([3,1], 1) == 1