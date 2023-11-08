from typing import List

class Solution:
    def findLength(self, nums1: List[int], nums2: List[int]) -> int:
        if len(nums1) < len(nums2):
            nums1, nums2 = nums2, nums1

        maxLengthSeen = 0
        currentCol, prevCol = [0] * (len(nums2) + 1), [0] * (len(nums2) + 1)
        for i in range(len(nums1) - 1, -1, -1):
            for j in range(len(nums2) - 1, -1, -1):
                if nums1[i] == nums2[j]:
                    currentCol[j] = prevCol[j + 1] + 1

                    maxLengthSeen = max(maxLengthSeen, currentCol[j])

            prevCol = currentCol
            currentCol = [0] * (len(nums2) + 1)

        return maxLengthSeen