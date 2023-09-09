# Maximum Subsequence Score

You are given two **0-indexed** integer arrays <code>nums1</code> and <code>nums2</code> of equal length <code>n</code> and a positive integer <code>k</code>. You must choose a **subsequence** of indices from <code>nums1</code> of length <code>k</code>.

For chosen indices <code>i<sub>0</sub></code>, <code>i<sub>1</sub></code>, ..., <code>i<sub>k - 1</sub></code>, your **score** is defined as:

- The sum of the selected elements from <code>nums1</code> multiplied with the **minimum** of the selected elements from <code>nums2</code>.

- It can defined simply as: <code>(nums1[i<sub>0</sub>] + nums1[i<sub>1</sub>] +...+ nums1[i<sub>k - 1</sub>]) * min(nums2[i<sub>0</sub>] , nums2[i<sub>1</sub>], ... ,nums2[i<sub>k - 1</sub>])</code>.

Return *the **maximum** possible score.*

A **subsequence** of indices of an array is a set that can be derived from the set <code>{0, 1, ..., n-1}</code> by deleting some or no elements.


**Example 1:**
>
> **Input:** nums1 = [1,3,3,2], nums2 = [2,1,3,4], k = 3
>
> **Output:** 12
>
> **Explanation:**
>
> The four possible subsequence scores are:
>
> - We choose the indices 0, 1, and 2 with score = (1+3+3) * min(2,1,3) = 7.
>
> - We choose the indices 0, 1, and 3 with score = (1+3+2) * min(2,1,4) = 6.
>
> - We choose the indices 0, 2, and 3 with score = (1+3+2) * min(2,3,4) = 12.
>
> - We choose the indices 1, 2, and 3 with score = (3+3+2) * min(1,3,4) = 8.
>
> Therefore, we return the max score, which is 12.

**Example 2:**
>
> **Input:** nums1 = [4,2,3,1,1], nums2 = [7,5,10,9,6], k = 1
>
> **Output:** 30
>
> **Explanation:**
>
> Choosing index 2 is optimal: nums1[2] * nums2[2] = 3 * 10 = 30 is the maximum possible score.


**Constraints:**

- <code>n == nums1.length == nums2.length</code>

- <code>1 &lt;= n &lt;= 10<sup>5</sup></code>

- <code>0 &lt;= nums1[i], nums2[j] &lt;= 10<sup>5</sup></code>

- <code>1 &lt;= k &lt;= n</code>
