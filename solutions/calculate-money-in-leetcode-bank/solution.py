class Solution:
    def totalMoney(self, n: int) -> int:
        numWeeks = n // 7
        numDays = n % 7

        # derived from Sum of an Arithmetic Sequence formula
        fullWeekTotal = 7 * numWeeks * (8 + (numWeeks - 1)) // 2
        partialWeekTotal = int(numDays * (numWeeks + 1 + (numDays - 1) / 2))
        return fullWeekTotal + partialWeekTotal