# Jump Game IV

Given an array of&nbsp;integers <code>arr</code>, you are initially positioned at the first index of the array.

In one step you can jump from index <code>i</code> to index:

- <code>i + 1</code> where:&nbsp;<code>i + 1 &lt; arr.length</code>.

- <code>i - 1</code> where:&nbsp;<code>i - 1 &gt;= 0</code>.

- <code>j</code> where: <code>arr[i] == arr[j]</code> and <code>i != j</code>.

Return *the minimum number of steps* to reach the **last index** of the array.

Notice that you can not jump outside of the array at any time.


**Example 1:**
>
> **Input:** arr = [100,-23,-23,404,100,23,23,23,3,404]
>
> **Output:** 3
>
> **Explanation:** You need three jumps from index 0 --&gt; 4 --&gt; 3 --&gt; 9. Note that index 9 is the last index of the array.

**Example 2:**
>
> **Input:** arr = [7]
>
> **Output:** 0
>
> **Explanation:** Start index is the last index. You do not need to jump.

**Example 3:**
>
> **Input:** arr = [7,6,9,6,9,6,9,7]
>
> **Output:** 1
>
> **Explanation:** You can jump directly from index 0 to index 7 which is last index of the array.


**Constraints:**

- <code>1 &lt;= arr.length &lt;= 5 * 10<sup>4</sup></code>

- <code>-10<sup>8</sup> &lt;= arr[i] &lt;= 10<sup>8</sup></code>
