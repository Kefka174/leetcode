"""
:type matrix: List[List[int]]
:rtype: List[int]
"""
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