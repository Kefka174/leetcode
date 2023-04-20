"""
:type grid: List[List[int]]
:rtype: List[int]
"""
def findBall(grid): # o(m*n) simulation
    results = [-1 for i in range(len(grid[0]))]
    ballLocations = {}
    for i in range(len(grid[0])): ballLocations[i] = (i, 0)

    for currentHeight in range(len(grid)):
        for ball in list(ballLocations):
            currentX = ballLocations[ball][0]
            currentY = ballLocations[ball][1]
            nextX = currentX + grid[currentY][currentX]

            goingOutOfBounds = nextX < 0 or nextX == len(grid[0])
            # remove from ballLocations if ball is going out of bounds or getting stuck
            if goingOutOfBounds or grid[currentY][currentX] != grid[currentY][nextX]: ballLocations.pop(ball)
            else: ballLocations[ball] = (nextX, currentY + 1)

    for ball in ballLocations: results[ball] = ballLocations[ball][0]

    return results



assert findBall([[1,1,1,-1,-1],[1,1,1,-1,-1],[-1,-1,-1,1,1],[1,1,1,1,-1],[-1,-1,-1,-1,-1]]) == [1,-1,-1,-1,-1]
assert findBall([[-1]]) == [-1]