# Distance Between Bus Stops

A bus&nbsp;has <code>n</code> stops numbered from <code>0</code> to <code>n - 1</code> that form&nbsp;a circle. We know the distance between all pairs of neighboring stops where <code>distance[i]</code> is the distance between the stops number&nbsp;<code>i</code> and <code>(i + 1) % n</code>.

The bus goes along both directions&nbsp;i.e. clockwise and counterclockwise.

Return the shortest distance between the given&nbsp;<code>start</code>&nbsp;and <code>destination</code>&nbsp;stops.


**Example 1:**

<img alt="" src="https://assets.leetcode.com/uploads/2019/09/03/untitled-diagram-1.jpg" style="width: 388px; height: 240px;">
>
> **Input:** distance = [1,2,3,4], start = 0, destination = 1
>
> **Output:** 1
>
> **Explanation:** Distance between 0 and 1 is 1 or 9, minimum is 1.


**Example 2:**

<img alt="" src="https://assets.leetcode.com/uploads/2019/09/03/untitled-diagram-1-1.jpg" style="width: 388px; height: 240px;">
>
> **Input:** distance = [1,2,3,4], start = 0, destination = 2
>
> **Output:** 3
>
> **Explanation:** Distance between 0 and 2 is 3 or 7, minimum is 3.


**Example 3:**

<img alt="" src="https://assets.leetcode.com/uploads/2019/09/03/untitled-diagram-1-2.jpg" style="width: 388px; height: 240px;">
>
> **Input:** distance = [1,2,3,4], start = 0, destination = 3
>
> **Output:** 4
>
> **Explanation:** Distance between 0 and 3 is 6 or 4, minimum is 4.


**Constraints:**

- <code>1 &lt;= n&nbsp;&lt;= 10^4</code>

- <code>distance.length == n</code>

- <code>0 &lt;= start, destination &lt; n</code>

- <code>0 &lt;= distance[i] &lt;= 10^4</code>
