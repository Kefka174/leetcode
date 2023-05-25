# Counting Bits

Given an integer <code>n</code>, return *an array *<code>ans</code>* of length *<code>n + 1</code>* such that for each *<code>i</code>* *(<code>0 &lt;= i &lt;= n</code>)*, *<code>ans[i]</code>* is the **number of ***<code>1</code>***'s** in the binary representation of *<code>i</code>.


**Example 1:**
>
> **Input:** n = 2
>
> **Output:** [0,1,1]
>
> **Explanation:**
>
> 0 --&gt; 0
>
> 1 --&gt; 1
>
> 2 --&gt; 10

**Example 2:**
>
> **Input:** n = 5
>
> **Output:** [0,1,1,2,1,2]
>
> **Explanation:**
>
> 0 --&gt; 0
>
> 1 --&gt; 1
>
> 2 --&gt; 10
>
> 3 --&gt; 11
>
> 4 --&gt; 100
>
> 5 --&gt; 101


**Constraints:**

- <code>0 &lt;= n &lt;= 10<sup>5</sup></code>


**Follow up:**

- It is very easy to come up with a solution with a runtime of <code>O(n log n)</code>. Can you do it in linear time <code>O(n)</code> and possibly in a single pass?

- Can you do it without using any built-in function (i.e., like <code>__builtin_popcount</code> in C++)?
