# Decode Ways

A message containing letters from <code>A-Z</code> can be **encoded** into numbers using the following mapping:
>
> 'A' -&gt; "1"
>
> 'B' -&gt; "2"
>
> ...
>
> 'Z' -&gt; "26"

To **decode** an encoded message, all the digits must be grouped then mapped back into letters using the reverse of the mapping above (there may be multiple ways). For example, <code>"11106"</code> can be mapped into:

- <code>"AAJF"</code> with the grouping <code>(1 1 10 6)</code>

- <code>"KJF"</code> with the grouping <code>(11 10 6)</code>

Note that the grouping <code>(1 11 06)</code> is invalid because <code>"06"</code> cannot be mapped into <code>'F'</code> since <code>"6"</code> is different from <code>"06"</code>.

Given a string <code>s</code> containing only digits, return *the **number** of ways to **decode** it*.

The test cases are generated so that the answer fits in a **32-bit** integer.


**Example 1:**
>
> **Input:** s = "12"
>
> **Output:** 2
>
> **Explanation:** "12" could be decoded as "AB" (1 2) or "L" (12).

**Example 2:**
>
> **Input:** s = "226"
>
> **Output:** 3
>
> **Explanation:** "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).

**Example 3:**
>
> **Input:** s = "06"
>
> **Output:** 0
>
> **Explanation:** "06" cannot be mapped to "F" because of the leading zero ("6" is different from "06").


**Constraints:**

- <code>1 &lt;= s.length &lt;= 100</code>

- <code>s</code> contains only digits and may contain leading zero(s).
