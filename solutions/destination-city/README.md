# Destination City

You are given the array <code>paths</code>, where <code>paths[i] = [cityA<sub>i</sub>, cityB<sub>i</sub>]</code> means there exists a direct path going from <code>cityA<sub>i</sub></code> to <code>cityB<sub>i</sub></code>. *Return the destination city, that is, the city without any path outgoing to another city.*

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.


**Example 1:**
>
> **Input:** paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
>
> **Output:** "Sao Paulo"
>
> **Explanation:** Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -&gt; "New York" -&gt; "Lima" -&gt; "Sao Paulo".

**Example 2:**
>
> **Input:** paths = [["B","C"],["D","B"],["C","A"]]
>
> **Output:** "A"
>
> **Explanation:** All possible trips are:&nbsp;
>
> "D" -&gt; "B" -&gt; "C" -&gt; "A".&nbsp;
>
> "B" -&gt; "C" -&gt; "A".&nbsp;
>
> "C" -&gt; "A".&nbsp;
>
> "A".&nbsp;
>
> Clearly the destination city is "A".

**Example 3:**
>
> **Input:** paths = [["A","Z"]]
>
> **Output:** "Z"


**Constraints:**

- <code>1 &lt;= paths.length &lt;= 100</code>

- <code>paths[i].length == 2</code>

- <code>1 &lt;= cityA<sub>i</sub>.length, cityB<sub>i</sub>.length &lt;= 10</code>

- <code>cityA<sub>i</sub> != cityB<sub>i</sub></code>

- All strings consist of lowercase and uppercase English letters and the space character.
