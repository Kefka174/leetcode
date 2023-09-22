# Successful Pairs of Spells and Potions

You are given two positive integer arrays <code>spells</code> and <code>potions</code>, of length <code>n</code> and <code>m</code> respectively, where <code>spells[i]</code> represents the strength of the <code>i<sup>th</sup></code> spell and <code>potions[j]</code> represents the strength of the <code>j<sup>th</sup></code> potion.

You are also given an integer <code>success</code>. A spell and potion pair is considered **successful** if the **product** of their strengths is **at least** <code>success</code>.

Return *an integer array *<code>pairs</code>* of length *<code>n</code>* where *<code>pairs[i]</code>* is the number of **potions** that will form a successful pair with the *<code>i<sup>th</sup></code>* spell.*


**Example 1:**
>
> **Input:** spells = [5,1,3], potions = [1,2,3,4,5], success = 7
>
> **Output:** [4,0,3]
>
> **Explanation:**
>
> - 0<sup>th</sup> spell: 5 * [1,2,3,4,5] = [5,<u>**10**</u>,<u>**15**</u>,<u>**20**</u>,<u>**25**</u>]. 4 pairs are successful.
>
> - 1<sup>st</sup> spell: 1 * [1,2,3,4,5] = [1,2,3,4,5]. 0 pairs are successful.
>
> - 2<sup>nd</sup> spell: 3 * [1,2,3,4,5] = [3,6,<u>**9**</u>,<u>**12**</u>,<u>**15**</u>]. 3 pairs are successful.
>
> Thus, [4,0,3] is returned.

**Example 2:**
>
> **Input:** spells = [3,1,2], potions = [8,5,8], success = 16
>
> **Output:** [2,0,2]
>
> **Explanation:**
>
> - 0<sup>th</sup> spell: 3 * [8,5,8] = [<u>**24**</u>,15,<u>**24**</u>]. 2 pairs are successful.
>
> - 1<sup>st</sup> spell: 1 * [8,5,8] = [8,5,8]. 0 pairs are successful.
>
> - 2<sup>nd</sup> spell: 2 * [8,5,8] = [**<u>16</u>**,10,<u>**16**</u>]. 2 pairs are successful.
>
> Thus, [2,0,2] is returned.


**Constraints:**

- <code>n == spells.length</code>

- <code>m == potions.length</code>

- <code>1 &lt;= n, m &lt;= 10<sup>5</sup></code>

- <code>1 &lt;= spells[i], potions[i] &lt;= 10<sup>5</sup></code>

- <code>1 &lt;= success &lt;= 10<sup>10</sup></code>
