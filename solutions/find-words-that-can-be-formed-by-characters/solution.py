from typing import List
from collections import Counter

class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        goodChars = Counter(chars)
        goodWordLengthTotal = 0
        for word in words:
            wordCounter = Counter(word)
            if wordCounter & goodChars == wordCounter:
                goodWordLengthTotal += len(word)
        return goodWordLengthTotal