# Contains Duplicate III

You are given an integer array <code>nums</code> and two integers <code>indexDiff</code> and <code>valueDiff</code>.

Find a pair of indices <code>(i, j)</code> such that:

- <code>i != j</code>,

- <code>abs(i - j) &lt;= indexDiff</code>.

- <code>abs(nums[i] - nums[j]) &lt;= valueDiff</code>, and

Return <code>true</code>* if such pair exists or *<code>false</code>* otherwise*.


**Example 1:**
>
> **Input:** nums = [1,2,3,1], indexDiff = 3, valueDiff = 0
>
> **Output:** true
>
> **Explanation:** We can choose (i, j) = (0, 3).
>
> We satisfy the three conditions:
>
> i != j --&gt; 0 != 3
>
> abs(i - j) &lt;= indexDiff --&gt; abs(0 - 3) &lt;= 3
>
> abs(nums[i] - nums[j]) &lt;= valueDiff --&gt; abs(1 - 1) &lt;= 0

**Example 2:**
>
> **Input:** nums = [1,5,9,1,5,9], indexDiff = 2, valueDiff = 3
>
> **Output:** false
>
> **Explanation:** After trying all the possible pairs (i, j), we cannot satisfy the three conditions, so we return false.


**Constraints:**

- <code>2 &lt;= nums.length &lt;= 10<sup>5</sup></code>

- <code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code>

- <code>1 &lt;= indexDiff &lt;= nums.length</code>

- <code>0 &lt;= valueDiff &lt;= 10<sup>9</sup></code>
