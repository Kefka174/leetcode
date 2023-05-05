from itertools import combinations
"""
:type nums: List[int]
:type target: int
:rtype: int
"""
# Uses two pointers (secondIndex and thirdIndex) to close in on the target for each first number
def threeSumClosest(nums, target): # o(n^2)
    nums.sort()
    closestToTarget = nums[0] + nums[1] + nums[2]
    for firstIndex in range(len(nums) - 2):
        secondIndex = firstIndex + 1
        thirdIndex = len(nums) - 1
        while secondIndex < thirdIndex:
            currentSum = nums[firstIndex] + nums[secondIndex] + nums[thirdIndex]

            if currentSum == target: return target
            if abs(target - currentSum) < abs(target - closestToTarget): closestToTarget = currentSum

            if currentSum < target: secondIndex += 1
            else: thirdIndex -= 1

    return closestToTarget


#######################################################################################################
# Uses itertools combinations to generate all combinations of 3 nums
def threeSumClosestLame(nums, target): # o(cringe)
    closestToTarget = nums[0] + nums[1] + nums[2]
    for comb in combinations(nums, 3):
        combTotal = sum(comb)
        if combTotal == target: return target
        if abs(target - combTotal) < abs(target - closestToTarget): closestToTarget = combTotal

    return closestToTarget



assert threeSumClosest([-1,2,1,-4], 1) == 2
assert threeSumClosest([0,0,0], 1) == 0