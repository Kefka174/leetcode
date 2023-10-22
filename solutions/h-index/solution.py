from typing import List
from heapq import heapify, heappop

class Solution:
    def hIndexCountingSort(self, citations: List[int]) -> int: # O(n)
        citeCounts = [0] * (len(citations) + 1)
        for cite in citations:
            citeCounts[min(cite, len(citations))] += 1

        papersInH = 0
        for hVal in range(len(citations), -1, -1):
            papersInH += citeCounts[hVal]
            if papersInH >= hVal:
                return hVal


    #################################################################
    def hIndexHeap(self, citations: List[int]) -> int: # O(nlogn)
        maxH = 0
        citationHeap = citations.copy()
        heapify(citationHeap)
        while citationHeap and citationHeap[0] <= len(citationHeap):
            maxH = heappop(citationHeap)
        
        return max(maxH, len(citationHeap))