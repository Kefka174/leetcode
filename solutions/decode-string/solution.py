"""
:type s: str
:rtype: str
"""
def decodeString(s):
    returnList = []
    finalIndex = 0
    while finalIndex < len(s):
        subList, finalIndex = calcRepeatingSubsequence(s, finalIndex)
        finalIndex += 1
        returnList += subList

    # convert returnList to string
    return "".join(returnList)

def calcRepeatingSubsequence(s, startingIndex):
    sequenceList = []
    i = startingIndex
    
    while i < len(s) and s[i] != ']':
        if s[i].isdigit():
            multVal = 0
            while s[i].isdigit(): # loop to build multi-digit number
                multVal *= 10
                multVal += int(s[i])
                i += 1
            seq, i = calcRepeatingSubsequence(s, i + 1)
            sequenceList += (seq * multVal)
        else:
            sequenceList.append(s[i])
            i += 1
            
    return sequenceList, i + 1


assert decodeString("3[a]2[bc]") == "aaabcbc"
assert decodeString("3[a2[c]]") == "accaccacc"
assert decodeString("2[abc]3[cd]ef") == "abcabccdcdcdef"
assert decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef") == "zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef"