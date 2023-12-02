# Find Unique Binary String

Given an array of strings <code>nums</code> containing <code>n</code> **unique** binary strings each of length <code>n</code>, return *a binary string of length *<code>n</code>* that **does not appear** in *<code>nums</code>*. If there are multiple answers, you may return **any** of them*.


**Example 1:**
>
> **Input:** nums = ["01","10"]
>
> **Output:** "11"
>
> **Explanation:** "11" does not appear in nums. "00" would also be correct.

**Example 2:**
>
> **Input:** nums = ["00","01"]
>
> **Output:** "11"
>
> **Explanation:** "11" does not appear in nums. "10" would also be correct.

**Example 3:**
>
> **Input:** nums = ["111","011","001"]
>
> **Output:** "101"
>
> **Explanation:** "101" does not appear in nums. "000", "010", "100", and "110" would also be correct.


**Constraints:**

- <code>n == nums.length</code>

- <code>1 &lt;= n &lt;= 16</code>

- <code>nums[i].length == n</code>

- <code>nums[i] </code>is either <code>'0'</code> or <code>'1'</code>.

- All the strings of <code>nums</code> are **unique**.
