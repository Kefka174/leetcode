from typing import List

class Solution:
    def countNicePairs(self, nums: List[int]) -> int:
        differences, nicePairCount = {}, 0
        for num in nums:
            diff = num - self.reverseNum(num)
            if diff in differences:
                nicePairCount += differences[diff]
                if nicePairCount >= 1000000007:
                    nicePairCount -= 1000000007
                differences[diff] += 1
            else:
                differences[diff] = 1
        return nicePairCount
    
    def reverseNum(self, num: int) -> int:
        reversedNumAsString = str(num).strip('0')[::-1]
        if reversedNumAsString == "":
            return 0
        return int(reversedNumAsString)