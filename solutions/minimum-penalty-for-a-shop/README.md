# Minimum Penalty for a Shop

You are given the customer visit log of a shop represented by a **0-indexed** string <code>customers</code> consisting only of characters <code>'N'</code> and <code>'Y'</code>:

- if the <code>i<sup>th</sup></code> character is <code>'Y'</code>, it means that customers come at the <code>i<sup>th</sup></code> hour

- whereas <code>'N'</code> indicates that no customers come at the <code>i<sup>th</sup></code> hour.

If the shop closes at the <code>j<sup>th</sup></code> hour (<code>0 &lt;= j &lt;= n</code>), the **penalty** is calculated as follows:

- For every hour when the shop is open and no customers come, the penalty increases by <code>1</code>.

- For every hour when the shop is closed and customers come, the penalty increases by <code>1</code>.

Return* the **earliest** hour at which the shop must be closed to incur a **minimum** penalty.*

**Note** that if a shop closes at the <code>j<sup>th</sup></code> hour, it means the shop is closed at the hour <code>j</code>.


**Example 1:**
>
> **Input:** customers = "YYNY"
>
> **Output:** 2
>
> **Explanation:**
>
> - Closing the shop at the 0<sup>th</sup> hour incurs in 1+1+0+1 = 3 penalty.
>
> - Closing the shop at the 1<sup>st</sup> hour incurs in 0+1+0+1 = 2 penalty.
>
> - Closing the shop at the 2<sup>nd</sup> hour incurs in 0+0+0+1 = 1 penalty.
>
> - Closing the shop at the 3<sup>rd</sup> hour incurs in 0+0+1+1 = 2 penalty.
>
> - Closing the shop at the 4<sup>th</sup> hour incurs in 0+0+1+0 = 1 penalty.
>
> Closing the shop at 2<sup>nd</sup> or 4<sup>th</sup> hour gives a minimum penalty. Since 2 is earlier, the optimal closing time is 2.

**Example 2:**
>
> **Input:** customers = "NNNNN"
>
> **Output:** 0
>
> **Explanation:** It is best to close the shop at the 0<sup>th</sup> hour as no customers arrive.

**Example 3:**
>
> **Input:** customers = "YYYY"
>
> **Output:** 4
>
> **Explanation:** It is best to close the shop at the 4<sup>th</sup> hour as customers arrive at each hour.


**Constraints:**

- <code>1 &lt;= customers.length &lt;= 10<sup>5</sup></code>

- <code>customers</code> consists only of characters <code>'Y'</code> and <code>'N'</code>.
