# Minimum Amount of Time to Collect Garbage

You are given a **0-indexed** array of strings <code>garbage</code> where <code>garbage[i]</code> represents the assortment of garbage at the <code>i<sup>th</sup></code> house. <code>garbage[i]</code> consists only of the characters <code>'M'</code>, <code>'P'</code> and <code>'G'</code> representing one unit of metal, paper and glass garbage respectively. Picking up **one** unit of any type of garbage takes <code>1</code> minute.

You are also given a **0-indexed** integer array <code>travel</code> where <code>travel[i]</code> is the number of minutes needed to go from house <code>i</code> to house <code>i + 1</code>.

There are three garbage trucks in the city, each responsible for picking up one type of garbage. Each garbage truck starts at house <code>0</code> and must visit each house **in order**; however, they do **not** need to visit every house.

Only **one** garbage truck may be used at any given moment. While one truck is driving or picking up garbage, the other two trucks **cannot** do anything.

Return* the **minimum** number of minutes needed to pick up all the garbage.*


**Example 1:**
>
> **Input:** garbage = ["G","P","GP","GG"], travel = [2,4,3]
>
> **Output:** 21
>
> **Explanation:**
>
> The paper garbage truck:
>
> 1. Travels from house 0 to house 1
>
> 2. Collects the paper garbage at house 1
>
> 3. Travels from house 1 to house 2
>
> 4. Collects the paper garbage at house 2
>
> Altogether, it takes 8 minutes to pick up all the paper garbage.
>
> The glass garbage truck:
>
> 1. Collects the glass garbage at house 0
>
> 2. Travels from house 0 to house 1
>
> 3. Travels from house 1 to house 2
>
> 4. Collects the glass garbage at house 2
>
> 5. Travels from house 2 to house 3
>
> 6. Collects the glass garbage at house 3
>
> Altogether, it takes 13 minutes to pick up all the glass garbage.
>
> Since there is no metal garbage, we do not need to consider the metal garbage truck.
>
> Therefore, it takes a total of 8 + 13 = 21 minutes to collect all the garbage.

**Example 2:**
>
> **Input:** garbage = ["MMM","PGM","GP"], travel = [3,10]
>
> **Output:** 37
>
> **Explanation:**
>
> The metal garbage truck takes 7 minutes to pick up all the metal garbage.
>
> The paper garbage truck takes 15 minutes to pick up all the paper garbage.
>
> The glass garbage truck takes 15 minutes to pick up all the glass garbage.
>
> It takes a total of 7 + 15 + 15 = 37 minutes to collect all the garbage.


**Constraints:**

- <code>2 &lt;= garbage.length &lt;= 10<sup>5</sup></code>

- <code>garbage[i]</code> consists of only the letters <code>'M'</code>, <code>'P'</code>, and <code>'G'</code>.

- <code>1 &lt;= garbage[i].length &lt;= 10</code>

- <code>travel.length == garbage.length - 1</code>

- <code>1 &lt;= travel[i] &lt;= 100</code>
