# Set Matrix Zeroes

Given an <code>m x n</code> integer matrix <code>matrix</code>, if an element is <code>0</code>, set its entire row and column to <code>0</code>'s.

You must do it <a href="https://en.wikipedia.org/wiki/In-place_algorithm" target="_blank">in place</a>.


**Example 1:**
>
> **Input:** matrix = [[1,1,1],[1,0,1],[1,1,1]]
>
> **Output:** [[1,0,1],[0,0,0],[1,0,1]]

**Example 2:**
>
> **Input:** matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
>
> **Output:** [[0,0,0,0],[0,4,5,0],[0,3,1,0]]


**Constraints:**

- <code>m == matrix.length</code>

- <code>n == matrix[0].length</code>

- <code>1 &lt;= m, n &lt;= 200</code>

- <code>-2<sup>31</sup> &lt;= matrix[i][j] &lt;= 2<sup>31</sup> - 1</code>


**Follow up:**

- A straightforward solution using <code>O(mn)</code> space is probably a bad idea.

- A simple improvement uses <code>O(m + n)</code> space, but still not the best solution.

- Could you devise a constant space solution?
