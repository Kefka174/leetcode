"""
:type strs: List[str]
:rtype: str
"""
def longestCommonPrefix(strs):
    returnString = ""
    for i in range(len(strs[0])):
        currentLetter = strs[0][i]
        for str in strs:
            if i == len(str) or str[i] != currentLetter: return returnString
        returnString += currentLetter
    return returnString


assert longestCommonPrefix(["flower","flow","flight"]) == "fl"
assert longestCommonPrefix(["dog","racecar","car"]) == ""