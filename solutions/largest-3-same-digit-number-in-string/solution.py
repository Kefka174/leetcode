class Solution:
    def largestGoodInteger(self, num: str) -> str:
        largestInteger = ""
        for i in range(3, len(num) + 1):
            if (num[i - 3] == num[i - 2] == num[i - 1]
                and (not largestInteger or num[i - 3] > largestInteger[0])):
                largestInteger = num[i-3:i]
        return largestInteger