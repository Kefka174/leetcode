class Solution:
    def isSameAfterReversals(self, num: int) -> bool:
        return (num == 0) or not (num % 10 == 0)
    

    ##################################################
    def isSameAfterReversalsManual(self, num: int) -> bool:
        reversed = int(str(num)[::-1])
        reReversed = int(str(reversed)[::-1])
        return num == reReversed