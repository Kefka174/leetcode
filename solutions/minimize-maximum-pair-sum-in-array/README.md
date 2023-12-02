# Minimize Maximum Pair Sum in Array

The **pair sum** of a pair <code>(a,b)</code> is equal to <code>a + b</code>. The **maximum pair sum** is the largest **pair sum** in a list of pairs.

- For example, if we have pairs <code>(1,5)</code>, <code>(2,3)</code>, and <code>(4,4)</code>, the **maximum pair sum** would be <code>max(1+5, 2+3, 4+4) = max(6, 5, 8) = 8</code>.

Given an array <code>nums</code> of **even** length <code>n</code>, pair up the elements of <code>nums</code> into <code>n / 2</code> pairs such that:

- Each element of <code>nums</code> is in **exactly one** pair, and

- The **maximum pair sum **is **minimized**.

Return *the minimized **maximum pair sum** after optimally pairing up the elements*.


**Example 1:**
>
> **Input:** nums = [3,5,2,3]
>
> **Output:** 7
>
> **Explanation:** The elements can be paired up into pairs (3,3) and (5,2).
>
> The maximum pair sum is max(3+3, 5+2) = max(6, 7) = 7.

**Example 2:**
>
> **Input:** nums = [3,5,4,2,4,6]
>
> **Output:** 8
>
> **Explanation:** The elements can be paired up into pairs (3,5), (4,4), and (6,2).
>
> The maximum pair sum is max(3+5, 4+4, 6+2) = max(8, 8, 8) = 8.


**Constraints:**

- <code>n == nums.length</code>

- <code>2 &lt;= n &lt;= 10<sup>5</sup></code>

- <code>n</code> is **even**.

- <code>1 &lt;= nums[i] &lt;= 10<sup>5</sup></code>
