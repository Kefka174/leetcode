from typing import List

class Solution:
    def minimumCost(self, cost: List[int]) -> int:
        sortedCandies = sorted(cost, reverse = True)
        minCost, candiesSold, index = 0, 0, 0
        while index < len(sortedCandies):
            minCost += sortedCandies[index]
            if candiesSold % 2 != 0:
                index += 1

            candiesSold += 1
            index += 1
        return minCost