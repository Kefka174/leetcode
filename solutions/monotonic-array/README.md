# Monotonic Array

An array is **monotonic** if it is either monotone increasing or monotone decreasing.

An array <code>nums</code> is monotone increasing if for all <code>i &lt;= j</code>, <code>nums[i] &lt;= nums[j]</code>. An array <code>nums</code> is monotone decreasing if for all <code>i &lt;= j</code>, <code>nums[i] &gt;= nums[j]</code>.

Given an integer array <code>nums</code>, return <code>true</code>* if the given array is monotonic, or *<code>false</code>* otherwise*.


**Example 1:**
>
> **Input:** nums = [1,2,2,3]
>
> **Output:** true

**Example 2:**
>
> **Input:** nums = [6,5,4,4]
>
> **Output:** true

**Example 3:**
>
> **Input:** nums = [1,3,2]
>
> **Output:** false


**Constraints:**

- <code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code>

- <code>-10<sup>5</sup> &lt;= nums[i] &lt;= 10<sup>5</sup></code>
