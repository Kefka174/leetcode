# Keys and Rooms

There are <code>n</code> rooms labeled from <code>0</code> to <code>n - 1</code>&nbsp;and all the rooms are locked except for room <code>0</code>. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.

When you visit a room, you may find a set of **distinct keys** in it. Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.

Given an array <code>rooms</code> where <code>rooms[i]</code> is the set of keys that you can obtain if you visited room <code>i</code>, return <code>true</code> *if you can visit **all** the rooms, or* <code>false</code> *otherwise*.


**Example 1:**
>
> **Input:** rooms = [[1],[2],[3],[]]
>
> **Output:** true
>
> **Explanation:**
>
> We visit room 0 and pick up key 1.
>
> We then visit room 1 and pick up key 2.
>
> We then visit room 2 and pick up key 3.
>
> We then visit room 3.
>
> Since we were able to visit every room, we return true.

**Example 2:**
>
> **Input:** rooms = [[1,3],[3,0,1],[2],[0]]
>
> **Output:** false
>
> **Explanation:** We can not enter room number 2 since the only key that unlocks it is in that room.


**Constraints:**

- <code>n == rooms.length</code>

- <code>2 &lt;= n &lt;= 1000</code>

- <code>0 &lt;= rooms[i].length &lt;= 1000</code>

- <code>1 &lt;= sum(rooms[i].length) &lt;= 3000</code>

- <code>0 &lt;= rooms[i][j] &lt; n</code>

- All the values of <code>rooms[i]</code> are **unique**.
