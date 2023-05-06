# Maximum Product Subarray

Given an integer array <code>nums</code>, find a <span data-keyword="subarray-nonempty">subarray</span> that has the largest product, and return *the product*.

The test cases are generated so that the answer will fit in a **32-bit** integer.


**Example 1:**
>
> **Input:** nums = [2,3,-2,4]
>
> **Output:** 6
>
> **Explanation:** [2,3] has the largest product 6.

**Example 2:**
>
> **Input:** nums = [-2,0,-1]
>
> **Output:** 0
>
> **Explanation:** The result cannot be 2, because [-2,-1] is not a subarray.


**Constraints:**

- <code>1 &lt;= nums.length &lt;= 2 * 10<sup>4</sup></code>

- <code>-10 &lt;= nums[i] &lt;= 10</code>

- The product of any prefix or suffix of <code>nums</code> is **guaranteed** to fit in a **32-bit** integer.
