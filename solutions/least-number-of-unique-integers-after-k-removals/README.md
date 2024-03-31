# Least Number of Unique Integers after K Removals

Given an array of integers&nbsp;<code>arr</code>&nbsp;and an integer <code>k</code>.&nbsp;Find the *least number of unique integers*&nbsp;after removing **exactly** <code>k</code> elements<b>.</b>


**Example 1:**
>
> **Input: **arr = [5,5,4], k = 1
>
> **Output: **1
>
> **Explanation**: Remove the single 4, only 5 is left.
>
> **Input: **arr = [4,3,1,1,3,3,2], k = 3
>
> **Output: **2
>
> **Explanation**: Remove 4, 2 and either one of the two 1s or three 3s. 1 and 3 will be left.


**Constraints:**

- <code>1 &lt;= arr.length&nbsp;&lt;= 10^5</code>

- <code>1 &lt;= arr[i] &lt;= 10^9</code>

- <code>0 &lt;= k&nbsp;&lt;= arr.length</code>
