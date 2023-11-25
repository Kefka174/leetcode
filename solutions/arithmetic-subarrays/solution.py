from typing import List

class Solution:
    # O(m*n)
    def checkArithmeticSubarrays(self, nums: List[int], l: List[int], r: List[int]) -> List[bool]:
        subarrayIsArithmetic = [False] * len(r)
        for i in range(len(r)):
            subarrayIsArithmetic[i] = self.arrIsArithmetic(nums[l[i] : r[i] + 1])
        return subarrayIsArithmetic
    
    def arrIsArithmetic(self, arr: List[int]) -> bool:
        minVal, maxVal = min(arr), max(arr)
        diff = (maxVal - minVal) // (len(arr) - 1)
        arrSet = set(arr)

        if diff == 0:
            return len(arrSet) == 1
        
        for num in range(minVal, maxVal + 1, diff):
            if num not in arrSet:
                return False
        return True