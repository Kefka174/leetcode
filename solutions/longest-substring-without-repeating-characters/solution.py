"""
:type s: str
:rtype: int
"""
def lengthOfLongestSubstring(s):
    if not s: return 0

    longestSubstringLength = 1
    letterSet = {s[0]}
    startIndex = 0
    endIndex = 1
    while endIndex < len(s):
        if s[endIndex] in letterSet:
            while s[startIndex] != s[endIndex]:
                letterSet.remove(s[startIndex])
                startIndex += 1
            startIndex += 1
        else: letterSet.add(s[endIndex])

        longestSubstringLength = max(longestSubstringLength, len(letterSet))
        endIndex += 1
    
    return longestSubstringLength



assert lengthOfLongestSubstring("abcabcbb") == 3
assert lengthOfLongestSubstring("bbbbb") == 1
assert lengthOfLongestSubstring("pwwkew") == 3