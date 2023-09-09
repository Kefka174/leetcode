# Nearest Exit from Entrance in Maze

You are given an <code>m x n</code> matrix <code>maze</code> (**0-indexed**) with empty cells (represented as <code>'.'</code>) and walls (represented as <code>'+'</code>). You are also given the <code>entrance</code> of the maze, where <code>entrance = [entrance<sub>row</sub>, entrance<sub>col</sub>]</code> denotes the row and column of the cell you are initially standing at.

In one step, you can move one cell **up**, **down**, **left**, or **right**. You cannot step into a cell with a wall, and you cannot step outside the maze. Your goal is to find the **nearest exit** from the <code>entrance</code>. An **exit** is defined as an **empty cell** that is at the **border** of the <code>maze</code>. The <code>entrance</code> **does not count** as an exit.

Return *the **number of steps** in the shortest path from the *<code>entrance</code>* to the nearest exit, or *<code>-1</code>* if no such path exists*.


**Example 1:**
>
> **Input:** maze = [["+","+",".","+"],[".",".",".","+"],["+","+","+","."]], entrance = [1,2]
>
> **Output:** 1
>
> **Explanation:** There are 3 exits in this maze at [1,0], [0,2], and [2,3].
>
> Initially, you are at the entrance cell [1,2].
>
> - You can reach [1,0] by moving 2 steps left.
>
> - You can reach [0,2] by moving 1 step up.
>
> It is impossible to reach [2,3] from the entrance.
>
> Thus, the nearest exit is [0,2], which is 1 step away.

**Example 2:**
>
> **Input:** maze = [["+","+","+"],[".",".","."],["+","+","+"]], entrance = [1,0]
>
> **Output:** 2
>
> **Explanation:** There is 1 exit in this maze at [1,2].
>
> [1,0] does not count as an exit since it is the entrance cell.
>
> Initially, you are at the entrance cell [1,0].
>
> - You can reach [1,2] by moving 2 steps right.
>
> Thus, the nearest exit is [1,2], which is 2 steps away.

**Example 3:**
>
> **Input:** maze = [[".","+"]], entrance = [0,0]
>
> **Output:** -1
>
> **Explanation:** There are no exits in this maze.


**Constraints:**

- <code>maze.length == m</code>

- <code>maze[i].length == n</code>

- <code>1 &lt;= m, n &lt;= 100</code>

- <code>maze[i][j]</code> is either <code>'.'</code> or <code>'+'</code>.

- <code>entrance.length == 2</code>

- <code>0 &lt;= entrance<sub>row</sub> &lt; m</code>

- <code>0 &lt;= entrance<sub>col</sub> &lt; n</code>

- <code>entrance</code> will always be an empty cell.
