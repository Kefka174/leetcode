# Reduction Operations to Make the Array Elements Equal

Given an integer array <code>nums</code>, your goal is to make all elements in <code>nums</code> equal. To complete one operation, follow these steps:

- Find the **largest** value in <code>nums</code>. Let its index be <code>i</code> (**0-indexed**) and its value be <code>largest</code>. If there are multiple elements with the largest value, pick the smallest <code>i</code>.

- Find the **next largest** value in <code>nums</code> **strictly smaller** than <code>largest</code>. Let its value be <code>nextLargest</code>.

- Reduce <code>nums[i]</code> to <code>nextLargest</code>.

Return *the number of operations to make all elements in *<code>nums</code>* equal*.


**Example 1:**
>
> **Input:** nums = [5,1,3]
>
> **Output:** 3
>
> **Explanation:**&nbsp;It takes 3 operations to make all elements in nums equal:
>
> 1. largest = 5 at index 0. nextLargest = 3. Reduce nums[0] to 3. nums = [<u>3</u>,1,3].
>
> 2. largest = 3 at index 0. nextLargest = 1. Reduce nums[0] to 1. nums = [<u>1</u>,1,3].
>
> 3. largest = 3 at index 2. nextLargest = 1. Reduce nums[2] to 1. nums = [1,1,<u>1</u>].

**Example 2:**
>
> **Input:** nums = [1,1,1]
>
> **Output:** 0
>
> **Explanation:**&nbsp;All elements in nums are already equal.

**Example 3:**
>
> **Input:** nums = [1,1,2,2,3]
>
> **Output:** 4
>
> **Explanation:**&nbsp;It takes 4 operations to make all elements in nums equal:
>
> 1. largest = 3 at index 4. nextLargest = 2. Reduce nums[4] to 2. nums = [1,1,2,2,<u>2</u>].
>
> 2. largest = 2 at index 2. nextLargest = 1. Reduce nums[2] to 1. nums = [1,1,<u>1</u>,2,2].
>
> 3. largest = 2 at index 3. nextLargest = 1. Reduce nums[3] to 1. nums = [1,1,1,<u>1</u>,2].
>
> 4. largest = 2 at index 4. nextLargest = 1. Reduce nums[4] to 1. nums = [1,1,1,1,<u>1</u>].


**Constraints:**

- <code>1 &lt;= nums.length &lt;= 5 * 10<sup>4</sup></code>

- <code>1 &lt;= nums[i] &lt;= 5 * 10<sup>4</sup></code>
