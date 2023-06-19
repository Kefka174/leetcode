# Jump Game III

Given an array of non-negative integers <code>arr</code>, you are initially positioned at <code>start</code>&nbsp;index of the array. When you are at index <code>i</code>, you can jump&nbsp;to <code>i + arr[i]</code> or <code>i - arr[i]</code>, check if you can reach to **any** index with value 0.

Notice that you can not jump outside of the array at any time.


**Example 1:**
>
> **Input:** arr = [4,2,3,0,3,1,2], start = 5
>
> **Output:** true
>
> **Explanation:**
>
> All possible ways to reach at index 3 with value 0 are:
>
> index 5 -&gt; index 4 -&gt; index 1 -&gt; index 3
>
> index 5 -&gt; index 6 -&gt; index 4 -&gt; index 1 -&gt; index 3

**Example 2:**
>
> **Input:** arr = [4,2,3,0,3,1,2], start = 0
>
> **Output:** true
>
> **Explanation:
>
> **One possible way to reach at index 3 with value 0 is:
>
> index 0 -&gt; index 4 -&gt; index 1 -&gt; index 3

**Example 3:**
>
> **Input:** arr = [3,0,2,1,2], start = 2
>
> **Output:** false
>
> **Explanation: **There is no way to reach at index 1 with value 0.


**Constraints:**

- <code>1 &lt;= arr.length &lt;= 5 * 10<sup>4</sup></code>

- <code>0 &lt;= arr[i] &lt;&nbsp;arr.length</code>

- <code>0 &lt;= start &lt; arr.length</code>
