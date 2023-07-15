# Longest Subarray of 1's After Deleting One Element

Given a binary array <code>nums</code>, you should delete one element from it.

Return *the size of the longest non-empty subarray containing only *<code>1</code>*'s in the resulting array*. Return <code>0</code> if there is no such subarray.


**Example 1:**
>
> **Input:** nums = [1,1,0,1]
>
> **Output:** 3
>
> **Explanation:** After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.

**Example 2:**
>
> **Input:** nums = [0,1,1,1,0,1,1,0,1]
>
> **Output:** 5
>
> **Explanation:** After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].

**Example 3:**
>
> **Input:** nums = [1,1,1]
>
> **Output:** 2
>
> **Explanation:** You must delete one element.


**Constraints:**

- <code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code>

- <code>nums[i]</code> is either <code>0</code> or <code>1</code>.
