from typing import List, Dict, Set

class Solution:
    def restoreArray(self, adjacentPairs: List[List[int]]) -> List[int]:
        possibleEndpoints = set()
        neighborMap = {}
        for a, b in adjacentPairs:
            self.processNeighbors(a, b, neighborMap, possibleEndpoints)
            self.processNeighbors(b, a, neighborMap, possibleEndpoints)
        
        startingElement = next(iter(possibleEndpoints))
        restoredArray, index = [startingElement] * len(neighborMap), 0
        while len(neighborMap) > 1:
            currentElement = restoredArray[index]
            index += 1
            
            if len(neighborMap[currentElement]) == 1 or neighborMap[currentElement][1] not in neighborMap:
                restoredArray[index] = neighborMap[currentElement][0]
            else:
                restoredArray[index] = neighborMap[currentElement][1]
            
            neighborMap.pop(currentElement)

        return restoredArray

    def processNeighbors(self, a: int, b: int, map: Dict[int, List[int]], endpointSet: Set[int]) -> None:
        if a in map:
            map[a].append(b)
            endpointSet.remove(a)
        else:
            map[a] = [b]
            endpointSet.add(a)