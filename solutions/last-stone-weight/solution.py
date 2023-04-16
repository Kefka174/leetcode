from heapq import heappop, heappush, heapify
"""
:type stones: List[int]
:rtype: int
"""
def lastStoneWeight(stones): # o(nlogn)
    stones = [-x for x in stones]
    heapify(stones)

    while len(stones) > 1:
        largest = heappop(stones)
        second = heappop(stones)
        if largest != second:
            heappush(stones, largest - second)
            
    if len(stones) == 0: return 0
    return stones[0] * -1

assert lastStoneWeight([2,7,4,1,8,1]) == 1
assert lastStoneWeight([1]) == 1
assert lastStoneWeight([14,14]) == 0
assert lastStoneWeight([14,7,4]) == 3