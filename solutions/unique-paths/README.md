# Unique Paths

There is a robot on an <code>m x n</code> grid. The robot is initially located at the **top-left corner** (i.e., <code>grid[0][0]</code>). The robot tries to move to the **bottom-right corner** (i.e., <code>grid[m - 1][n - 1]</code>). The robot can only move either down or right at any point in time.

Given the two integers <code>m</code> and <code>n</code>, return *the number of possible unique paths that the robot can take to reach the bottom-right corner*.

The test cases are generated so that the answer will be less than or equal to <code>2 * 10<sup>9</sup></code>.


**Example 1:**
>
> **Input:** m = 3, n = 7
>
> **Output:** 28

**Example 2:**
>
> **Input:** m = 3, n = 2
>
> **Output:** 3
>
> **Explanation:** From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
>
> 1. Right -&gt; Down -&gt; Down
>
> 2. Down -&gt; Down -&gt; Right
>
> 3. Down -&gt; Right -&gt; Down


**Constraints:**

- <code>1 &lt;= m, n &lt;= 100</code>
