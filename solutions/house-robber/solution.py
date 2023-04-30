"""
:type nums: List[int]
:rtype: int
"""
def rob(nums):
    maxFromPreviousHouses = [-1 for i in nums]
    maxFromPreviousHouses[0] = nums[0]
    currentHouse = 1

    while currentHouse < len(nums):
        valRobbingCurrent = nums[currentHouse]
        if currentHouse > 1: valRobbingCurrent += maxFromPreviousHouses[currentHouse - 2]
        
        valPassingCurrent = maxFromPreviousHouses[currentHouse - 1]

        maxFromPreviousHouses[currentHouse] = max(valRobbingCurrent, valPassingCurrent)
        currentHouse += 1

    return maxFromPreviousHouses[len(nums) - 1]



assert rob([1,2,3,1]) == 4
assert rob([2,7,9,3,1]) == 12
assert rob([183,219,57,193,94,233,202,154,65,240,97,234,100,249,186,66,90,238,168,128,177,235,50,81,185,165,217,207,88,80,112,78,135,62,228,247,211]) == 3365