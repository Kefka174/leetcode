# Make Array Strictly Increasing

Given two integer arrays&nbsp;<code>arr1</code> and <code>arr2</code>, return the minimum number of operations (possibly zero) needed&nbsp;to make <code>arr1</code> strictly increasing.

In one operation, you can choose two indices&nbsp;<code>0 &lt;=&nbsp;i &lt; arr1.length</code>&nbsp;and&nbsp;<code>0 &lt;= j &lt; arr2.length</code>&nbsp;and do the assignment&nbsp;<code>arr1[i] = arr2[j]</code>.

If there is no way to make&nbsp;<code>arr1</code>&nbsp;strictly increasing,&nbsp;return&nbsp;<code>-1</code>.


**Example 1:**
>
> **Input:** arr1 = [1,5,3,6,7], arr2 = [1,3,2,4]
>
> **Output:** 1
>
> **Explanation:** Replace <code>5</code> with <code>2</code>, then <code>arr1 = [1, 2, 3, 6, 7]</code>.

**Example 2:**
>
> **Input:** arr1 = [1,5,3,6,7], arr2 = [4,3,1]
>
> **Output:** 2
>
> **Explanation:** Replace <code>5</code> with <code>3</code> and then replace <code>3</code> with <code>4</code>. <code>arr1 = [1, 3, 4, 6, 7]</code>.

**Example 3:**
>
> **Input:** arr1 = [1,5,3,6,7], arr2 = [1,6,3,3]
>
> **Output:** -1
>
> **Explanation:** You can't make <code>arr1</code> strictly increasing.


**Constraints:**

- <code>1 &lt;= arr1.length, arr2.length &lt;= 2000</code>

- <code>0 &lt;= arr1[i], arr2[i] &lt;= 10^9</code>

