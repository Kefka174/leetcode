# Number of Good Pairs

Given an array of integers <code>nums</code>, return *the number of **good pairs***.

A pair <code>(i, j)</code> is called *good* if <code>nums[i] == nums[j]</code> and <code>i</code> &lt; <code>j</code>.


**Example 1:**
>
> **Input:** nums = [1,2,3,1,1,3]
>
> **Output:** 4
>
> **Explanation:** There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

**Example 2:**
>
> **Input:** nums = [1,1,1,1]
>
> **Output:** 6
>
> **Explanation:** Each pair in the array are *good*.

**Example 3:**
>
> **Input:** nums = [1,2,3]
>
> **Output:** 0


**Constraints:**

- <code>1 &lt;= nums.length &lt;= 100</code>

- <code>1 &lt;= nums[i] &lt;= 100</code>
