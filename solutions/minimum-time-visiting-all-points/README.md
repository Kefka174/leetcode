# Minimum Time Visiting All Points

On a 2D plane, there are <code>n</code> points with integer coordinates <code>points[i] = [x<sub>i</sub>, y<sub>i</sub>]</code>. Return *the **minimum time** in seconds to visit all the points in the order given by *<code>points</code>.

You can move according to these rules:

- In <code>1</code> second, you can either:

- <ul>

- <li>move vertically by one&nbsp;unit,</li>

- <li>move horizontally by one unit, or</li>

- <li>move diagonally <code>sqrt(2)</code> units (in other words, move one unit vertically then one unit horizontally in <code>1</code> second).</li>

- </ul>

- 

- move vertically by one&nbsp;unit,

- move horizontally by one unit, or

- move diagonally <code>sqrt(2)</code> units (in other words, move one unit vertically then one unit horizontally in <code>1</code> second).

- You have to visit the points in the same order as they appear in the array.

- You are allowed to pass through points that appear later in the order, but these do not count as visits.


**Example 1:**
>
> **Input:** points = [[1,1],[3,4],[-1,0]]
>
> **Output:** 7
>
> **Explanation: **One optimal path is **[1,1]** -&gt; [2,2] -&gt; [3,3] -&gt; **[3,4] **-&gt; [2,3] -&gt; [1,2] -&gt; [0,1] -&gt; **[-1,0]**
>
> Time from [1,1] to [3,4] = 3 seconds
>
> Time from [3,4] to [-1,0] = 4 seconds
>
> Total time = 7 seconds

**Example 2:**
>
> **Input:** points = [[3,2],[-2,2]]
>
> **Output:** 5


**Constraints:**

- <code>points.length == n</code>

- <code>1 &lt;= n&nbsp;&lt;= 100</code>

- <code>points[i].length == 2</code>

- <code>-1000&nbsp;&lt;= points[i][0], points[i][1]&nbsp;&lt;= 1000</code>
