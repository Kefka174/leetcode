# Minimum Changes To Make Alternating Binary String

You are given a string <code>s</code> consisting only of the characters <code>'0'</code> and <code>'1'</code>. In one operation, you can change any <code>'0'</code> to <code>'1'</code> or vice versa.

The string is called alternating if no two adjacent characters are equal. For example, the string <code>"010"</code> is alternating, while the string <code>"0100"</code> is not.

Return *the **minimum** number of operations needed to make* <code>s</code> *alternating*.


**Example 1:**
>
> **Input:** s = "0100"
>
> **Output:** 1
>
> **Explanation:** If you change the last character to '1', s will be "0101", which is alternating.

**Example 2:**
>
> **Input:** s = "10"
>
> **Output:** 0
>
> **Explanation:** s is already alternating.

**Example 3:**
>
> **Input:** s = "1111"
>
> **Output:** 2
>
> **Explanation:** You need two operations to reach "0101" or "1010".


**Constraints:**

- <code>1 &lt;= s.length &lt;= 10<sup>4</sup></code>

- <code>s[i]</code> is either <code>'0'</code> or <code>'1'</code>.
