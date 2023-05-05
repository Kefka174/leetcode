from collections import Counter
"""
:type s: str
:type t: str
:rtype: str
"""
def minWindow(s, t):
    charsNeeded = set(t)
    neededCharsCount = Counter(t)
    minWindowString = ""

    startIndex = 0
    endIndex = 0
    inSubstringWindow = False
    growingWindow = True
    while startIndex < len(s) and endIndex < len(s):
        if not inSubstringWindow:
            if s[startIndex] in charsNeeded: inSubstringWindow = True
            else:
                startIndex += 1
                endIndex += 1
        else: # in a potential substring window
            if growingWindow: # grow window by walking endindex forward
                if s[endIndex] in neededCharsCount: 
                    neededCharsCount[s[endIndex]] -= 1
                    if neededCharsCount[s[endIndex]] < 1 and s[endIndex] in charsNeeded: charsNeeded.remove(s[endIndex])
                if not charsNeeded:
                    if (minWindowString == "") != (len(minWindowString) > endIndex - startIndex): minWindowString = s[startIndex:endIndex + 1]

                    growingWindow = False
                    neededCharsCount[s[startIndex]] += 1
                    if neededCharsCount[s[startIndex]] > 0: charsNeeded.add(s[startIndex])
                    startIndex += 1
                else: endIndex += 1
            else: # shrink window by walking startindex forward
                if s[startIndex] in neededCharsCount:
                    if not charsNeeded:
                        if len(minWindowString) > endIndex - startIndex: minWindowString = s[startIndex:endIndex + 1]
                        
                        neededCharsCount[s[startIndex]] += 1
                        if neededCharsCount[s[startIndex]] > 0: charsNeeded.add(s[startIndex])
                        startIndex += 1
                    else:
                        growingWindow = True
                        endIndex += 1
                else: startIndex += 1
    return minWindowString



assert minWindow("adrcabdt", "abc") == "cab"
assert minWindow("ADOBECODEBANC", "ABC") == "BANC"
assert minWindow("a", "a") == "a"
assert minWindow("a", "aa") == ""