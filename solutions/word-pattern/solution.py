class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(' ')
        if len(pattern) != len(words) or len(set(pattern)) != len(set(words)):
            return False
        
        patternMap = {}
        for i, word in enumerate(words):
            if pattern[i] in patternMap and patternMap[pattern[i]] != word:
                return False
            else:
                patternMap[pattern[i]] = word
        return True