# Top K Frequent Elements

Given an integer array <code>nums</code> and an integer <code>k</code>, return *the* <code>k</code> *most frequent elements*. You may return the answer in **any order**.


**Example 1:**
>
> **Input:** nums = [1,1,1,2,2,3], k = 2
>
> **Output:** [1,2]

**Example 2:**
>
> **Input:** nums = [1], k = 1
>
> **Output:** [1]


**Constraints:**

- <code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code>

- <code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code>

- <code>k</code> is in the range <code>[1, the number of unique elements in the array]</code>.

- It is **guaranteed** that the answer is **unique**.


**Follow up:** Your algorithm's time complexity must be better than <code>O(n log n)</code>, where n is the array's size.
