"""
:type nums: List[int]
:rtype: bool
"""
# Adds list ints to build partial totals. If half of the list-total can be built from partial totals,
# then the unused elements of the list will add to the other half. 
#   o(n^2) time and space because the partial totals aren't limited to be less than halfTotal (which allows negative values in nums).
#   If the partialTotals were limited, it would be o(n*halfTotal) time and o(halfTotal) space which isn't always better.
def canPartition(nums): # o(n^2)
    total = sum(nums)
    if total % 2 != 0: return False

    halfTotal = total // 2
    partialTotals = {0}

    while nums:
        currentNum = nums.pop()
        if halfTotal - currentNum in partialTotals: return True

        newPartialTotals = set()
        for part in partialTotals: newPartialTotals.add(part + currentNum)
        partialTotals |= newPartialTotals

    return False


###############################################################################

# Adds list elements together to half of the total, checks if the unused elements add to the other half
def canPartitionInefficient(nums): # o(2^n)
    total = sum(nums)
    if total % 2 != 0: return False

    unusedInts = combineIntsToTarget(total / 2, nums)
    if unusedInts != None and sum(unusedInts) == total / 2: return True

    return False

# Takes a list of ints and a target. Adds list ints to hit target.
# If target can be built from any sum of list ints, returns list of unused ints.
# If target can't be built, returns None
def combineIntsToTarget(target, nums):
    if len(nums) == 1 and nums[0] == target: return []
    if target < 0 or len(nums) <= 1: return None

    usedFirstNum = combineIntsToTarget(target - nums[0], nums[1:])
    if usedFirstNum != None: return usedFirstNum
    else: 
        notUseFirstNum = combineIntsToTarget(target, nums[1:])
        if notUseFirstNum != None: return [nums[0]] + notUseFirstNum

    return None



assert canPartition([1,5,11,5]) == True
assert canPartition([1,2,3,5]) == False
assert canPartition([1,2,5]) == False

# [100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,99,97]