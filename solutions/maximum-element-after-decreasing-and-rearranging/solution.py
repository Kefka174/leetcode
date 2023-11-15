from typing import List
from collections import Counter

class Solution:
    # could use counting sort for O(n) time and space
    def maximumElementAfterDecrementingAndRearranging(self, arr: List[int]) -> int: # O(nlogn)
        maxElement = 0
        for val, frequency in sorted(Counter(arr).items()):
            maxElement = min(val, maxElement + frequency)
        return maxElement