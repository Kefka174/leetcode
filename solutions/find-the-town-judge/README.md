# Find the Town Judge

In a town, there are <code>n</code> people labeled from <code>1</code> to <code>n</code>. There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

- The town judge trusts nobody.

- Everybody (except for the town judge) trusts the town judge.

- There is exactly one person that satisfies properties **1** and **2**.

You are given an array <code>trust</code> where <code>trust[i] = [a<sub>i</sub>, b<sub>i</sub>]</code> representing that the person labeled <code>a<sub>i</sub></code> trusts the person labeled <code>b<sub>i</sub></code>. If a trust relationship does not exist in <code>trust</code> array, then such a trust relationship does not exist.

Return *the label of the town judge if the town judge exists and can be identified, or return *<code>-1</code>* otherwise*.


**Example 1:**
>
> **Input:** n = 2, trust = [[1,2]]
>
> **Output:** 2

**Example 2:**
>
> **Input:** n = 3, trust = [[1,3],[2,3]]
>
> **Output:** 3

**Example 3:**
>
> **Input:** n = 3, trust = [[1,3],[2,3],[3,1]]
>
> **Output:** -1


**Constraints:**

- <code>1 &lt;= n &lt;= 1000</code>

- <code>0 &lt;= trust.length &lt;= 10<sup>4</sup></code>

- <code>trust[i].length == 2</code>

- All the pairs of <code>trust</code> are **unique**.

- <code>a<sub>i</sub> != b<sub>i</sub></code>

- <code>1 &lt;= a<sub>i</sub>, b<sub>i</sub> &lt;= n</code>
