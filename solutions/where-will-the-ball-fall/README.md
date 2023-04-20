# Where Will the Ball Fall

You have a 2-D <code>grid</code> of size <code>m x n</code> representing a box, and you have <code>n</code> balls. The box is open on the top and bottom sides.

Each cell in the box has a diagonal board spanning two corners of the cell that can redirect a ball to the right or to the left.

- A board that redirects the ball to the right spans the top-left corner to the bottom-right corner and is represented in the grid as <code>1</code>.

- A board that redirects the ball to the left spans the top-right corner to the bottom-left corner and is represented in the grid as <code>-1</code>.

We drop one ball at the top of each column of the box. Each ball can get stuck in the box or fall out of the bottom. A ball gets stuck if it hits a "V" shaped pattern between two boards or if a board redirects the ball into either wall of the box.

Return *an array *<code>answer</code>* of size *<code>n</code>* where *<code>answer[i]</code>* is the column that the ball falls out of at the bottom after dropping the ball from the *<code>i<sup>th</sup></code>* column at the top, or <code>-1</code>* if the ball gets stuck in the box*.*


**Example 1:**

**<img alt="" src="https://assets.leetcode.com/uploads/2019/09/26/ball.jpg" style="width: 500px; height: 385px;">**
>
> **Input:** grid = [[1,1,1,-1,-1],[1,1,1,-1,-1],[-1,-1,-1,1,1],[1,1,1,1,-1],[-1,-1,-1,-1,-1]]
>
> **Output:** [1,-1,-1,-1,-1]
>
> **Explanation:** This example is shown in the photo.
>
> Ball b0 is dropped at column 0 and falls out of the box at column 1.
>
> Ball b1 is dropped at column 1 and will get stuck in the box between column 2 and 3 and row 1.
>
> Ball b2 is dropped at column 2 and will get stuck on the box between column 2 and 3 and row 0.
>
> Ball b3 is dropped at column 3 and will get stuck on the box between column 2 and 3 and row 0.
>
> Ball b4 is dropped at column 4 and will get stuck on the box between column 2 and 3 and row 1.

**Example 2:**
>
> **Input:** grid = [[-1]]
>
> **Output:** [-1]
>
> **Explanation:** The ball gets stuck against the left wall.

**Example 3:**
>
> **Input:** grid = [[1,1,1,1,1,1],[-1,-1,-1,-1,-1,-1],[1,1,1,1,1,1],[-1,-1,-1,-1,-1,-1]]
>
> **Output:** [0,1,2,3,4,-1]


**Constraints:**

- <code>m == grid.length</code>

- <code>n == grid[i].length</code>

- <code>1 &lt;= m, n &lt;= 100</code>

- <code>grid[i][j]</code> is <code>1</code> or <code>-1</code>.
