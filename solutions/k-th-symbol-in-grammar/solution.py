class Solution:
    def kthGrammar(self, n: int, k: int) -> int: # O(log2(k))
        flipCount = bin(k - 1).count('1')
        return flipCount % 2


    ############################################################
    def kthGrammarVerbose(self, n: int, k: int) -> int: # O(log2(k))
        flipCount = 0
        rowSize = pow(2, n - 1)
        while k > 1:
            rowSize /= 2
            if k > rowSize:
                k -= rowSize
                flipCount += 1

        return flipCount % 2