# Maximum Element After Decreasing and Rearranging

You are given an array of positive integers <code>arr</code>. Perform some operations (possibly none) on <code>arr</code> so that it satisfies these conditions:

- The value of the **first** element in <code>arr</code> must be <code>1</code>.

- The absolute difference between any 2 adjacent elements must be **less than or equal to **<code>1</code>. In other words, <code>abs(arr[i] - arr[i - 1]) &lt;= 1</code> for each <code>i</code> where <code>1 &lt;= i &lt; arr.length</code> (**0-indexed**). <code>abs(x)</code> is the absolute value of <code>x</code>.

There are 2 types of operations that you can perform any number of times:

- **Decrease** the value of any element of <code>arr</code> to a **smaller positive integer**.

- **Rearrange** the elements of <code>arr</code> to be in any order.

Return *the **maximum** possible value of an element in *<code>arr</code>* after performing the operations to satisfy the conditions*.


**Example 1:**
>
> **Input:** arr = [2,2,1,2,1]
>
> **Output:** 2
>
> **Explanation:**
>
> We can satisfy the conditions by rearranging <code>arr</code> so it becomes <code>[1,2,2,2,1]</code>.
>
> The largest element in <code>arr</code> is 2.

**Example 2:**
>
> **Input:** arr = [100,1,1000]
>
> **Output:** 3
>
> **Explanation:**
>
> One possible way to satisfy the conditions is by doing the following:
>
> 1. Rearrange <code>arr</code> so it becomes <code>[1,100,1000]</code>.
>
> 2. Decrease the value of the second element to 2.
>
> 3. Decrease the value of the third element to 3.
>
> Now <code>arr = [1,2,3]</code>, which<code> </code>satisfies the conditions.
>
> The largest element in <code>arr is 3.</code>

**Example 3:**
>
> **Input:** arr = [1,2,3,4,5]
>
> **Output:** 5
>
> **Explanation:** The array already satisfies the conditions, and the largest element is 5.


**Constraints:**

- <code>1 &lt;= arr.length &lt;= 10<sup>5</sup></code>

- <code>1 &lt;= arr[i] &lt;= 10<sup>9</sup></code>
