# Find All Groups of Farmland

You are given a **0-indexed** <code>m x n</code> binary matrix <code>land</code> where a <code>0</code> represents a hectare of forested land and a <code>1</code> represents a hectare of farmland.

To keep the land organized, there are designated rectangular areas of hectares that consist **entirely** of farmland. These rectangular areas are called **groups**. No two groups are adjacent, meaning farmland in one group is **not** four-directionally adjacent to another farmland in a different group.

<code>land</code> can be represented by a coordinate system where the top left corner of <code>land</code> is <code>(0, 0)</code> and the bottom right corner of <code>land</code> is <code>(m-1, n-1)</code>. Find the coordinates of the top left and bottom right corner of each **group** of farmland. A **group** of farmland with a top left corner at <code>(r<sub>1</sub>, c<sub>1</sub>)</code> and a bottom right corner at <code>(r<sub>2</sub>, c<sub>2</sub>)</code> is represented by the 4-length array <code>[r<sub>1</sub>, c<sub>1</sub>, r<sub>2</sub>, c<sub>2</sub>].</code>

Return *a 2D array containing the 4-length arrays described above for each **group** of farmland in *<code>land</code>*. If there are no groups of farmland, return an empty array. You may return the answer in **any order***.


**Example 1:**
>
> **Input:** land = [[1,0,0],[0,1,1],[0,1,1]]
>
> **Output:** [[0,0,0,0],[1,1,2,2]]
>
> **Explanation:**
>
> The first group has a top left corner at land[0][0] and a bottom right corner at land[0][0].
>
> The second group has a top left corner at land[1][1] and a bottom right corner at land[2][2].

**Example 2:**
>
> **Input:** land = [[1,1],[1,1]]
>
> **Output:** [[0,0,1,1]]
>
> **Explanation:**
>
> The first group has a top left corner at land[0][0] and a bottom right corner at land[1][1].

**Example 3:**
>
> **Input:** land = [[0]]
>
> **Output:** []
>
> **Explanation:**
>
> There are no groups of farmland.


**Constraints:**

- <code>m == land.length</code>

- <code>n == land[i].length</code>

- <code>1 &lt;= m, n &lt;= 300</code>

- <code>land</code> consists of only <code>0</code>'s and <code>1</code>'s.

- Groups of farmland are **rectangular** in shape.
