# K-th Symbol in Grammar

We build a table of <code>n</code> rows (**1-indexed**). We start by writing <code>0</code> in the <code>1<sup>st</sup></code> row. Now in every subsequent row, we look at the previous row and replace each occurrence of <code>0</code> with <code>01</code>, and each occurrence of <code>1</code> with <code>10</code>.

- For example, for <code>n = 3</code>, the <code>1<sup>st</sup></code> row is <code>0</code>, the <code>2<sup>nd</sup></code> row is <code>01</code>, and the <code>3<sup>rd</sup></code> row is <code>0110</code>.

Given two integer <code>n</code> and <code>k</code>, return the <code>k<sup>th</sup></code> (**1-indexed**) symbol in the <code>n<sup>th</sup></code> row of a table of <code>n</code> rows.


**Example 1:**
>
> **Input:** n = 1, k = 1
>
> **Output:** 0
>
> **Explanation:** row 1: <u>0</u>

**Example 2:**
>
> **Input:** n = 2, k = 1
>
> **Output:** 0
>
> **Explanation:**
>
> row 1: 0
>
> row 2: <u>0</u>1

**Example 3:**
>
> **Input:** n = 2, k = 2
>
> **Output:** 1
>
> **Explanation:**
>
> row 1: 0
>
> row 2: 0<u>1</u>


**Constraints:**

- <code>1 &lt;= n &lt;= 30</code>

- <code>1 &lt;= k &lt;= 2<sup>n - 1</sup></code>
