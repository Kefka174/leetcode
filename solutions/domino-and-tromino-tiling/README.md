# Domino and Tromino Tiling

You have two types of tiles: a <code>2 x 1</code> domino shape and a tromino shape. You may rotate these shapes.

Given an integer n, return *the number of ways to tile an* <code>2 x n</code> *board*. Since the answer may be very large, return it **modulo** <code>10<sup>9</sup> + 7</code>.

In a tiling, every square must be covered by a tile. Two tilings are different if and only if there are two 4-directionally adjacent cells on the board such that exactly one of the tilings has both squares occupied by a tile.


**Example 1:**
>
> **Input:** n = 3
>
> **Output:** 5
>
> **Explanation:** The five different ways are show above.

**Example 2:**
>
> **Input:** n = 1
>
> **Output:** 1


**Constraints:**

- <code>1 &lt;= n &lt;= 1000</code>
