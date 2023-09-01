# 01 Matrix

Given an <code>m x n</code> binary matrix <code>mat</code>, return *the distance of the nearest *<code>0</code>* for each cell*.

The distance between two adjacent cells is <code>1</code>.


**Example 1:**
>
> **Input:** mat = [[0,0,0],[0,1,0],[0,0,0]]
>
> **Output:** [[0,0,0],[0,1,0],[0,0,0]]

**Example 2:**
>
> **Input:** mat = [[0,0,0],[0,1,0],[1,1,1]]
>
> **Output:** [[0,0,0],[0,1,0],[1,2,1]]


**Constraints:**

- <code>m == mat.length</code>

- <code>n == mat[i].length</code>

- <code>1 &lt;= m, n &lt;= 10<sup>4</sup></code>

- <code>1 &lt;= m * n &lt;= 10<sup>4</sup></code>

- <code>mat[i][j]</code> is either <code>0</code> or <code>1</code>.

- There is at least one <code>0</code> in <code>mat</code>.
