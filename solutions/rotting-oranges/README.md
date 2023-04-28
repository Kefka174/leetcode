# Rotting Oranges

You are given an <code>m x n</code> <code>grid</code> where each cell can have one of three values:

- <code>0</code> representing an empty cell,

- <code>1</code> representing a fresh orange, or

- <code>2</code> representing a rotten orange.

Every minute, any fresh orange that is **4-directionally adjacent** to a rotten orange becomes rotten.

Return *the minimum number of minutes that must elapse until no cell has a fresh orange*. If *this is impossible, return* <code>-1</code>.


**Example 1:**
>
> **Input:** grid = [[2,1,1],[1,1,0],[0,1,1]]
>
> **Output:** 4

**Example 2:**
>
> **Input:** grid = [[2,1,1],[0,1,1],[1,0,1]]
>
> **Output:** -1
>
> **Explanation:** The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.

**Example 3:**
>
> **Input:** grid = [[0,2]]
>
> **Output:** 0
>
> **Explanation:** Since there are already no fresh oranges at minute 0, the answer is just 0.


**Constraints:**

- <code>m == grid.length</code>

- <code>n == grid[i].length</code>

- <code>1 &lt;= m, n &lt;= 10</code>

- <code>grid[i][j]</code> is <code>0</code>, <code>1</code>, or <code>2</code>.
