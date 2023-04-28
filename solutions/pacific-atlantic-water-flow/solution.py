"""
:type heights: List[List[int]]
:rtype: List[List[int]]
"""
def pacificAtlantic(heights): # flood uphill from each ocean - o(m*n)
    pacificCells = {}
    for x in range(len(heights[0])): pacificCells[(x, 0)] = None # add top row
    for y in range(1, len(heights)): pacificCells[(0, y)] = None # add left column
    oceanFlood(heights, pacificCells)

    atlanticCells = {}
    for x in range(len(heights[0])): atlanticCells[(x, len(heights) - 1)] = None # add bottom row
    for y in range(len(heights) - 1): atlanticCells[(len(heights[0]) - 1, y)] = None # add right column
    oceanFlood(heights, atlanticCells)

    results = []
    for cell in (pacificCells.viewkeys() & atlanticCells.viewkeys()):
        results.append([cell[1], cell[0]])
    return results

def oceanFlood(heights, oceanDict): 
    processedCells = {}
    cellsToProcess = oceanDict.copy()
    while cellsToProcess:
        currentCell = cellsToProcess.popitem()[0]
        processedCells[(currentCell[0], currentCell[1])] = None
        nextNeighbor = (0, -1)
        for i in range(4): # loop over cardinal neighbors
            neighborX = currentCell[0] + nextNeighbor[0]
            neighborY = currentCell[1] + nextNeighbor[1]
            neighborOutOfBounds = neighborX < 0 or neighborX == len(heights[0]) or neighborY < 0 or neighborY == len(heights)
            neighborUnprocessed = (neighborX, neighborY) not in processedCells

            if not neighborOutOfBounds and neighborUnprocessed and heights[neighborY][neighborX] >= heights[currentCell[1]][currentCell[0]]:
                cellsToProcess[(neighborX, neighborY)] = None
                oceanDict[(neighborX, neighborY)] = None
            nextNeighbor = (nextNeighbor[1], -nextNeighbor[0])



assert pacificAtlantic([[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]) == [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
assert pacificAtlantic([[1]]) == [[0,0]]
assert pacificAtlantic([[2,1],[1,2]]) == [[0,0],[0,1],[1,0],[1,1]]