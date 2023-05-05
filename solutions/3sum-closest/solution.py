from itertools import combinations
"""
:type nums: List[int]
:type target: int
:rtype: int
"""
# Uses itertools combinations to generate all combinations of 3 nums
def threeSumClosestLame(nums, target): # o(cringe)
    closestToTarget = nums[0] + nums[1] + nums[2]
    for comb in combinations(nums, 3):
        combTotal = sum(comb)
        if combTotal == target: return target
        if abs(target - combTotal) < abs(target - closestToTarget): closestToTarget = combTotal

    return closestToTarget



assert threeSumClosestLame([-1,2,1,-4], 1) == 2
assert threeSumClosestLame([0,0,0], 1) == 0