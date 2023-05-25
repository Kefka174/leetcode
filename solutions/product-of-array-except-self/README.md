# Product of Array Except Self

Given an integer array <code>nums</code>, return *an array* <code>answer</code> *such that* <code>answer[i]</code> *is equal to the product of all the elements of* <code>nums</code> *except* <code>nums[i]</code>.

The product of any prefix or suffix of <code>nums</code> is **guaranteed** to fit in a **32-bit** integer.

You must write an algorithm that runs in&nbsp;<code>O(n)</code>&nbsp;time and without using the division operation.


**Example 1:**
>
> **Input:** nums = [1,2,3,4]
>
> **Output:** [24,12,8,6]

**Example 2:**
>
> **Input:** nums = [-1,1,0,-3,3]
>
> **Output:** [0,0,9,0,0]


**Constraints:**

- <code>2 &lt;= nums.length &lt;= 10<sup>5</sup></code>

- <code>-30 &lt;= nums[i] &lt;= 30</code>

- The product of any prefix or suffix of <code>nums</code> is **guaranteed** to fit in a **32-bit** integer.


**Follow up:**&nbsp;Can you solve the problem in <code>O(1)&nbsp;</code>extra&nbsp;space complexity? (The output array **does not** count as extra space for space complexity analysis.)
