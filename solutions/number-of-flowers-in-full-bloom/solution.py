from typing import List
from heapq import heappush, heappop

class Solution:
    def fullBloomFlowers(self, flowers: List[List[int]], people: List[int]) -> List[int]:
        sortedPeople = sorted(zip(people, range(len(people))))
        sortedFlowers = sorted(flowers)
        flowerIndex = 0
        bloomEndMinHeap = []
        flowersInBloom = [None] * len(people)
        for time, personIndex in sortedPeople:
            while (flowerIndex < len(sortedFlowers) and 
                   sortedFlowers[flowerIndex][0] <= time):
                heappush(bloomEndMinHeap, sortedFlowers[flowerIndex][1])
                flowerIndex += 1
            while bloomEndMinHeap and bloomEndMinHeap[0] < time:
                heappop(bloomEndMinHeap)

            flowersInBloom[personIndex] = len(bloomEndMinHeap)

        return flowersInBloom