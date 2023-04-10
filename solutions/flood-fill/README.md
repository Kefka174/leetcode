# Flood Fill

An image is represented by an <code>m x n</code> integer grid <code>image</code> where <code>image[i][j]</code> represents the pixel value of the image.

You are also given three integers <code>sr</code>, <code>sc</code>, and <code>color</code>. You should perform a **flood fill** on the image starting from the pixel <code>image[sr][sc]</code>.

To perform a **flood fill**, consider the starting pixel, plus any pixels connected **4-directionally** to the starting pixel of the same color as the starting pixel, plus any pixels connected **4-directionally** to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with <code>color</code>.

Return *the modified image after performing the flood fill*.


**Example 1:**
>
> **Input:** image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
>
> **Output:** [[2,2,2],[2,2,0],[2,0,1]]
>
> **Explanation:** From the center of the image with position (sr, sc) = (1, 1) (i.e., the red pixel), all pixels connected by a path of the same color as the starting pixel (i.e., the blue pixels) are colored with the new color.
>
> Note the bottom corner is not colored 2, because it is not 4-directionally connected to the starting pixel.

**Example 2:**
>
> **Input:** image = [[0,0,0],[0,0,0]], sr = 0, sc = 0, color = 0
>
> **Output:** [[0,0,0],[0,0,0]]
>
> **Explanation:** The starting pixel is already colored 0, so no changes are made to the image.


**Constraints:**

- <code>m == image.length</code>

- <code>n == image[i].length</code>

- <code>1 &lt;= m, n &lt;= 50</code>

- <code>0 &lt;= image[i][j], color &lt; 2<sup>16</sup></code>

- <code>0 &lt;= sr &lt; m</code>

- <code>0 &lt;= sc &lt; n</code>
