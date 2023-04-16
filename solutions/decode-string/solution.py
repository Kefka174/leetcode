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


def decodeStringIterative(s):
    i = 0
    stack = [[]]
    while i < len(s):
        if s[i].isdigit():
            multVal = int(s[i])
            while s[i + 1] != '[': # loop to build multi-digit number
                i += 1
                multVal *= 10
                multVal += int(s[i])
            stack.append(multVal)
        elif s[i] == '[':
            stack.append([])
        elif s[i] == ']':
            sequence = stack.pop()
            multVal = stack.pop()
            print(sequence)
            stack[-1] += sequence * multVal
            print(stack)
        else:
            stack[-1].append(s[i])
        i += 1
        
    return "".join(stack[0])


assert decodeStringIterative("3[a]2[bc]") == "aaabcbc"
assert decodeStringIterative("3[a2[c]]") == "accaccacc"
assert decodeStringIterative("2[abc]3[cd]ef") == "abcabccdcdcdef"
assert decodeStringIterative("3[z]2[2[y]pq4[2[jk]e1[f]]]ef") == "zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef"