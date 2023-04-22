"""
:type words: List[str]
:rtype: int
"""
def longestPalindrome(words):
    wordDict = {}
    palindromeLength = 0
    for word in words:
        if word in wordDict:
            palindromeLength += 2*len(word)
            wordDict[word] -= 1
            if wordDict[word] == 0: wordDict.pop(word)
        else: wordDict[word[1] + word[0]] = wordDict.get(word[1] + word[0], 0) + 1
    
    for word in wordDict:
        if word[0] == word[1]: return palindromeLength + len(word)

    return palindromeLength


assert longestPalindrome(["lc","cl","gg"]) == 6
assert longestPalindrome(["ab","ty","yt","lc","cl","ab"]) == 8
assert longestPalindrome(["cc","ll","xx"]) == 2
assert longestPalindrome(["ll","lb","bb","bx","xx","lx","xx","lx","ll","xb","bx","lb","bb","lb","bl","bb","bx","xl","lb","xx"]) == 26
assert longestPalindrome(["qo","fo","fq","qf","fo","ff","qq","qf","of","of","oo","of","of","qf","qf","of"]) == 14