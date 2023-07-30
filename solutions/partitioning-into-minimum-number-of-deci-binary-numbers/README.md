# Partitioning Into Minimum Number Of Deci-Binary Numbers

A decimal number is called **deci-binary** if each of its digits is either <code>0</code> or <code>1</code> without any leading zeros. For example, <code>101</code> and <code>1100</code> are **deci-binary**, while <code>112</code> and <code>3001</code> are not.

Given a string <code>n</code> that represents a positive decimal integer, return *the **minimum** number of positive **deci-binary** numbers needed so that they sum up to *<code>n</code>*.*


**Example 1:**
>
> **Input:** n = "32"
>
> **Output:** 3
>
> **Explanation:** 10 + 11 + 11 = 32

**Example 2:**
>
> **Input:** n = "82734"
>
> **Output:** 8

**Example 3:**
>
> **Input:** n = "27346209830709182346"
>
> **Output:** 9


**Constraints:**

- <code>1 &lt;= n.length &lt;= 10<sup>5</sup></code>

- <code>n</code> consists of only digits.

- <code>n</code> does not contain any leading zeros and represents a positive integer.
