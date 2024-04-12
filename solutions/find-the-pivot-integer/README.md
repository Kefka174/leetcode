# Find the Pivot Integer

Given a positive integer <code>n</code>, find the **pivot integer** <code>x</code> such that:

- The sum of all elements between <code>1</code> and <code>x</code> inclusively equals the sum of all elements between <code>x</code> and <code>n</code> inclusively.

Return *the pivot integer *<code>x</code>. If no such integer exists, return <code>-1</code>. It is guaranteed that there will be at most one pivot index for the given input.


**Example 1:**
>
> **Input:** n = 8
>
> **Output:** 6
>
> **Explanation:** 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.

**Example 2:**
>
> **Input:** n = 1
>
> **Output:** 1
>
> **Explanation:** 1 is the pivot integer since: 1 = 1.

**Example 3:**
>
> **Input:** n = 4
>
> **Output:** -1
>
> **Explanation:** It can be proved that no such integer exist.


**Constraints:**

- <code>1 &lt;= n &lt;= 1000</code>
