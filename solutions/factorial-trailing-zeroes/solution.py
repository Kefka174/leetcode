from math import factorial

class Solution:
    def trailingZeroes(self, n: int) -> int:
        nFactorial = factorial(n)
        zeroCount = 0
        while nFactorial % 10 == 0:
            nFactorial /= 10
            zeroCount += 1
        return zeroCount