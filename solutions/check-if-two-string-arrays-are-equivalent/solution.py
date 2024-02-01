from typing import List

class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        return self.stringListToCharList(word1) == self.stringListToCharList(word2)

    def stringListToCharList(self, wordList: List[str]) -> List[str]:
        return list(letter for word in wordList for letter in word)