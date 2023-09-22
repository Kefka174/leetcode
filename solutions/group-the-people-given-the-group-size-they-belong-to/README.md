# Group the People Given the Group Size They Belong To

There are <code>n</code> people&nbsp;that are split into some unknown number of groups. Each person is labeled with a&nbsp;**unique ID**&nbsp;from&nbsp;<code>0</code>&nbsp;to&nbsp;<code>n - 1</code>.

You are given an integer array&nbsp;<code>groupSizes</code>, where <code>groupSizes[i]</code>&nbsp;is the size of the group that person&nbsp;<code>i</code>&nbsp;is in. For example, if&nbsp;<code>groupSizes[1] = 3</code>, then&nbsp;person&nbsp;<code>1</code>&nbsp;must be in a&nbsp;group of size&nbsp;<code>3</code>.

Return&nbsp;*a list of groups&nbsp;such that&nbsp;each person&nbsp;<code>i</code>&nbsp;is in a group of size&nbsp;<code>groupSizes[i]</code>*.

Each person should&nbsp;appear in&nbsp;**exactly one group**,&nbsp;and every person must be in a group. If there are&nbsp;multiple answers, **return any of them**. It is **guaranteed** that there will be **at least one** valid solution for the given input.


**Example 1:**
>
> **Input:** groupSizes = [3,3,3,3,3,1,3]
>
> **Output:** [[5],[0,1,2],[3,4,6]]
>
> <b>Explanation:</b>
>
> The first group is [5]. The size is 1, and groupSizes[5] = 1.
>
> The second group is [0,1,2]. The size is 3, and groupSizes[0] = groupSizes[1] = groupSizes[2] = 3.
>
> The third group is [3,4,6]. The size is 3, and groupSizes[3] = groupSizes[4] = groupSizes[6] = 3.
>
> Other possible solutions are [[2,1,6],[5],[0,4,3]] and [[5],[0,6,2],[4,3,1]].

**Example 2:**
>
> **Input:** groupSizes = [2,1,3,3,3,2]
>
> **Output:** [[1],[0,5],[2,3,4]]


**Constraints:**

- <code>groupSizes.length == n</code>

- <code>1 &lt;= n&nbsp;&lt;= 500</code>

- <code>1 &lt;=&nbsp;groupSizes[i] &lt;= n</code>
