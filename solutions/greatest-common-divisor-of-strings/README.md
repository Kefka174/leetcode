# Greatest Common Divisor of Strings

For two strings <code>s</code> and <code>t</code>, we say "<code>t</code> divides <code>s</code>" if and only if <code>s = t + ... + t</code> (i.e., <code>t</code> is concatenated with itself one or more times).

Given two strings <code>str1</code> and <code>str2</code>, return *the largest string *<code>x</code>* such that *<code>x</code>* divides both *<code>str1</code>* and *<code>str2</code>.


**Example 1:**
>
> **Input:** str1 = "ABCABC", str2 = "ABC"
>
> **Output:** "ABC"

**Example 2:**
>
> **Input:** str1 = "ABABAB", str2 = "ABAB"
>
> **Output:** "AB"

**Example 3:**
>
> **Input:** str1 = "LEET", str2 = "CODE"
>
> **Output:** ""


**Constraints:**

- <code>1 &lt;= str1.length, str2.length &lt;= 1000</code>

- <code>str1</code> and <code>str2</code> consist of English uppercase letters.
