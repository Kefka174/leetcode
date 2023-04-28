# Convert Sorted Array to Binary Search Tree

Given an integer array <code>nums</code> where the elements are sorted in **ascending order**, convert *it to a *<span data-keyword="height-balanced">***height-balanced***</span> *binary search tree*.


**Example 1:**
>
> **Input:** nums = [-10,-3,0,5,9]
>
> **Output:** [0,-3,9,-10,null,5]
>
> **Explanation:** [0,-10,5,null,-3,null,9] is also accepted:
>
> <img alt="" src="https://assets.leetcode.com/uploads/2021/02/18/btree2.jpg" style="width: 302px; height: 222px;">

**Example 2:**
>
> **Input:** nums = [1,3]
>
> **Output:** [3,1]
>
> **Explanation:** [1,null,3] and [3,1] are both height-balanced BSTs.


**Constraints:**

- <code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code>

- <code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code>

- <code>nums</code> is sorted in a **strictly increasing** order.
