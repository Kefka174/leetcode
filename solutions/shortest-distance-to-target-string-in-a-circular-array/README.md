# Shortest Distance to Target String in a Circular Array

You are given a **0-indexed** **circular** string array <code>words</code> and a string <code>target</code>. A **circular array** means that the array's end connects to the array's beginning.

- Formally, the next element of <code>words[i]</code> is <code>words[(i + 1) % n]</code> and the previous element of <code>words[i]</code> is <code>words[(i - 1 + n) % n]</code>, where <code>n</code> is the length of <code>words</code>.

Starting from <code>startIndex</code>, you can move to either the next word or the previous word with <code>1</code> step at a time.

Return *the **shortest** distance needed to reach the string* <code>target</code>. If the string <code>target</code> does not exist in <code>words</code>, return <code>-1</code>.


**Example 1:**
>
> **Input:** words = ["hello","i","am","leetcode","hello"], target = "hello", startIndex = 1
>
> **Output:** 1
>
> **Explanation:** We start from index 1 and can reach "hello" by
>
> - moving 3 units to the right to reach index 4.
>
> - moving 2 units to the left to reach index 4.
>
> - moving 4 units to the right to reach index 0.
>
> - moving 1 unit to the left to reach index 0.
>
> The shortest distance to reach "hello" is 1.

**Example 2:**
>
> **Input:** words = ["a","b","leetcode"], target = "leetcode", startIndex = 0
>
> **Output:** 1
>
> **Explanation:** We start from index 0 and can reach "leetcode" by
>
> - moving 2 units to the right to reach index 3.
>
> - moving 1 unit to the left to reach index 3.
>
> The shortest distance to reach "leetcode" is 1.

**Example 3:**
>
> **Input:** words = ["i","eat","leetcode"], target = "ate", startIndex = 0
>
> **Output:** -1
>
> **Explanation:** Since "ate" does not exist in <code>words</code>, we return -1.


**Constraints:**

- <code>1 &lt;= words.length &lt;= 100</code>

- <code>1 &lt;= words[i].length &lt;= 100</code>

- <code>words[i]</code> and <code>target</code> consist of only lowercase English letters.

- <code>0 &lt;= startIndex &lt; words.length</code>
