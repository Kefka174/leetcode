class Solution:
    def countingSortVowels(self, s: str) -> str: # O(n) time, O(1) space
        vowels = ['A', 'E', 'I', 'O', 'U',
                  'a', 'e', 'i', 'o', 'u']
        vowelFrequencies = dict.fromkeys(vowels, 0)
        s = list(s)
        
        for char in s:
            if char in vowels:
                vowelFrequencies[char] += 1

        vowelIndex = 0
        for i, char in enumerate(s):
            if char in vowels:
                while vowelFrequencies[vowels[vowelIndex]] == 0:
                    vowelIndex += 1
                s[i] = vowels[vowelIndex]
                vowelFrequencies[vowels[vowelIndex]] -= 1
        return ''.join(s)


    ##################################################
    def sortVowels(self, s: str) -> str: # O(nlogn) time, O(n) space
        vowels = ('A', 'E', 'I', 'O', 'U',
                  'a', 'e', 'i', 'o', 'u')
        s = list(s)
        
        vowelList, index = ['.'] * len(s), 0
        for char in s:
            if char in vowels:
                vowelList[index] = char
                index += 1

        vowelList, index = vowelList[:index], 0
        vowelList.sort()

        for i, char in enumerate(s):
            if char in vowels:
                s[i] = vowelList[index]
                index += 1
        return ''.join(s)