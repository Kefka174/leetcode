from typing import List

class Solution:
    def buildArray(self, target: List[int], n: int) -> List[str]:
        prevNum, ops = 0, []
        for num in target:
            if num - prevNum > 1:
                ops += ["Push", "Pop"] * ((num - prevNum) - 1)
            ops.append("Push")
            prevNum = num
        return ops