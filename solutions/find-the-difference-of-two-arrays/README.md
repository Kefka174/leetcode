# Find the Difference of Two Arrays

Given two **0-indexed** integer arrays <code>nums1</code> and <code>nums2</code>, return *a list* <code>answer</code> *of size* <code>2</code> *where:*

- <code>answer[0]</code> *is a list of all **distinct** integers in* <code>nums1</code> *which are **not** present in* <code>nums2</code>*.*

- <code>answer[1]</code> *is a list of all **distinct** integers in* <code>nums2</code> *which are **not** present in* <code>nums1</code>.

**Note** that the integers in the lists may be returned in **any** order.


**Example 1:**
>
> **Input:** nums1 = [1,2,3], nums2 = [2,4,6]
>
> **Output:** [[1,3],[4,6]]
>
> **Explanation:
>
> **For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
>
> For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].

**Example 2:**
>
> **Input:** nums1 = [1,2,3,3], nums2 = [1,1,2,2]
>
> **Output:** [[3],[]]
>
> **Explanation:
>
> **For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
>
> Every integer in nums2 is present in nums1. Therefore, answer[1] = [].


**Constraints:**

- <code>1 &lt;= nums1.length, nums2.length &lt;= 1000</code>

- <code>-1000 &lt;= nums1[i], nums2[i] &lt;= 1000</code>
