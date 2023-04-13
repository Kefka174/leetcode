"""
:type nums: List[int]
:type target: int
:rtype: List[int]
"""
def twoSum(self, nums, target):
    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            if nums[i] + nums[j] == target: return [i,j]

def twoSumFaster(self, nums, target):
    lookupDict = {}
    for i, num in enumerate(nums):
        secondNum = target - num
        if lookupDict.get(secondNum) != None: return [i, lookupDict[secondNum]]
        lookupDict[num] = i