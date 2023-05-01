from collections import OrderedDict
"""
:type coins: List[int]
:type amount: int
:rtype: int
"""
# bottom-up dp
def coinChangeDP(coins, amount):
    minCoinsToTarget = {}
    minCoinsToTarget[0] = 0

    for target in range(1, amount + 1):
        if target not in minCoinsToTarget: minCoinsToTarget[target] = float('inf')
        for coin in coins:
            if coin <= target:
                minCoinsToTarget[target] = min(minCoinsToTarget[target], minCoinsToTarget[target - coin] + 1)

    if minCoinsToTarget[amount] == float('inf'): return -1
    return minCoinsToTarget[amount]



# top-down dfs, each target up to ammount gets visited twice at most
def coinChange(coins, amount):
    minCoinsToTarget = {}
    minCoinsToTarget[0] = 0

    targetStack = OrderedDict()
    targetStack[amount] = None

    while targetStack:
        currentTarget, _ = targetStack.popitem()
        if currentTarget not in minCoinsToTarget: minCoinsToTarget[currentTarget] = float('inf')
        
        for coin in coins:
            if coin <= currentTarget:
                if currentTarget - coin not in minCoinsToTarget:
                    targetStack[currentTarget] = None
                    targetStack[currentTarget - coin] = targetStack.pop(currentTarget - coin, None)
                else:
                    coinCountUsingCoin = minCoinsToTarget[currentTarget - coin] + 1
                    minCoinsToTarget[currentTarget] = min(coinCountUsingCoin, minCoinsToTarget[currentTarget])
                    
    if minCoinsToTarget[amount] == float('inf'): return -1
    return minCoinsToTarget[amount]
            


def coinChangeUnoptomized(coins, amount):
    if len(coins) == 0 or amount < 0: return -1
    if amount == 0: return 0

    usingFirstCoin = 1 + coinChangeUnoptomized(coins, amount - coins[0])
    passingFirstCoin = coinChangeUnoptomized(coins[1:], amount)

    if usingFirstCoin < 1: return passingFirstCoin
    if passingFirstCoin == -1: return usingFirstCoin

    return min(usingFirstCoin, passingFirstCoin)



assert coinChangeDP([1,2,5], 11) == 3
assert coinChangeDP([1,2,5], 4) == 2
assert coinChangeDP([2], 3) == -1
assert coinChangeDP([1], 0) == 0
assert coinChangeDP([7,5,1], 10) == 2
assert coinChangeDP([3,7,405,436], 8839) == 25