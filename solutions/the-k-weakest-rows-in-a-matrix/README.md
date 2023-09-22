# The K Weakest Rows in a Matrix

You are given an <code>m x n</code> binary matrix <code>mat</code> of <code>1</code>'s (representing soldiers) and <code>0</code>'s (representing civilians). The soldiers are positioned **in front** of the civilians. That is, all the <code>1</code>'s will appear to the **left** of all the <code>0</code>'s in each row.

A row <code>i</code> is **weaker** than a row <code>j</code> if one of the following is true:

- The number of soldiers in row <code>i</code> is less than the number of soldiers in row <code>j</code>.

- Both rows have the same number of soldiers and <code>i &lt; j</code>.

Return *the indices of the *<code>k</code>* **weakest** rows in the matrix ordered from weakest to strongest*.


**Example 1:**
>
> **Input:** mat =
>
> [[1,1,0,0,0],
>
> [1,1,1,1,0],
>
> [1,0,0,0,0],
>
> [1,1,0,0,0],
>
> [1,1,1,1,1]],
>
> k = 3
>
> **Output:** [2,0,3]
>
> **Explanation:**
>
> The number of soldiers in each row is:
>
> - Row 0: 2
>
> - Row 1: 4
>
> - Row 2: 1
>
> - Row 3: 2
>
> - Row 4: 5
>
> The rows ordered from weakest to strongest are [2,0,3,1,4].

**Example 2:**
>
> **Input:** mat =
>
> [[1,0,0,0],
>
> [1,1,1,1],
>
> [1,0,0,0],
>
> [1,0,0,0]],
>
> k = 2
>
> **Output:** [0,2]
>
> **Explanation:**
>
> The number of soldiers in each row is:
>
> - Row 0: 1
>
> - Row 1: 4
>
> - Row 2: 1
>
> - Row 3: 1
>
> The rows ordered from weakest to strongest are [0,2,3,1].


**Constraints:**

- <code>m == mat.length</code>

- <code>n == mat[i].length</code>

- <code>2 &lt;= n, m &lt;= 100</code>

- <code>1 &lt;= k &lt;= m</code>

- <code>matrix[i][j]</code> is either 0 or 1.
