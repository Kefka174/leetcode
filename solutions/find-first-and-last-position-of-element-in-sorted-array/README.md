# Find First and Last Position of Element in Sorted Array

Given an array of integers <code>nums</code> sorted in non-decreasing order, find the starting and ending position of a given <code>target</code> value.

If <code>target</code> is not found in the array, return <code>[-1, -1]</code>.

You must&nbsp;write an algorithm with&nbsp;<code>O(log n)</code> runtime complexity.


**Example 1:**
>
> **Input:** nums = [5,7,7,8,8,10], target = 8
>
> **Output:** [3,4]

**Example 2:**
>
> **Input:** nums = [5,7,7,8,8,10], target = 6
>
> **Output:** [-1,-1]

**Example 3:**
>
> **Input:** nums = [], target = 0
>
> **Output:** [-1,-1]


**Constraints:**

- <code>0 &lt;= nums.length &lt;= 10<sup>5</sup></code>

- <code>-10<sup>9</sup>&nbsp;&lt;= nums[i]&nbsp;&lt;= 10<sup>9</sup></code>

- <code>nums</code> is a non-decreasing array.

- <code>-10<sup>9</sup>&nbsp;&lt;= target&nbsp;&lt;= 10<sup>9</sup></code>
