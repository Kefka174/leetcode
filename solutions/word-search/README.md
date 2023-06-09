# Word Search

Given an <code>m x n</code> grid of characters <code>board</code> and a string <code>word</code>, return <code>true</code> *if* <code>word</code> *exists in the grid*.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.


**Example 1:**
>
> **Input:** board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
>
> **Output:** true

**Example 2:**
>
> **Input:** board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
>
> **Output:** true

**Example 3:**
>
> **Input:** board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
>
> **Output:** false


**Constraints:**

- <code>m == board.length</code>

- <code>n = board[i].length</code>

- <code>1 &lt;= m, n &lt;= 6</code>

- <code>1 &lt;= word.length &lt;= 15</code>

- <code>board</code> and <code>word</code> consists of only lowercase and uppercase English letters.


**Follow up:** Could you use search pruning to make your solution faster with a larger <code>board</code>?
