# Can Make Arithmetic Progression From Sequence

A sequence of numbers is called an **arithmetic progression** if the difference between any two consecutive elements is the same.

Given an array of numbers <code>arr</code>, return <code>true</code> *if the array can be rearranged to form an **arithmetic progression**. Otherwise, return* <code>false</code>.


**Example 1:**
>
> **Input:** arr = [3,5,1]
>
> **Output:** true
>
> **Explanation: **We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.

**Example 2:**
>
> **Input:** arr = [1,2,4]
>
> **Output:** false
>
> **Explanation: **There is no way to reorder the elements to obtain an arithmetic progression.


**Constraints:**

- <code>2 &lt;= arr.length &lt;= 1000</code>

- <code>-10<sup>6</sup> &lt;= arr[i] &lt;= 10<sup>6</sup></code>
