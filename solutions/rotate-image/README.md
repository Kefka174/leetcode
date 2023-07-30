# Rotate Image

You are given an <code>n x n</code> 2D <code>matrix</code> representing an image, rotate the image by **90** degrees (clockwise).

You have to rotate the image <a href="https://en.wikipedia.org/wiki/In-place_algorithm" target="_blank">**in-place**</a>, which means you have to modify the input 2D matrix directly. **DO NOT** allocate another 2D matrix and do the rotation.


**Example 1:**
>
> **Input:** matrix = [[1,2,3],[4,5,6],[7,8,9]]
>
> **Output:** [[7,4,1],[8,5,2],[9,6,3]]

**Example 2:**
>
> **Input:** matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
>
> **Output:** [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]


**Constraints:**

- <code>n == matrix.length == matrix[i].length</code>

- <code>1 &lt;= n &lt;= 20</code>

- <code>-1000 &lt;= matrix[i][j] &lt;= 1000</code>
