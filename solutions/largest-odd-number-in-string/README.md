# Largest Odd Number in String

You are given a string <code>num</code>, representing a large integer. Return *the **largest-valued odd** integer (as a string) that is a **non-empty substring** of *<code>num</code>*, or an empty string *<code>""</code>* if no odd integer exists*.

A **substring** is a contiguous sequence of characters within a string.


**Example 1:**
>
> **Input:** num = "52"
>
> **Output:** "5"
>
> **Explanation:** The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.

**Example 2:**
>
> **Input:** num = "4206"
>
> **Output:** ""
>
> **Explanation:** There are no odd numbers in "4206".

**Example 3:**
>
> **Input:** num = "35427"
>
> **Output:** "35427"
>
> **Explanation:** "35427" is already an odd number.


**Constraints:**

- <code>1 &lt;= num.length &lt;= 10<sup>5</sup></code>

- <code>num</code> only consists of digits and does not contain any leading zeros.
