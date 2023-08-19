# Reshape the Matrix

In MATLAB, there is a handy function called <code>reshape</code> which can reshape an <code>m x n</code> matrix into a new one with a different size <code>r x c</code> keeping its original data.

You are given an <code>m x n</code> matrix <code>mat</code> and two integers <code>r</code> and <code>c</code> representing the number of rows and the number of columns of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the <code>reshape</code> operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.


**Example 1:**
>
> **Input:** mat = [[1,2],[3,4]], r = 1, c = 4
>
> **Output:** [[1,2,3,4]]

**Example 2:**
>
> **Input:** mat = [[1,2],[3,4]], r = 2, c = 4
>
> **Output:** [[1,2],[3,4]]


**Constraints:**

- <code>m == mat.length</code>

- <code>n == mat[i].length</code>

- <code>1 &lt;= m, n &lt;= 100</code>

- <code>-1000 &lt;= mat[i][j] &lt;= 1000</code>

- <code>1 &lt;= r, c &lt;= 300</code>
