# Frequency of the Most Frequent Element

The **frequency** of an element is the number of times it occurs in an array.

You are given an integer array <code>nums</code> and an integer <code>k</code>. In one operation, you can choose an index of <code>nums</code> and increment the element at that index by <code>1</code>.

Return *the **maximum possible frequency** of an element after performing **at most** *<code>k</code>* operations*.


**Example 1:**
>
> **Input:** nums = [1,2,4], k = 5
>
> **Output:** 3**
>
> Explanation:** Increment the first element three times and the second element two times to make nums = [4,4,4].
>
> 4 has a frequency of 3.

**Example 2:**
>
> **Input:** nums = [1,4,8,13], k = 5
>
> **Output:** 2
>
> **Explanation:** There are multiple optimal solutions:
>
> - Increment the first element three times to make nums = [4,4,8,13]. 4 has a frequency of 2.
>
> - Increment the second element four times to make nums = [1,8,8,13]. 8 has a frequency of 2.
>
> - Increment the third element five times to make nums = [1,4,13,13]. 13 has a frequency of 2.

**Example 3:**
>
> **Input:** nums = [3,9,6], k = 2
>
> **Output:** 1


**Constraints:**

- <code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code>

- <code>1 &lt;= nums[i] &lt;= 10<sup>5</sup></code>

- <code>1 &lt;= k &lt;= 10<sup>5</sup></code>
