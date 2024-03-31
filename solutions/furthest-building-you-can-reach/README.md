# Furthest Building You Can Reach

You are given an integer array <code>heights</code> representing the heights of buildings, some <code>bricks</code>, and some <code>ladders</code>.

You start your journey from building <code>0</code> and move to the next building by possibly using bricks or ladders.

While moving from building <code>i</code> to building <code>i+1</code> (**0-indexed**),

- If the current building's height is **greater than or equal** to the next building's height, you do **not** need a ladder or bricks.

- If the current building's height is <b>less than</b> the next building's height, you can either use **one ladder** or <code>(h[i+1] - h[i])</code> **bricks**.

*Return the furthest building index (0-indexed) you can reach if you use the given ladders and bricks optimally.*


**Example 1:**
>
> **Input:** heights = [4,2,7,6,9,14,12], bricks = 5, ladders = 1
>
> **Output:** 4
>
> **Explanation:** Starting at building 0, you can follow these steps:
>
> - Go to building 1 without using ladders nor bricks since 4 &gt;= 2.
>
> - Go to building 2 using 5 bricks. You must use either bricks or ladders because 2 &lt; 7.
>
> - Go to building 3 without using ladders nor bricks since 7 &gt;= 6.
>
> - Go to building 4 using your only ladder. You must use either bricks or ladders because 6 &lt; 9.
>
> It is impossible to go beyond building 4 because you do not have any more bricks or ladders.

**Example 2:**
>
> **Input:** heights = [4,12,2,7,3,18,20,3,19], bricks = 10, ladders = 2
>
> **Output:** 7

**Example 3:**
>
> **Input:** heights = [14,3,19,3], bricks = 17, ladders = 0
>
> **Output:** 3


**Constraints:**

- <code>1 &lt;= heights.length &lt;= 10<sup>5</sup></code>

- <code>1 &lt;= heights[i] &lt;= 10<sup>6</sup></code>

- <code>0 &lt;= bricks &lt;= 10<sup>9</sup></code>

- <code>0 &lt;= ladders &lt;= heights.length</code>
