# Minimum Flips to Make a OR b Equal to c

Given 3 positives numbers <code>a</code>, <code>b</code> and <code>c</code>. Return the minimum flips required in some bits of <code>a</code> and <code>b</code> to make (&nbsp;<code>a</code> OR <code>b</code> == <code>c</code>&nbsp;). (bitwise OR operation).<br>

Flip operation&nbsp;consists of change&nbsp;**any**&nbsp;single bit 1 to 0 or change the bit 0 to 1&nbsp;in their binary representation.


**Example 1:**

<img alt="" src="https://assets.leetcode.com/uploads/2020/01/06/sample_3_1676.png" style="width: 260px; height: 87px;">
>
> **Input:** a = 2, b = 6, c = 5
>
> **Output:** 3
>
> **Explanation: **After flips a = 1 , b = 4 , c = 5 such that (<code>a</code> OR <code>b</code> == <code>c</code>)

**Example 2:**
>
> **Input:** a = 4, b = 2, c = 7
>
> **Output:** 1

**Example 3:**
>
> **Input:** a = 1, b = 2, c = 3
>
> **Output:** 0


**Constraints:**

- <code>1 &lt;= a &lt;= 10^9</code>

- <code>1 &lt;= b&nbsp;&lt;= 10^9</code>

- <code>1 &lt;= c&nbsp;&lt;= 10^9</code>
