from typing import List
from itertools import zip_longest

class Solution:
    def garbageCollection(self, garbage: List[str], travel: List[int]) -> int:
        metalCost = self.collectGarbageType('M', garbage, travel)
        paperCost = self.collectGarbageType('P', garbage, travel)
        glassCost = self.collectGarbageType('G', garbage, travel)
        return metalCost + paperCost + glassCost

    def collectGarbageType(self, garbageType: str, garbage: List[str], travel: List[int]) -> int:
        totalCost, travelCost = 0, 0
        for house, travelToNextHouse in zip_longest(garbage, travel, fillvalue = 0):
            typeCount = house.count(garbageType)
            if typeCount > 0:
                totalCost += typeCount + travelCost
                travelCost = 0
            travelCost += travelToNextHouse
        return totalCost