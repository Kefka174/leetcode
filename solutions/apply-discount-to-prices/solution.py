from re import findall, split

class Solution:
    def discountPrices(self, sentence: str, discount: int) -> str:
        regex = "(?:(?<= \$)|(?<=^\$))\d+(?= |$)"
        discount = (100 - discount)/100
        prices = ['{0:.2f}'.format(int(price) * discount) for price in findall(regex, sentence)]

        modifiedSentance = [''] * (2 * len(prices) + 1)
        modifiedSentance[::2] = split(regex, sentence)
        modifiedSentance[1::2] = prices
        return ''.join(modifiedSentance)