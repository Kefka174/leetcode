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

assert isHappy(19) == True
assert isHappy(2) == False
assert isHappy(3) == False