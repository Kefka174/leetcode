from collections import defaultdict
"""
:type secret: str
:type guess: str
:rtype: str
"""
def getHint(self, secret, guess):
    bulls, cows = 0, 0
    cowDict = defaultdict(int)

    for i in range(len(guess)):
        if guess[i] == secret[i]: bulls += 1
        else:
            secretCharInDict = cowDict.get(secret[i])
            guessCharInDict = cowDict.get(guess[i])

            if secretCharInDict < 0 and secretCharInDict != None: cows += 1
            if guessCharInDict > 0: cows += 1

            cowDict[secret[i]] += 1
            cowDict[guess[i]] -= 1

    return str(bulls) + "A" + str(cows) + "B"