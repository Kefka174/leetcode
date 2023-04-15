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