"""
:type asteroids: List[int]
:rtype: List[int]
"""
def asteroidCollision(asteroids):
    finalAsteroids = [asteroids[0]]
    for currentAsteroid in asteroids[1:]:
        while finalAsteroids and currentAsteroid < 0 and finalAsteroids[-1] > 0: # asteroids will collide
            previousAsteroid = finalAsteroids[-1]
            if abs(currentAsteroid) >= abs(previousAsteroid): finalAsteroids.pop()
            if abs(currentAsteroid) <= abs(previousAsteroid): currentAsteroid = 0
        if currentAsteroid != 0: finalAsteroids.append(currentAsteroid)

    return finalAsteroids



assert asteroidCollision([5,10,-5]) == [5,10]
assert asteroidCollision([8,-8]) == []
assert asteroidCollision([10,2,-5]) == [10]
assert asteroidCollision([1,-2,-2,-2]) == [-2,-2,-2]