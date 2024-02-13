from typing import List

class Solution:
    def maxProductDifference(self, nums: List[int]) -> int:
        smallest, secondSmallest, secondLargest, largest = sorted(nums[:4])
        for num in nums[4:]:
            if num > largest:
                largest, secondLargest = num, largest
            elif num > secondLargest:
                secondLargest = num
            elif num < smallest:
                smallest, secondSmallest = num, smallest
            elif num < secondSmallest:
                secondSmallest = num
        return (largest * secondLargest) - (smallest * secondSmallest)