from typing import List

class Solution:
    def findDifferentBinaryString(self, nums: List[str]) -> str:
        unique = ['0'] * len(nums)
        for i in range(len(nums)):
            if nums[i][i] == '1':
                unique[i] = '0'
            else:
                unique[i] = '1'
        return ''.join(unique)