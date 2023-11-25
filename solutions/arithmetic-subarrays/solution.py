from typing import List

class Solution:
    # O(m * nlogn)
    def checkArithmeticSubarrays(self, nums: List[int], l: List[int], r: List[int]) -> List[bool]:
        subarrayIsArithmetic = [False] * len(r)
        for i in range(len(r)):
            subarrayIsArithmetic[i] = self.arrIsArithmetic(nums[l[i] : r[i] + 1])
        return subarrayIsArithmetic
    
    def arrIsArithmetic(self, arr: List[int]) -> bool:
        arr.sort()
        diff = arr[1] - arr[0]
        for i in range(2, len(arr)):
            if arr[i] - arr[i - 1] != diff:
                return False
        return True