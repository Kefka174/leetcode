# Longest Arithmetic Subsequence

Given an array <code>nums</code> of integers, return *the length of the longest arithmetic subsequence in* <code>nums</code>.

**Note** that:

- A **subsequence** is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.

- A sequence <code>seq</code> is arithmetic if <code>seq[i + 1] - seq[i]</code> are all the same value (for <code>0 &lt;= i &lt; seq.length - 1</code>).


**Example 1:**
>
> **Input:** nums = [3,6,9,12]
>
> **Output:** 4
>
> **Explanation: ** The whole array is an arithmetic sequence with steps of length = 3.

**Example 2:**
>
> **Input:** nums = [9,4,7,2,10]
>
> **Output:** 3
>
> **Explanation: ** The longest arithmetic subsequence is [4,7,10].

**Example 3:**
>
> **Input:** nums = [20,1,15,3,10,5,8]
>
> **Output:** 4
>
> **Explanation: ** The longest arithmetic subsequence is [20,15,10,5].


**Constraints:**

- <code>2 &lt;= nums.length &lt;= 1000</code>

- <code>0 &lt;= nums[i] &lt;= 500</code>
