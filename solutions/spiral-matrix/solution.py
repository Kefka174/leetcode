"""
:type matrix: List[List[int]]
:rtype: List[int]
"""
# cleaned up by re-writing matrix elements and using a travel direction list
def spiralOrderCleaner(matrix):
    returnList = []
    indexCoords = [0, 0]
    travelDirection = [1, 0]
    
    while len(returnList) < len(matrix[0]) * len(matrix):
        indexVal = matrix[indexCoords[1]][indexCoords[0]]
        nextCoords = [indexCoords[0] + travelDirection[0], indexCoords[1] + travelDirection[1]]
        returnList.append(indexVal)
        matrix[indexCoords[1]][indexCoords[0]] = 'x'
        
        indexAtEndOfLine = nextCoords[0] == len(matrix[0]) or nextCoords[1] == len(matrix) or nextCoords[0] < 0
        if indexAtEndOfLine or matrix[nextCoords[1]][nextCoords[0]] == 'x':
            travelDirection = [-travelDirection[1], travelDirection[0]] # rotate direction
            nextCoords = [indexCoords[0] + travelDirection[0], indexCoords[1] + travelDirection[1]] # recalculate next coords
        indexCoords = nextCoords
    return returnList



# uses shrinking travel distance counters and too many if-statements
def spiralOrder(matrix):
    returnList = []
    indexCoords = [0, 0]
    maxLengthTravelDistance = len(matrix[0])
    maxHeightTravelDistance = len(matrix) - 1

    direction = "right"
    distanceTravelled = 0
    while len(returnList) < len(matrix)*len(matrix[0]): # condition statements could be cleaned up
        returnList.append(matrix[indexCoords[0]][indexCoords[1]])
        distanceTravelled += 1
        
        if direction == "right":
            if distanceTravelled < maxLengthTravelDistance: indexCoords[1] += 1
            else:
                maxLengthTravelDistance -= 1
                distanceTravelled = 0
                direction = "down"
                indexCoords[0] += 1
        elif direction == "down":
            if distanceTravelled < maxHeightTravelDistance: indexCoords[0] += 1
            else:
                maxHeightTravelDistance -= 1
                distanceTravelled = 0
                direction = "left"
                indexCoords[1] -= 1
        elif direction == "left":
            if distanceTravelled < maxLengthTravelDistance: indexCoords[1] -= 1
            else:
                maxLengthTravelDistance -= 1
                distanceTravelled = 0
                direction = "up"
                indexCoords[0] -= 1
        elif direction == "up":
            if distanceTravelled < maxHeightTravelDistance: indexCoords[0] -= 1
            else:
                maxHeightTravelDistance -= 1
                distanceTravelled = 0
                direction = "right"
                indexCoords[1] += 1
    return returnList

assert spiralOrderCleaner([[1,2,3],[4,5,6],[7,8,9]]) == [1,2,3,6,9,8,7,4,5]
assert spiralOrderCleaner([[1,2,3,4],[5,6,7,8],[9,10,11,12]]) == [1,2,3,4,8,12,11,10,9,5,6,7]