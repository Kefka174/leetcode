# Contains Duplicate II

Given an integer array <code>nums</code> and an integer <code>k</code>, return <code>true</code> *if there are two **distinct indices** *<code>i</code>* and *<code>j</code>* in the array such that *<code>nums[i] == nums[j]</code>* and *<code>abs(i - j) &lt;= k</code>.


**Example 1:**
>
> **Input:** nums = [1,2,3,1], k = 3
>
> **Output:** true

**Example 2:**
>
> **Input:** nums = [1,0,1,1], k = 1
>
> **Output:** true

**Example 3:**
>
> **Input:** nums = [1,2,3,1,2,3], k = 2
>
> **Output:** false


**Constraints:**

- <code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code>

- <code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code>

- <code>0 &lt;= k &lt;= 10<sup>5</sup></code>
