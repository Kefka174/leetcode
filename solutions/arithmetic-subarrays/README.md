# Arithmetic Subarrays

A sequence of numbers is called **arithmetic** if it consists of at least two elements, and the difference between every two consecutive elements is the same. More formally, a sequence <code>s</code> is arithmetic if and only if <code>s[i+1] - s[i] == s[1] - s[0] </code>for all valid <code>i</code>.

For example, these are **arithmetic** sequences:
>
> 1, 3, 5, 7, 9
>
> 7, 7, 7, 7
>
> 3, -1, -5, -9

The following sequence is not **arithmetic**:
>
> 1, 1, 2, 5, 7

You are given an array of <code>n</code> integers, <code>nums</code>, and two arrays of <code>m</code> integers each, <code>l</code> and <code>r</code>, representing the <code>m</code> range queries, where the <code>i<sup>th</sup></code> query is the range <code>[l[i], r[i]]</code>. All the arrays are **0-indexed**.

Return *a list of *<code>boolean</code> *elements* <code>answer</code>*, where* <code>answer[i]</code> *is* <code>true</code> *if the subarray* <code>nums[l[i]], nums[l[i]+1], ... , nums[r[i]]</code>* can be **rearranged** to form an **arithmetic** sequence, and* <code>false</code> *otherwise.*


**Example 1:**
>
> **Input:** nums = <code>[4,6,5,9,3,7]</code>, l = <code>[0,0,2]</code>, r = <code>[2,3,5]</code>
>
> **Output:** <code>[true,false,true]</code>
>
> **Explanation:**
>
> In the 0<sup>th</sup> query, the subarray is [4,6,5]. This can be rearranged as [6,5,4], which is an arithmetic sequence.
>
> In the 1<sup>st</sup> query, the subarray is [4,6,5,9]. This cannot be rearranged as an arithmetic sequence.
>
> In the 2<sup>nd</sup> query, the subarray is <code>[5,9,3,7]. This</code> can be rearranged as <code>[3,5,7,9]</code>, which is an arithmetic sequence.

**Example 2:**
>
> **Input:** nums = [-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10], l = [0,1,6,4,8,7], r = [4,4,9,7,9,10]
>
> **Output:** [false,true,false,false,true,true]


**Constraints:**

- <code>n == nums.length</code>

- <code>m == l.length</code>

- <code>m == r.length</code>

- <code>2 &lt;= n &lt;= 500</code>

- <code>1 &lt;= m &lt;= 500</code>

- <code>0 &lt;= l[i] &lt; r[i] &lt; n</code>

- <code>-10<sup>5</sup> &lt;= nums[i] &lt;= 10<sup>5</sup></code>
