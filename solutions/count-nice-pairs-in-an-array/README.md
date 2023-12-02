# Count Nice Pairs in an Array

You are given an array <code>nums</code> that consists of non-negative integers. Let us define <code>rev(x)</code> as the reverse of the non-negative integer <code>x</code>. For example, <code>rev(123) = 321</code>, and <code>rev(120) = 21</code>. A pair of indices <code>(i, j)</code> is **nice** if it satisfies all of the following conditions:

- <code>0 &lt;= i &lt; j &lt; nums.length</code>

- <code>nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])</code>

Return *the number of nice pairs of indices*. Since that number can be too large, return it **modulo** <code>10<sup>9</sup> + 7</code>.


**Example 1:**
>
> **Input:** nums = [42,11,1,97]
>
> **Output:** 2
>
> **Explanation:** The two pairs are:
>
> - (0,3) : 42 + rev(97) = 42 + 79 = 121, 97 + rev(42) = 97 + 24 = 121.
>
> - (1,2) : 11 + rev(1) = 11 + 1 = 12, 1 + rev(11) = 1 + 11 = 12.

**Example 2:**
>
> **Input:** nums = [13,10,35,24,76]
>
> **Output:** 4


**Constraints:**

- <code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code>

- <code>0 &lt;= nums[i] &lt;= 10<sup>9</sup></code>
