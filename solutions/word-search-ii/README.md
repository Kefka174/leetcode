# Word Search II

Given an <code>m x n</code> <code>board</code>&nbsp;of characters and a list of strings <code>words</code>, return *all words on the board*.

Each word must be constructed from letters of sequentially adjacent cells, where **adjacent cells** are horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.


**Example 1:**
>
> **Input:** board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]], words = ["oath","pea","eat","rain"]
>
> **Output:** ["eat","oath"]

**Example 2:**
>
> **Input:** board = [["a","b"],["c","d"]], words = ["abcb"]
>
> **Output:** []


**Constraints:**

- <code>m == board.length</code>

- <code>n == board[i].length</code>

- <code>1 &lt;= m, n &lt;= 12</code>

- <code>board[i][j]</code> is a lowercase English letter.

- <code>1 &lt;= words.length &lt;= 3 * 10<sup>4</sup></code>

- <code>1 &lt;= words[i].length &lt;= 10</code>

- <code>words[i]</code> consists of lowercase English letters.

- All the strings of <code>words</code> are unique.
