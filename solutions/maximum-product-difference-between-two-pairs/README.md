# Maximum Product Difference Between Two Pairs

The **product difference** between two pairs <code>(a, b)</code> and <code>(c, d)</code> is defined as <code>(a * b) - (c * d)</code>.

- For example, the product difference between <code>(5, 6)</code> and <code>(2, 7)</code> is <code>(5 * 6) - (2 * 7) = 16</code>.

Given an integer array <code>nums</code>, choose four **distinct** indices <code>w</code>, <code>x</code>, <code>y</code>, and <code>z</code> such that the **product difference** between pairs <code>(nums[w], nums[x])</code> and <code>(nums[y], nums[z])</code> is **maximized**.

Return *the **maximum** such product difference*.


**Example 1:**
>
> **Input:** nums = [5,6,2,7,4]
>
> **Output:** 34
>
> **Explanation:** We can choose indices 1 and 3 for the first pair (6, 7) and indices 2 and 4 for the second pair (2, 4).
>
> The product difference is (6 * 7) - (2 * 4) = 34.

**Example 2:**
>
> **Input:** nums = [4,2,5,9,7,4,8]
>
> **Output:** 64
>
> **Explanation:** We can choose indices 3 and 6 for the first pair (9, 8) and indices 1 and 5 for the second pair (2, 4).
>
> The product difference is (9 * 8) - (2 * 4) = 64.


**Constraints:**

- <code>4 &lt;= nums.length &lt;= 10<sup>4</sup></code>

- <code>1 &lt;= nums[i] &lt;= 10<sup>4</sup></code>
