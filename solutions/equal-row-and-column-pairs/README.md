# Equal Row and Column Pairs

Given a **0-indexed** <code>n x n</code> integer matrix <code>grid</code>, *return the number of pairs *<code>(r<sub>i</sub>, c<sub>j</sub>)</code>* such that row *<code>r<sub>i</sub></code>* and column *<code>c<sub>j</sub></code>* are equal*.

A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).


**Example 1:**
>
> **Input:** grid = [[3,2,1],[1,7,6],[2,7,7]]
>
> **Output:** 1
>
> **Explanation:** There is 1 equal row and column pair:
>
> - (Row 2, Column 1): [2,7,7]

**Example 2:**
>
> **Input:** grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
>
> **Output:** 3
>
> **Explanation:** There are 3 equal row and column pairs:
>
> - (Row 0, Column 0): [3,1,2,2]
>
> - (Row 2, Column 2): [2,4,2,2]
>
> - (Row 3, Column 2): [2,4,2,2]


**Constraints:**

- <code>n == grid.length == grid[i].length</code>

- <code>1 &lt;= n &lt;= 200</code>

- <code>1 &lt;= grid[i][j] &lt;= 10<sup>5</sup></code>
