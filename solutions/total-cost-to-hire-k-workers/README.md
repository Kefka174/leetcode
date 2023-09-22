# Total Cost to Hire K Workers

You are given a **0-indexed** integer array <code>costs</code> where <code>costs[i]</code> is the cost of hiring the <code>i<sup>th</sup></code> worker.

You are also given two integers <code>k</code> and <code>candidates</code>. We want to hire exactly <code>k</code> workers according to the following rules:

- You will run <code>k</code> sessions and hire exactly one worker in each session.

- In each hiring session, choose the worker with the lowest cost from either the first <code>candidates</code> workers or the last <code>candidates</code> workers. Break the tie by the smallest index.

- <ul>

- <li>For example, if <code>costs = [3,2,7,7,1,2]</code> and <code>candidates = 2</code>, then in the first hiring session, we will choose the <code>4<sup>th</sup></code> worker because they have the lowest cost <code>[<u>3,2</u>,7,7,<u>**1**,2</u>]</code>.</li>

- <li>In the second hiring session, we will choose <code>1<sup>st</sup></code> worker because they have the same lowest cost as <code>4<sup>th</sup></code> worker but they have the smallest index <code>[<u>3,**2**</u>,7,<u>7,2</u>]</code>. Please note that the indexing may be changed in the process.</li>

- </ul>

- 

- For example, if <code>costs = [3,2,7,7,1,2]</code> and <code>candidates = 2</code>, then in the first hiring session, we will choose the <code>4<sup>th</sup></code> worker because they have the lowest cost <code>[<u>3,2</u>,7,7,<u>**1**,2</u>]</code>.

- In the second hiring session, we will choose <code>1<sup>st</sup></code> worker because they have the same lowest cost as <code>4<sup>th</sup></code> worker but they have the smallest index <code>[<u>3,**2**</u>,7,<u>7,2</u>]</code>. Please note that the indexing may be changed in the process.

- If there are fewer than candidates workers remaining, choose the worker with the lowest cost among them. Break the tie by the smallest index.

- A worker can only be chosen once.

Return *the total cost to hire exactly *<code>k</code>* workers.*


**Example 1:**
>
> **Input:** costs = [17,12,10,2,7,2,11,20,8], k = 3, candidates = 4
>
> **Output:** 11
>
> **Explanation:** We hire 3 workers in total. The total cost is initially 0.
>
> - In the first hiring round we choose the worker from [<u>17,12,10,2</u>,7,<u>2,11,20,8</u>]. The lowest cost is 2, and we break the tie by the smallest index, which is 3. The total cost = 0 + 2 = 2.
>
> - In the second hiring round we choose the worker from [<u>17,12,10,7</u>,<u>2,11,20,8</u>]. The lowest cost is 2 (index 4). The total cost = 2 + 2 = 4.
>
> - In the third hiring round we choose the worker from [<u>17,12,10,7,11,20,8</u>]. The lowest cost is 7 (index 3). The total cost = 4 + 7 = 11. Notice that the worker with index 3 was common in the first and last four workers.
>
> The total hiring cost is 11.

**Example 2:**
>
> **Input:** costs = [1,2,4,1], k = 3, candidates = 3
>
> **Output:** 4
>
> **Explanation:** We hire 3 workers in total. The total cost is initially 0.
>
> - In the first hiring round we choose the worker from [<u>1,2,4,1</u>]. The lowest cost is 1, and we break the tie by the smallest index, which is 0. The total cost = 0 + 1 = 1. Notice that workers with index 1 and 2 are common in the first and last 3 workers.
>
> - In the second hiring round we choose the worker from [<u>2,4,1</u>]. The lowest cost is 1 (index 2). The total cost = 1 + 1 = 2.
>
> - In the third hiring round there are less than three candidates. We choose the worker from the remaining workers [<u>2,4</u>]. The lowest cost is 2 (index 0). The total cost = 2 + 2 = 4.
>
> The total hiring cost is 4.


**Constraints:**

- <code>1 &lt;= costs.length &lt;= 10<sup>5 </sup></code>

- <code>1 &lt;= costs[i] &lt;= 10<sup>5</sup></code>

- <code>1 &lt;= k, candidates &lt;= costs.length</code>
