# Min Cost Climbing Stairs

You are given an integer array <code>cost</code> where <code>cost[i]</code> is the cost of <code>i<sup>th</sup></code> step on a staircase. Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index <code>0</code>, or the step with index <code>1</code>.

Return *the minimum cost to reach the top of the floor*.


**Example 1:**
>
> **Input:** cost = [10,<u>15</u>,20]
>
> **Output:** 15
>
> **Explanation:** You will start at index 1.
>
> - Pay 15 and climb two steps to reach the top.
>
> The total cost is 15.

**Example 2:**
>
> **Input:** cost = [<u>1</u>,100,<u>1</u>,1,<u>1</u>,100,<u>1</u>,<u>1</u>,100,<u>1</u>]
>
> **Output:** 6
>
> **Explanation:** You will start at index 0.
>
> - Pay 1 and climb two steps to reach index 2.
>
> - Pay 1 and climb two steps to reach index 4.
>
> - Pay 1 and climb two steps to reach index 6.
>
> - Pay 1 and climb one step to reach index 7.
>
> - Pay 1 and climb two steps to reach index 9.
>
> - Pay 1 and climb one step to reach the top.
>
> The total cost is 6.


**Constraints:**

- <code>2 &lt;= cost.length &lt;= 1000</code>

- <code>0 &lt;= cost[i] &lt;= 999</code>
