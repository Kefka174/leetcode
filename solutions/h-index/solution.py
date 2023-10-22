from typing import List
from heapq import heapify, heappop

class Solution:
    def hIndex(self, citations: List[int]) -> int: # O(nlogn)
        maxH = 0
        citationHeap = citations.copy()
        heapify(citationHeap)
        while citationHeap and citationHeap[0] <= len(citationHeap):
            maxH = heappop(citationHeap)
        
        return max(maxH, len(citationHeap))