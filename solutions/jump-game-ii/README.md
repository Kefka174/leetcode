# Jump Game II

You are given a **0-indexed** array of integers <code>nums</code> of length <code>n</code>. You are initially positioned at <code>nums[0]</code>.

Each element <code>nums[i]</code> represents the maximum length of a forward jump from index <code>i</code>. In other words, if you are at <code>nums[i]</code>, you can jump to any <code>nums[i + j]</code> where:

- <code>0 &lt;= j &lt;= nums[i]</code> and

- <code>i + j &lt; n</code>

Return *the minimum number of jumps to reach *<code>nums[n - 1]</code>. The test cases are generated such that you can reach <code>nums[n - 1]</code>.


**Example 1:**
>
> **Input:** nums = [2,3,1,1,4]
>
> **Output:** 2
>
> **Explanation:** The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.

**Example 2:**
>
> **Input:** nums = [2,3,0,1,4]
>
> **Output:** 2


**Constraints:**

- <code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code>

- <code>0 &lt;= nums[i] &lt;= 1000</code>

- It's guaranteed that you can reach <code>nums[n - 1]</code>.
