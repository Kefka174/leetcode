# Find the Index of the First Occurrence in a String

Given two strings <code>needle</code> and <code>haystack</code>, return the index of the first occurrence of <code>needle</code> in <code>haystack</code>, or <code>-1</code> if <code>needle</code> is not part of <code>haystack</code>.


**Example 1:**
>
> **Input:** haystack = "sadbutsad", needle = "sad"
>
> **Output:** 0
>
> **Explanation:** "sad" occurs at index 0 and 6.
>
> The first occurrence is at index 0, so we return 0.

**Example 2:**
>
> **Input:** haystack = "leetcode", needle = "leeto"
>
> **Output:** -1
>
> **Explanation:** "leeto" did not occur in "leetcode", so we return -1.


**Constraints:**

- <code>1 &lt;= haystack.length, needle.length &lt;= 10<sup>4</sup></code>

- <code>haystack</code> and <code>needle</code> consist of only lowercase English characters.
