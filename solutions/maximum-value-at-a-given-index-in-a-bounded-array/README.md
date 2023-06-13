# Maximum Value at a Given Index in a Bounded Array

You are given three positive integers:&nbsp;<code>n</code>, <code>index</code>, and <code>maxSum</code>. You want to construct an array <code>nums</code> (**0-indexed**)** **that satisfies the following conditions:

- <code>nums.length == n</code>

- <code>nums[i]</code> is a **positive** integer where <code>0 &lt;= i &lt; n</code>.

- <code>abs(nums[i] - nums[i+1]) &lt;= 1</code> where <code>0 &lt;= i &lt; n-1</code>.

- The sum of all the elements of <code>nums</code> does not exceed <code>maxSum</code>.

- <code>nums[index]</code> is **maximized**.

Return <code>nums[index]</code>* of the constructed array*.

Note that <code>abs(x)</code> equals <code>x</code> if <code>x &gt;= 0</code>, and <code>-x</code> otherwise.


**Example 1:**
>
> **Input:** n = 4, index = 2,  maxSum = 6
>
> **Output:** 2
>
> **Explanation:** nums = [1,2,<u>**2**</u>,1] is one array that satisfies all the conditions.
>
> There are no arrays that satisfy all the conditions and have nums[2] == 3, so 2 is the maximum nums[2].

**Example 2:**
>
> **Input:** n = 6, index = 1,  maxSum = 10
>
> **Output:** 3


**Constraints:**

- <code>1 &lt;= n &lt;= maxSum &lt;= 10<sup>9</sup></code>

- <code>0 &lt;= index &lt; n</code>
