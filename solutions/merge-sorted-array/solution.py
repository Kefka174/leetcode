from typing import List

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        merged = nums1
        nums1 = nums1[:m]

        nums1Index, nums2Index = 0, 0
        while nums1Index + nums2Index < len(merged):
            if (nums2Index == n
                or (nums1Index < m and nums1[nums1Index] <= nums2[nums2Index])):
                merged[nums1Index + nums2Index] = nums1[nums1Index]
                nums1Index += 1
            else:
                merged[nums1Index + nums2Index] = nums2[nums2Index]
                nums2Index += 1