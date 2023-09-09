# Reorder Routes to Make All Paths Lead to the City Zero

There are <code>n</code> cities numbered from <code>0</code> to <code>n - 1</code> and <code>n - 1</code> roads such that there is only one way to travel between two different cities (this network form a tree). Last year, The ministry of transport decided to orient the roads in one direction because they are too narrow.

Roads are represented by <code>connections</code> where <code>connections[i] = [a<sub>i</sub>, b<sub>i</sub>]</code> represents a road from city <code>a<sub>i</sub></code> to city <code>b<sub>i</sub></code>.

This year, there will be a big event in the capital (city <code>0</code>), and many people want to travel to this city.

Your task consists of reorienting some roads such that each city can visit the city <code>0</code>. Return the **minimum** number of edges changed.

It's **guaranteed** that each city can reach city <code>0</code> after reorder.


**Example 1:**
>
> **Input:** n = 6, connections = [[0,1],[1,3],[2,3],[4,0],[4,5]]
>
> **Output:** 3
>
> **Explanation: **Change the direction of edges show in red such that each node can reach the node 0 (capital).

**Example 2:**
>
> **Input:** n = 5, connections = [[1,0],[1,2],[3,2],[3,4]]
>
> **Output:** 2
>
> **Explanation: **Change the direction of edges show in red such that each node can reach the node 0 (capital).

**Example 3:**
>
> **Input:** n = 3, connections = [[1,0],[2,0]]
>
> **Output:** 0


**Constraints:**

- <code>2 &lt;= n &lt;= 5 * 10<sup>4</sup></code>

- <code>connections.length == n - 1</code>

- <code>connections[i].length == 2</code>

- <code>0 &lt;= a<sub>i</sub>, b<sub>i</sub> &lt;= n - 1</code>

- <code>a<sub>i</sub> != b<sub>i</sub></code>
