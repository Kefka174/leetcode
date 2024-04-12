# First Missing Positive

Given an unsorted integer array <code>nums</code>. Return the *smallest positive integer* that is *not present* in <code>nums</code>.

You must implement an algorithm that runs in <code>O(n)</code> time and uses <code>O(1)</code> auxiliary space.


**Example 1:**
>
> **Input:** nums = [1,2,0]
>
> **Output:** 3
>
> **Explanation:** The numbers in the range [1,2] are all in the array.

**Example 2:**
>
> **Input:** nums = [3,4,-1,1]
>
> **Output:** 2
>
> **Explanation:** 1 is in the array but 2 is missing.

**Example 3:**
>
> **Input:** nums = [7,8,9,11,12]
>
> **Output:** 1
>
> **Explanation:** The smallest positive integer 1 is missing.


**Constraints:**

- <code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code>

- <code>-2<sup>31</sup> &lt;= nums[i] &lt;= 2<sup>31</sup> - 1</code>
