# Search a 2D Matrix

You are given an <code>m x n</code> integer matrix <code>matrix</code> with the following two properties:

- Each row is sorted in non-decreasing order.

- The first integer of each row is greater than the last integer of the previous row.

Given an integer <code>target</code>, return <code>true</code> *if* <code>target</code> *is in* <code>matrix</code> *or* <code>false</code> *otherwise*.

You must write a solution in <code>O(log(m * n))</code> time complexity.


**Example 1:**
>
> **Input:** matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
>
> **Output:** true

**Example 2:**
>
> **Input:** matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
>
> **Output:** false


**Constraints:**

- <code>m == matrix.length</code>

- <code>n == matrix[i].length</code>

- <code>1 &lt;= m, n &lt;= 100</code>

- <code>-10<sup>4</sup> &lt;= matrix[i][j], target &lt;= 10<sup>4</sup></code>
