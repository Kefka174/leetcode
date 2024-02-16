# Find Words That Can Be Formed by Characters

You are given an array of strings <code>words</code> and a string <code>chars</code>.

A string is **good** if it can be formed by characters from <code>chars</code> (each character can only be used once).

Return *the sum of lengths of all good strings in words*.


**Example 1:**
>
> **Input:** words = ["cat","bt","hat","tree"], chars = "atach"
>
> **Output:** 6
>
> **Explanation:** The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.

**Example 2:**
>
> **Input:** words = ["hello","world","leetcode"], chars = "welldonehoneyr"
>
> **Output:** 10
>
> **Explanation:** The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.


**Constraints:**

- <code>1 &lt;= words.length &lt;= 1000</code>

- <code>1 &lt;= words[i].length, chars.length &lt;= 100</code>

- <code>words[i]</code> and <code>chars</code> consist of lowercase English letters.
