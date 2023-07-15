# Longest Arithmetic Subsequence of Given Difference

Given an integer array <code>arr</code> and an integer <code>difference</code>, return the length of the longest subsequence in <code>arr</code> which is an arithmetic sequence such that the difference between adjacent elements in the subsequence equals <code>difference</code>.

A **subsequence** is a sequence that can be derived from <code>arr</code> by deleting some or no elements without changing the order of the remaining elements.


**Example 1:**
>
> **Input:** arr = [1,2,3,4], difference = 1
>
> **Output:** 4
>
> **Explanation: **The longest arithmetic subsequence is [1,2,3,4].

**Example 2:**
>
> **Input:** arr = [1,3,5,7], difference = 1
>
> **Output:** 1
>
> **Explanation: **The longest arithmetic subsequence is any single element.

**Example 3:**
>
> **Input:** arr = [1,5,7,8,5,3,4,2,1], difference = -2
>
> **Output:** 4
>
> **Explanation: **The longest arithmetic subsequence is [7,5,3,1].


**Constraints:**

- <code>1 &lt;= arr.length &lt;= 10<sup>5</sup></code>

- <code>-10<sup>4</sup> &lt;= arr[i], difference &lt;= 10<sup>4</sup></code>
