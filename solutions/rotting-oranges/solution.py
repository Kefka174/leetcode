"""
:type grid: List[List[int]]
:rtype: int
"""
def orangesRotting(grid): # o(m*n) infection simulation / bfs
    rottenOrangesToProcess = {}
    freshOranges = {}
    for y in range(len(grid)):
        for x in range(len(grid[0])):
            if grid[y][x] == 1: freshOranges[(x,y)] = None
            elif grid[y][x] == 2: rottenOrangesToProcess[(x,y)] = None
    
    if not rottenOrangesToProcess and not freshOranges: return 0

    timePassed = -1
    while rottenOrangesToProcess:
        timePassed += 1
        for coords in rottenOrangesToProcess.keys():
            spreadToNeighbors(coords, freshOranges, rottenOrangesToProcess)
            rottenOrangesToProcess.pop(coords)
    
    if freshOranges: return -1
    return timePassed

# adds the cardinal neighbors of coords to the infected dict
def spreadToNeighbors(coords, uninfectedDict, infectedDict):
    nextDirection = (0, 1)
    for i in range(4):
        neighborX = coords[0] + nextDirection[0]
        neighborY = coords[1] + nextDirection[1]
        if (neighborX, neighborY) in uninfectedDict:
            uninfectedDict.pop((neighborX, neighborY))
            infectedDict[(neighborX, neighborY)] = None

        nextDirection = (-nextDirection[1], nextDirection[0])
    