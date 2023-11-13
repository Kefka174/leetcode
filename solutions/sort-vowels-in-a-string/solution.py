class Solution:
    def sortVowels(self, s: str) -> str:
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