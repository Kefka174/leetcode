# Largest Substring Between Two Equal Characters

Given a string <code>s</code>, return *the length of the longest substring between two equal characters, excluding the two characters.* If there is no such substring return <code>-1</code>.

A **substring** is a contiguous sequence of characters within a string.


**Example 1:**
>
> **Input:** s = "aa"
>
> **Output:** 0
>
> **Explanation:** The optimal substring here is an empty substring between the two <code>'a's</code>.

**Example 2:**
>
> **Input:** s = "abca"
>
> **Output:** 2
>
> **Explanation:** The optimal substring here is "bc".

**Example 3:**
>
> **Input:** s = "cbzxy"
>
> **Output:** -1
>
> **Explanation:** There are no characters that appear twice in s.


**Constraints:**

- <code>1 &lt;= s.length &lt;= 300</code>

- <code>s</code> contains only lowercase English letters.
