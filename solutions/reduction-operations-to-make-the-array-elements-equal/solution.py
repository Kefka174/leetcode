from typing import List
from collections import Counter

class Solution:
    def reductionOperations(self, nums: List[int]) -> int: # O(nlogn)
        opCount, largestValFrequency = 0, 0
        for _, frequency in sorted(Counter(nums).items(), reverse = True)[:-1]:
            largestValFrequency += frequency
            opCount += largestValFrequency
        return opCount