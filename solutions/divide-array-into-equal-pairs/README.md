# Divide Array Into Equal Pairs

You are given an integer array <code>nums</code> consisting of <code>2 * n</code> integers.

You need to divide <code>nums</code> into <code>n</code> pairs such that:

- Each element belongs to **exactly one** pair.

- The elements present in a pair are **equal**.

Return <code>true</code> *if nums can be divided into* <code>n</code> *pairs, otherwise return* <code>false</code>.


**Example 1:**
>
> **Input:** nums = [3,2,3,2,2,2]
>
> **Output:** true
>
> **Explanation:**
>
> There are 6 elements in nums, so they should be divided into 6 / 2 = 3 pairs.
>
> If nums is divided into the pairs (2, 2), (3, 3), and (2, 2), it will satisfy all the conditions.

**Example 2:**
>
> **Input:** nums = [1,2,3,4]
>
> **Output:** false
>
> **Explanation:**
>
> There is no way to divide nums into 4 / 2 = 2 pairs such that the pairs satisfy every condition.


**Constraints:**

- <code>nums.length == 2 * n</code>

- <code>1 &lt;= n &lt;= 500</code>

- <code>1 &lt;= nums[i] &lt;= 500</code>
