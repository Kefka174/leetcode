# Minimum Number of Operations to Make Array Continuous

You are given an integer array <code>nums</code>. In one operation, you can replace **any** element in <code>nums</code> with **any** integer.

<code>nums</code> is considered **continuous** if both of the following conditions are fulfilled:

- All elements in <code>nums</code> are **unique**.

- The difference between the **maximum** element and the **minimum** element in <code>nums</code> equals <code>nums.length - 1</code>.

For example, <code>nums = [4, 2, 5, 3]</code> is **continuous**, but <code>nums = [1, 2, 3, 5, 6]</code> is **not continuous**.

Return *the **minimum** number of operations to make *<code>nums</code>* ****continuous***.


**Example 1:**
>
> **Input:** nums = [4,2,5,3]
>
> **Output:** 0
>
> **Explanation:**&nbsp;nums is already continuous.

**Example 2:**
>
> **Input:** nums = [1,2,3,5,6]
>
> **Output:** 1
>
> **Explanation:**&nbsp;One possible solution is to change the last element to 4.
>
> The resulting array is [1,2,3,5,4], which is continuous.

**Example 3:**
>
> **Input:** nums = [1,10,100,1000]
>
> **Output:** 3
>
> **Explanation:**&nbsp;One possible solution is to:
>
> - Change the second element to 2.
>
> - Change the third element to 3.
>
> - Change the fourth element to 4.
>
> The resulting array is [1,2,3,4], which is continuous.


**Constraints:**

- <code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code>

- <code>1 &lt;= nums[i] &lt;= 10<sup>9</sup></code>
