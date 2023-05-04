"""
:type nums: List[int]
:rtype: int
"""
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



assert maxProduct([2,3,-2,4]) == 6
assert maxProduct([-2,0,-1]) == 0
assert maxProduct([0,2]) == 2
assert maxProduct([3,-1,4]) == 4
assert maxProduct([5,6,7,-2,6,7,8]) == 336
assert maxProduct([2,-5,-2,2,-4,3]) == 48
assert maxProduct([-1,-2,-3,0]) == 6
assert maxProduct([-1,0,-2,2]) == 2
assert maxProduct([-2,1,0]) == 1