# Find the Middle Index in Array

Given a **0-indexed** integer array <code>nums</code>, find the **leftmost** <code>middleIndex</code> (i.e., the smallest amongst all the possible ones).

A <code>middleIndex</code> is an index where <code>nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1]</code>.

If <code>middleIndex == 0</code>, the left side sum is considered to be <code>0</code>. Similarly, if <code>middleIndex == nums.length - 1</code>, the right side sum is considered to be <code>0</code>.

Return *the **leftmost** *<code>middleIndex</code>* that satisfies the condition, or *<code>-1</code>* if there is no such index*.


**Example 1:**
>
> **Input:** nums = [2,3,-1,<u>8</u>,4]
>
> **Output:** 3
>
> **Explanation:** The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
>
> The sum of the numbers after index 3 is: 4 = 4

**Example 2:**
>
> **Input:** nums = [1,-1,<u>4</u>]
>
> **Output:** 2
>
> **Explanation:** The sum of the numbers before index 2 is: 1 + -1 = 0
>
> The sum of the numbers after index 2 is: 0

**Example 3:**
>
> **Input:** nums = [2,5]
>
> **Output:** -1
>
> **Explanation:** There is no valid middleIndex.


**Constraints:**

- <code>1 &lt;= nums.length &lt;= 100</code>

- <code>-1000 &lt;= nums[i] &lt;= 1000</code>


**Note:** This question is the same as&nbsp;724:&nbsp;<a href="https://leetcode.com/problems/find-pivot-index/" target="_blank">https://leetcode.com/problems/find-pivot-index/</a>
