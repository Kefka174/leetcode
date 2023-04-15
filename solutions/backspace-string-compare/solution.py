"""
:type s: str
:type t: str
:rtype: bool
"""
def backspaceCompare(self, s, t): # uses o(n) space
    sBackspaced = self.applyBackspaces(s)
    tBackspaced = self.applyBackspaces(t)

    if sBackspaced == tBackspaced: return True
    return False

"""
:type s: str
:rtype: list
"""
def applyBackspaces(self, s):
    finalString = []
    for letter in s:
        if letter == '#':
            if finalString: finalString.pop()
        else: finalString.append(letter)
    return finalString



def backspaceCompareSmaller(self, s, t): # uses o(1) space, needs refactoring
    sCounter = len(s) - 1
    sBackspaces = 0
    tCounter = len(t) - 1
    tBackspaces = 0
    while sCounter >= 0 or tCounter >= 0:
        print("s:" + str(sCounter) + ":" + s[sCounter] + ":" + str(sBackspaces) + " t:" + str(tCounter) + ":" + t[tCounter] + ":" + str(tBackspaces))
        while sCounter >= 0 and (s[sCounter] == '#' or sBackspaces):
            print("handling s:" + s[sCounter] + "\tscounter:" + str(sCounter))
            if s[sCounter] == '#': sBackspaces += 1
            else: sBackspaces -= 1
            sCounter -= 1
        
        while tCounter >= 0 and (t[tCounter] == '#' or tBackspaces):
            print("handling t:" + t[tCounter] + "\ttcounter:" + str(tCounter))
            if t[tCounter] == '#': tBackspaces += 1
            else: tBackspaces -= 1
            tCounter -= 1

        print(str(sCounter) + "   s-t   " + str(tCounter))
        if sCounter < 0 and sCounter == tCounter: return True # both empty
        if s[sCounter] == t[tCounter] and sCounter >= 0 and tCounter >= 0:
            sCounter -= 1
            tCounter -= 1
        else: return False
    return True