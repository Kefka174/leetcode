# Find Players With Zero or One Losses

You are given an integer array <code>matches</code> where <code>matches[i] = [winner<sub>i</sub>, loser<sub>i</sub>]</code> indicates that the player <code>winner<sub>i</sub></code> defeated player <code>loser<sub>i</sub></code> in a match.

Return *a list *<code>answer</code>* of size *<code>2</code>* where:*

- <code>answer[0]</code> is a list of all players that have **not** lost any matches.

- <code>answer[1]</code> is a list of all players that have lost exactly **one** match.

The values in the two lists should be returned in **increasing** order.

**Note:**

- You should only consider the players that have played **at least one** match.

- The testcases will be generated such that **no** two matches will have the **same** outcome.


**Example 1:**
>
> **Input:** matches = [[1,3],[2,3],[3,6],[5,6],[5,7],[4,5],[4,8],[4,9],[10,4],[10,9]]
>
> **Output:** [[1,2,10],[4,5,7,8]]
>
> **Explanation:**
>
> Players 1, 2, and 10 have not lost any matches.
>
> Players 4, 5, 7, and 8 each have lost one match.
>
> Players 3, 6, and 9 each have lost two matches.
>
> Thus, answer[0] = [1,2,10] and answer[1] = [4,5,7,8].

**Example 2:**
>
> **Input:** matches = [[2,3],[1,3],[5,4],[6,4]]
>
> **Output:** [[1,2,5,6],[]]
>
> **Explanation:**
>
> Players 1, 2, 5, and 6 have not lost any matches.
>
> Players 3 and 4 each have lost two matches.
>
> Thus, answer[0] = [1,2,5,6] and answer[1] = [].


**Constraints:**

- <code>1 &lt;= matches.length &lt;= 10<sup>5</sup></code>

- <code>matches[i].length == 2</code>

- <code>1 &lt;= winner<sub>i</sub>, loser<sub>i</sub> &lt;= 10<sup>5</sup></code>

- <code>winner<sub>i</sub> != loser<sub>i</sub></code>

- All <code>matches[i]</code> are **unique**.
