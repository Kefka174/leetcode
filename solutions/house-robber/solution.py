"""
:type nums: List[int]
:rtype: int
"""
def rob(nums):
    curentMax = nums[0]
    maxRobbingPreviousHouse = nums[0]
    maxBeforePreviousHouse = 0
    currentHouse = 1

    while currentHouse < len(nums):
        valRobbingCurrent = nums[currentHouse] + maxBeforePreviousHouse
        
        valPassingCurrent = maxRobbingPreviousHouse

        curentMax = max(valRobbingCurrent, valPassingCurrent)

        maxBeforePreviousHouse = maxRobbingPreviousHouse
        maxRobbingPreviousHouse = curentMax
        currentHouse += 1

    return curentMax



assert rob([7]) == 7
assert rob([1,2,3,1]) == 4
assert rob([2,7,9,3,1]) == 12
assert rob([183,219,57,193,94,233,202,154,65,240,97,234,100,249,186,66,90,238,168,128,177,235,50,81,185,165,217,207,88,80,112,78,135,62,228,247,211]) == 3365