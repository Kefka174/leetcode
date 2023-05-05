from collections import Counter
"""
:type s: str
:type t: str
:rtype: str
"""
def minWindow(s, t):
    charsNeeded = len(t)
    neededCharsCount = Counter(t)
    minWindowString = ""

    startIndex = 0
    for endIndex in range(len(s)):
        if s[endIndex] in neededCharsCount:
            if neededCharsCount[s[endIndex]] > 0: charsNeeded -= 1
            neededCharsCount[s[endIndex]] -= 1
        
        while not charsNeeded:
            if (minWindowString == "") != (len(minWindowString) > endIndex - startIndex): minWindowString = s[startIndex:endIndex + 1]

            if s[startIndex] in neededCharsCount:
                neededCharsCount[s[startIndex]] += 1
                if neededCharsCount[s[startIndex]] > 0: charsNeeded += 1
            startIndex += 1
            
    return minWindowString



assert minWindow("adrcabdt", "abc") == "cab"
assert minWindow("ADOBECODEBANC", "ABC") == "BANC"
assert minWindow("a", "a") == "a"
assert minWindow("a", "aa") == ""