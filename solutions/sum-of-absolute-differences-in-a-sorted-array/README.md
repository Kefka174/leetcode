# Sum of Absolute Differences in a Sorted Array

You are given an integer array <code>nums</code> sorted in **non-decreasing** order.

Build and return *an integer array *<code>result</code>* with the same length as *<code>nums</code>* such that *<code>result[i]</code>* is equal to the **summation of absolute differences** between *<code>nums[i]</code>* and all the other elements in the array.*

In other words, <code>result[i]</code> is equal to <code>sum(|nums[i]-nums[j]|)</code> where <code>0 &lt;= j &lt; nums.length</code> and <code>j != i</code> (**0-indexed**).


**Example 1:**
>
> **Input:** nums = [2,3,5]
>
> **Output:** [4,3,5]
>
> **Explanation:** Assuming the arrays are 0-indexed, then
>
> result[0] = |2-2| + |2-3| + |2-5| = 0 + 1 + 3 = 4,
>
> result[1] = |3-2| + |3-3| + |3-5| = 1 + 0 + 2 = 3,
>
> result[2] = |5-2| + |5-3| + |5-5| = 3 + 2 + 0 = 5.

**Example 2:**
>
> **Input:** nums = [1,4,6,8,10]
>
> **Output:** [24,15,13,15,21]


**Constraints:**

- <code>2 &lt;= nums.length &lt;= 10<sup>5</sup></code>

- <code>1 &lt;= nums[i] &lt;= nums[i + 1] &lt;= 10<sup>4</sup></code>
