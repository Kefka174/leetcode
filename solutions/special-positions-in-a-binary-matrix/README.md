# Special Positions in a Binary Matrix

Given an <code>m x n</code> binary matrix <code>mat</code>, return *the number of special positions in *<code>mat</code>*.*

A position <code>(i, j)</code> is called **special** if <code>mat[i][j] == 1</code> and all other elements in row <code>i</code> and column <code>j</code> are <code>0</code> (rows and columns are **0-indexed**).


**Example 1:**
>
> **Input:** mat = [[1,0,0],[0,0,1],[1,0,0]]
>
> **Output:** 1
>
> **Explanation:** (1, 2) is a special position because mat[1][2] == 1 and all other elements in row 1 and column 2 are 0.

**Example 2:**
>
> **Input:** mat = [[1,0,0],[0,1,0],[0,0,1]]
>
> **Output:** 3
>
> **Explanation:** (0, 0), (1, 1) and (2, 2) are special positions.


**Constraints:**

- <code>m == mat.length</code>

- <code>n == mat[i].length</code>

- <code>1 &lt;= m, n &lt;= 100</code>

- <code>mat[i][j]</code> is either <code>0</code> or <code>1</code>.
