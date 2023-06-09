# Coin Change

You are given an integer array <code>coins</code> representing coins of different denominations and an integer <code>amount</code> representing a total amount of money.

Return *the fewest number of coins that you need to make up that amount*. If that amount of money cannot be made up by any combination of the coins, return <code>-1</code>.

You may assume that you have an infinite number of each kind of coin.


**Example 1:**
>
> **Input:** coins = [1,2,5], amount = 11
>
> **Output:** 3
>
> **Explanation:** 11 = 5 + 5 + 1

**Example 2:**
>
> **Input:** coins = [2], amount = 3
>
> **Output:** -1

**Example 3:**
>
> **Input:** coins = [1], amount = 0
>
> **Output:** 0


**Constraints:**

- <code>1 &lt;= coins.length &lt;= 12</code>

- <code>1 &lt;= coins[i] &lt;= 2<sup>31</sup> - 1</code>

- <code>0 &lt;= amount &lt;= 10<sup>4</sup></code>
