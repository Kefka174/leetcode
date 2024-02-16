# Calculate Money in Leetcode Bank

Hercy wants to save money for his first car. He puts money in the Leetcode&nbsp;bank **every day**.

He starts by putting in <code>$1</code> on Monday, the first day. Every day from Tuesday to Sunday, he will put in <code>$1</code> more than the day before. On every subsequent Monday, he will put in <code>$1</code> more than the **previous Monday**.<span style="display: none;"> </span>

Given <code>n</code>, return *the total amount of money he will have in the Leetcode bank at the end of the *<code>n<sup>th</sup></code>* day.*


**Example 1:**
>
> **Input:** n = 4
>
> **Output:** 10
>
> **Explanation:**&nbsp;After the 4<sup>th</sup> day, the total is 1 + 2 + 3 + 4 = 10.

**Example 2:**
>
> **Input:** n = 10
>
> **Output:** 37
>
> **Explanation:**&nbsp;After the 10<sup>th</sup> day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2<sup>nd</sup> Monday, Hercy only puts in $2.

**Example 3:**
>
> **Input:** n = 20
>
> **Output:** 96
>
> **Explanation:**&nbsp;After the 20<sup>th</sup> day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.


**Constraints:**

- <code>1 &lt;= n &lt;= 1000</code>
