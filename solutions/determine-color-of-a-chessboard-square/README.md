# Determine Color of a Chessboard Square

You are given <code>coordinates</code>, a string that represents the coordinates of a square of the chessboard. Below is a chessboard for your reference.

<img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/screenshot-2021-02-20-at-22159-pm.png" style="width: 400px; height: 396px;">

Return <code>true</code>* if the square is white, and *<code>false</code>* if the square is black*.

The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first, and the number second.


**Example 1:**
>
> **Input:** coordinates = "a1"
>
> **Output:** false
>
> **Explanation:** From the chessboard above, the square with coordinates "a1" is black, so return false.

**Example 2:**
>
> **Input:** coordinates = "h3"
>
> **Output:** true
>
> **Explanation:** From the chessboard above, the square with coordinates "h3" is white, so return true.

**Example 3:**
>
> **Input:** coordinates = "c7"
>
> **Output:** false


**Constraints:**

- <code>coordinates.length == 2</code>

- <code>'a' &lt;= coordinates[0] &lt;= 'h'</code>

- <code>'1' &lt;= coordinates[1] &lt;= '8'</code>
