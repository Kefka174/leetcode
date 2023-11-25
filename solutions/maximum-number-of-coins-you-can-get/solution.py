from typing import List
from heapq import heapify, heappop

class Solution:
    def maxCoins(self, piles: List[int]) -> int:
        heap = [-x for x in piles]
        heapify(heap)
        coinTotal = 0
        for _ in range(len(piles) // 3):
            heappop(heap)
            coinTotal += -heappop(heap)
        return coinTotal