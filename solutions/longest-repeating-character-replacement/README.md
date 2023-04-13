# Longest Repeating Character Replacement

You are given a string <code>s</code> and an integer <code>k</code>. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most <code>k</code> times.

Return *the length of the longest substring containing the same letter you can get after performing the above operations*.


**Example 1:**
>
> **Input:** s = "ABAB", k = 2
>
> **Output:** 4
>
> **Explanation:** Replace the two 'A's with two 'B's or vice versa.

**Example 2:**
>
> **Input:** s = "AABABBA", k = 1
>
> **Output:** 4
>
> **Explanation:** Replace the one 'A' in the middle with 'B' and form "AABBBBA".
>
> The substring "BBBB" has the longest repeating letters, which is 4.


**Constraints:**

- <code>1 &lt;= s.length &lt;= 10<sup>5</sup></code>

- <code>s</code> consists of only uppercase English letters.

- <code>0 &lt;= k &lt;= s.length</code>
