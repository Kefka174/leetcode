# Transpose Matrix

Given a 2D integer array <code>matrix</code>, return *the **transpose** of* <code>matrix</code>.

The **transpose** of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

<img alt="" src="https://assets.leetcode.com/uploads/2021/02/10/hint_transpose.png" style="width: 600px; height: 197px;">


**Example 1:**
>
> **Input:** matrix = [[1,2,3],[4,5,6],[7,8,9]]
>
> **Output:** [[1,4,7],[2,5,8],[3,6,9]]

**Example 2:**
>
> **Input:** matrix = [[1,2,3],[4,5,6]]
>
> **Output:** [[1,4],[2,5],[3,6]]


**Constraints:**

- <code>m == matrix.length</code>

- <code>n == matrix[i].length</code>

- <code>1 &lt;= m, n &lt;= 1000</code>

- <code>1 &lt;= m * n &lt;= 10<sup>5</sup></code>

- <code>-10<sup>9</sup> &lt;= matrix[i][j] &lt;= 10<sup>9</sup></code>
