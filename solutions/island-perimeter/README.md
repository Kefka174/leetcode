# Island Perimeter

You are given <code>row x col</code> <code>grid</code> representing a map where <code>grid[i][j] = 1</code> represents&nbsp;land and <code>grid[i][j] = 0</code> represents water.

Grid cells are connected **horizontally/vertically** (not diagonally). The <code>grid</code> is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).

The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.


**Example 1:**
>
> **Input:** grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
>
> **Output:** 16
>
> **Explanation:** The perimeter is the 16 yellow stripes in the image above.

**Example 2:**
>
> **Input:** grid = [[1]]
>
> **Output:** 4

**Example 3:**
>
> **Input:** grid = [[1,0]]
>
> **Output:** 4


**Constraints:**

- <code>row == grid.length</code>

- <code>col == grid[i].length</code>

- <code>1 &lt;= row, col &lt;= 100</code>

- <code>grid[i][j]</code> is <code>0</code> or <code>1</code>.

- There is exactly one island in <code>grid</code>.
