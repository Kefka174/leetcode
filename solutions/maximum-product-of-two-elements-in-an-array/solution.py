from typing import List

class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        largest, secondLargest = max(nums[0], nums[1]), min(nums[0], nums[1])
        for num in nums[2:]:
            if num > largest:
                secondLargest = largest
                largest = num
            elif num > secondLargest:
                secondLargest = num
        return (largest - 1) * (secondLargest - 1)