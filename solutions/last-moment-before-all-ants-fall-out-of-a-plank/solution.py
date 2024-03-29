from typing import List

class Solution:
    def getLastMoment(self, n: int, left: List[int], right: List[int]) -> int:
        time = 0
        if left:
            time = max(left)
        if right:
            time = max(time, n - min(right))
        return time