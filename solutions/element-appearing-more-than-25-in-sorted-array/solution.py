from typing import List

class Solution:
    def findSpecialInteger(self, arr: List[int]) -> int:
        currentNum, currentNumCount = arr[0], 0
        for num in arr:
            if num == currentNum:
                currentNumCount += 1
            else:
                currentNum = num
                currentNumCount = 1
            
            if currentNumCount > len(arr) / 4:
                return currentNum