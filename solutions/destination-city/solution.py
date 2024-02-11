from typing import List

class Solution:
    def destCity(self, paths: List[List[str]]) -> str:
        pathMap = {start: destination for start, destination in paths}
        currentCity = paths[0][0]
        while currentCity in pathMap:
            currentCity = pathMap[currentCity]
        return currentCity