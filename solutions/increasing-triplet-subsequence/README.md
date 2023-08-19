# Increasing Triplet Subsequence

Given an integer array <code>nums</code>, return <code>true</code>* if there exists a triple of indices *<code>(i, j, k)</code>* such that *<code>i &lt; j &lt; k</code>* and *<code>nums[i] &lt; nums[j] &lt; nums[k]</code>. If no such indices exists, return <code>false</code>.


**Example 1:**
>
> **Input:** nums = [1,2,3,4,5]
>
> **Output:** true
>
> **Explanation:** Any triplet where i &lt; j &lt; k is valid.

**Example 2:**
>
> **Input:** nums = [5,4,3,2,1]
>
> **Output:** false
>
> **Explanation:** No triplet exists.

**Example 3:**
>
> **Input:** nums = [2,1,5,0,4,6]
>
> **Output:** true
>
> **Explanation:** The triplet (3, 4, 5) is valid because nums[3] == 0 &lt; nums[4] == 4 &lt; nums[5] == 6.


**Constraints:**

- <code>1 &lt;= nums.length &lt;= 5 * 10<sup>5</sup></code>

- <code>-2<sup>31</sup> &lt;= nums[i] &lt;= 2<sup>31</sup> - 1</code>

