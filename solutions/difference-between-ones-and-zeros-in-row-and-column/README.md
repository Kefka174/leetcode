# Difference Between Ones and Zeros in Row and Column

You are given a **0-indexed** <code>m x n</code> binary matrix <code>grid</code>.

A **0-indexed** <code>m x n</code> difference matrix <code>diff</code> is created with the following procedure:

- Let the number of ones in the <code>i<sup>th</sup></code> row be <code>onesRow<sub>i</sub></code>.

- Let the number of ones in the <code>j<sup>th</sup></code> column be <code>onesCol<sub>j</sub></code>.

- Let the number of zeros in the <code>i<sup>th</sup></code> row be <code>zerosRow<sub>i</sub></code>.

- Let the number of zeros in the <code>j<sup>th</sup></code> column be <code>zerosCol<sub>j</sub></code>.

- <code>diff[i][j] = onesRow<sub>i</sub> + onesCol<sub>j</sub> - zerosRow<sub>i</sub> - zerosCol<sub>j</sub></code>

Return *the difference matrix *<code>diff</code>.


**Example 1:**
>
> **Input:** grid = [[0,1,1],[1,0,1],[0,0,1]]
>
> **Output:** [[0,0,4],[0,0,4],[-2,-2,2]]
>
> **Explanation:**
>
> - diff[0][0] = <code>onesRow<sub>0</sub> + onesCol<sub>0</sub> - zerosRow<sub>0</sub> - zerosCol<sub>0</sub></code> = 2 + 1 - 1 - 2 = 0
>
> - diff[0][1] = <code>onesRow<sub>0</sub> + onesCol<sub>1</sub> - zerosRow<sub>0</sub> - zerosCol<sub>1</sub></code> = 2 + 1 - 1 - 2 = 0
>
> - diff[0][2] = <code>onesRow<sub>0</sub> + onesCol<sub>2</sub> - zerosRow<sub>0</sub> - zerosCol<sub>2</sub></code> = 2 + 3 - 1 - 0 = 4
>
> - diff[1][0] = <code>onesRow<sub>1</sub> + onesCol<sub>0</sub> - zerosRow<sub>1</sub> - zerosCol<sub>0</sub></code> = 2 + 1 - 1 - 2 = 0
>
> - diff[1][1] = <code>onesRow<sub>1</sub> + onesCol<sub>1</sub> - zerosRow<sub>1</sub> - zerosCol<sub>1</sub></code> = 2 + 1 - 1 - 2 = 0
>
> - diff[1][2] = <code>onesRow<sub>1</sub> + onesCol<sub>2</sub> - zerosRow<sub>1</sub> - zerosCol<sub>2</sub></code> = 2 + 3 - 1 - 0 = 4
>
> - diff[2][0] = <code>onesRow<sub>2</sub> + onesCol<sub>0</sub> - zerosRow<sub>2</sub> - zerosCol<sub>0</sub></code> = 1 + 1 - 2 - 2 = -2
>
> - diff[2][1] = <code>onesRow<sub>2</sub> + onesCol<sub>1</sub> - zerosRow<sub>2</sub> - zerosCol<sub>1</sub></code> = 1 + 1 - 2 - 2 = -2
>
> - diff[2][2] = <code>onesRow<sub>2</sub> + onesCol<sub>2</sub> - zerosRow<sub>2</sub> - zerosCol<sub>2</sub></code> = 1 + 3 - 2 - 0 = 2

**Example 2:**
>
> **Input:** grid = [[1,1,1],[1,1,1]]
>
> **Output:** [[5,5,5],[5,5,5]]
>
> **Explanation:**
>
> - diff[0][0] = onesRow<sub>0</sub> + onesCol<sub>0</sub> - zerosRow<sub>0</sub> - zerosCol<sub>0</sub> = 3 + 2 - 0 - 0 = 5
>
> - diff[0][1] = onesRow<sub>0</sub> + onesCol<sub>1</sub> - zerosRow<sub>0</sub> - zerosCol<sub>1</sub> = 3 + 2 - 0 - 0 = 5
>
> - diff[0][2] = onesRow<sub>0</sub> + onesCol<sub>2</sub> - zerosRow<sub>0</sub> - zerosCol<sub>2</sub> = 3 + 2 - 0 - 0 = 5
>
> - diff[1][0] = onesRow<sub>1</sub> + onesCol<sub>0</sub> - zerosRow<sub>1</sub> - zerosCol<sub>0</sub> = 3 + 2 - 0 - 0 = 5
>
> - diff[1][1] = onesRow<sub>1</sub> + onesCol<sub>1</sub> - zerosRow<sub>1</sub> - zerosCol<sub>1</sub> = 3 + 2 - 0 - 0 = 5
>
> - diff[1][2] = onesRow<sub>1</sub> + onesCol<sub>2</sub> - zerosRow<sub>1</sub> - zerosCol<sub>2</sub> = 3 + 2 - 0 - 0 = 5


**Constraints:**

- <code>m == grid.length</code>

- <code>n == grid[i].length</code>

- <code>1 &lt;= m, n &lt;= 10<sup>5</sup></code>

- <code>1 &lt;= m * n &lt;= 10<sup>5</sup></code>

- <code>grid[i][j]</code> is either <code>0</code> or <code>1</code>.
