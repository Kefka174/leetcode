# Running Sum of 1d Array

Given an array <code>nums</code>. We define a running sum of an array as&nbsp;<code>runningSum[i] = sum(nums[0]…nums[i])</code>.

Return the running sum of <code>nums</code>.


**Example 1:**
>
> **Input:** nums = [1,2,3,4]
>
> **Output:** [1,3,6,10]
>
> **Explanation:** Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

**Example 2:**
>
> **Input:** nums = [1,1,1,1,1]
>
> **Output:** [1,2,3,4,5]
>
> **Explanation:** Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

**Example 3:**
>
> **Input:** nums = [3,1,2,10,1]
>
> **Output:** [3,4,6,16,17]


**Constraints:**

- <code>1 &lt;= nums.length &lt;= 1000</code>

- <code>-10^6&nbsp;&lt;= nums[i] &lt;=&nbsp;10^6</code>
