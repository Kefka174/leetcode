from collections import Counter

class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        frequencyMap = Counter(magazine)
        for char in ransomNote:
            if char in frequencyMap:
                if frequencyMap[char] == 1:
                    del frequencyMap[char]
                else:
                    frequencyMap[char] -= 1
            else:
                return False
        return True