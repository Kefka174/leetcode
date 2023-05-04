"""
:type nums: List[int]
:rtype: int
"""
# Tracks the maximum and minimum product ending at each index
def maxProductUpToIndex(nums): #o(n)
    maxProductFound = nums[0]
    maxUpToIndex = nums[0]
    minUpToIndex = nums[0]

    for i in range(1, len(nums)):
        # a negative num flips the product around 0, so min becomes max and vice versa
        if nums[i] < 0: maxUpToIndex, minUpToIndex = minUpToIndex, maxUpToIndex
        
        maxUpToIndex = max(nums[i], maxUpToIndex * nums[i])
        minUpToIndex = min(nums[i], minUpToIndex * nums[i])

        if maxUpToIndex > maxProductFound: maxProductFound = maxUpToIndex

    return maxProductFound


##########################################################################################
# Tracks the current running product and the product after an odd number of negative signs
def maxProduct(nums): # o(n)
    maxProductFound = nums[0]
    currentProduct = maxProductFound
    afterFirstNegative = None

    for i in range(1, len(nums)):
        if currentProduct != 0: currentProduct *= nums[i]
        else: currentProduct = nums[i]

        if afterFirstNegative != None:
            afterFirstNegative *= nums[i]

            if currentProduct > 0 and currentProduct < afterFirstNegative: 
                currentProduct = afterFirstNegative
                afterFirstNegative = None
            
            if afterFirstNegative == 0: afterFirstNegative = None
        elif nums[i - 1] < 0: afterFirstNegative = nums[i]

        if currentProduct > maxProductFound: maxProductFound = currentProduct
        if afterFirstNegative != None and afterFirstNegative > maxProductFound: maxProductFound = afterFirstNegative
        
    return maxProductFound



assert maxProductUpToIndex([2,3,-2,4]) == 6
assert maxProductUpToIndex([-2,0,-1]) == 0
assert maxProductUpToIndex([0,2]) == 2
assert maxProductUpToIndex([3,-1,4]) == 4
assert maxProductUpToIndex([5,6,7,-2,6,7,8]) == 336
assert maxProductUpToIndex([2,-5,-2,2,-4,3]) == 48
assert maxProductUpToIndex([-1,-2,-3,0]) == 6
assert maxProductUpToIndex([-1,0,-2,2]) == 2
assert maxProductUpToIndex([-2,1,0]) == 1