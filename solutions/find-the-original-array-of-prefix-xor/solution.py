from typing import List

class Solution:
    def findArray(self, pref: List[int]) -> List[int]:
        arr = [pref[0]] * len(pref)
        for i in range(1, len(pref)):
            arr[i] = pref[i - 1] ^ pref[i]
        return arr