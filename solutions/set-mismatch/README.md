# Set Mismatch

You have a set of integers <code>s</code>, which originally contains all the numbers from <code>1</code> to <code>n</code>. Unfortunately, due to some error, one of the numbers in <code>s</code> got duplicated to another number in the set, which results in **repetition of one** number and **loss of another** number.

You are given an integer array <code>nums</code> representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return *them in the form of an array*.


**Example 1:**
>
> **Input:** nums = [1,2,2,4]
>
> **Output:** [2,3]

**Example 2:**
>
> **Input:** nums = [1,1]
>
> **Output:** [1,2]


**Constraints:**

- <code>2 &lt;= nums.length &lt;= 10<sup>4</sup></code>

- <code>1 &lt;= nums[i] &lt;= 10<sup>4</sup></code>
