from collections import deque
"""
:type routes: List[List[int]]
:type source: int
:type target: int
:rtype: int
"""
def numBusesToDestination(routes, source, target):
    stopBusList = {}
    for bus in range(len(routes)):
        for stop in routes[bus]:
            stopBusList[stop] = stopBusList.get(stop, []) + [bus]
    
    travelQ = deque()
    travelQ.append((source, 0))
    busesRidden = set()
    stopsVisited = set()
    while travelQ:
        currentStop, currentBusCount = travelQ.popleft()
        if currentStop == target: return currentBusCount
        stopsVisited.add(currentStop)
        for bus in stopBusList[currentStop]:
            if bus not in busesRidden:
                busesRidden.add(bus)
                for stop in routes[bus]:
                    if stop not in stopsVisited: travelQ.append((stop, currentBusCount + 1))
    return -1



assert numBusesToDestination([[1,2,7],[3,6,7]], 1, 6) == 2
assert numBusesToDestination([[7,12],[4,5,15],[6],[15,19],[9,12,13]], 15, 12) == -1