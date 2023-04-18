"""
:type n: int
:rtype: bool
"""
def isHappy(n):
    seenDigits = {n}
    happyN = n
    while happyN != 1:
        nextHappyN = 0
        for digit in str(happyN): nextHappyN += int(digit)**2
        happyN = nextHappyN

        if happyN in seenDigits: return False
        seenDigits.add(happyN)
    return True

def nextHappy(n):
    next = 0
    for digit in str(n): next += int(digit)**2
    return next

def isHappyFloyds(n): # using Floyd's cycle detection algorithm
    slow = n
    fast = n
    while True:
        slow = nextHappy(slow)
        fast = nextHappy(nextHappy(fast))
        if fast == 1: return True
        if slow == fast: return False

assert isHappyFloyds(19) == True
assert isHappyFloyds(2) == False
assert isHappyFloyds(3) == False
assert isHappyFloyds(10) == True