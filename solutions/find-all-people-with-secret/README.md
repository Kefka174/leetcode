# Find All People With Secret

You are given an integer <code>n</code> indicating there are <code>n</code> people numbered from <code>0</code> to <code>n - 1</code>. You are also given a **0-indexed** 2D integer array <code>meetings</code> where <code>meetings[i] = [x<sub>i</sub>, y<sub>i</sub>, time<sub>i</sub>]</code> indicates that person <code>x<sub>i</sub></code> and person <code>y<sub>i</sub></code> have a meeting at <code>time<sub>i</sub></code>. A person may attend **multiple meetings** at the same time. Finally, you are given an integer <code>firstPerson</code>.

Person <code>0</code> has a **secret** and initially shares the secret with a person <code>firstPerson</code> at time <code>0</code>. This secret is then shared every time a meeting takes place with a person that has the secret. More formally, for every meeting, if a person <code>x<sub>i</sub></code> has the secret at <code>time<sub>i</sub></code>, then they will share the secret with person <code>y<sub>i</sub></code>, and vice versa.

The secrets are shared **instantaneously**. That is, a person may receive the secret and share it with people in other meetings within the same time frame.

Return *a list of all the people that have the secret after all the meetings have taken place. *You may return the answer in **any order**.


**Example 1:**
>
> **Input:** n = 6, meetings = [[1,2,5],[2,3,8],[1,5,10]], firstPerson = 1
>
> **Output:** [0,1,2,3,5]
>
> **Explanation:
>
> **At time 0, person 0 shares the secret with person 1.
>
> At time 5, person 1 shares the secret with person 2.
>
> At time 8, person 2 shares the secret with person 3.
>
> At time 10, person 1 shares the secret with person 5.​​​​
>
> Thus, people 0, 1, 2, 3, and 5 know the secret after all the meetings.

**Example 2:**
>
> **Input:** n = 4, meetings = [[3,1,3],[1,2,2],[0,3,3]], firstPerson = 3
>
> **Output:** [0,1,3]
>
> **Explanation:**
>
> At time 0, person 0 shares the secret with person 3.
>
> At time 2, neither person 1 nor person 2 know the secret.
>
> At time 3, person 3 shares the secret with person 0 and person 1.
>
> Thus, people 0, 1, and 3 know the secret after all the meetings.

**Example 3:**
>
> **Input:** n = 5, meetings = [[3,4,2],[1,2,1],[2,3,1]], firstPerson = 1
>
> **Output:** [0,1,2,3,4]
>
> **Explanation:**
>
> At time 0, person 0 shares the secret with person 1.
>
> At time 1, person 1 shares the secret with person 2, and person 2 shares the secret with person 3.
>
> Note that person 2 can share the secret at the same time as receiving it.
>
> At time 2, person 3 shares the secret with person 4.
>
> Thus, people 0, 1, 2, 3, and 4 know the secret after all the meetings.


**Constraints:**

- <code>2 &lt;= n &lt;= 10<sup>5</sup></code>

- <code>1 &lt;= meetings.length &lt;= 10<sup>5</sup></code>

- <code>meetings[i].length == 3</code>

- <code>0 &lt;= x<sub>i</sub>, y<sub>i </sub>&lt;= n - 1</code>

- <code>x<sub>i</sub> != y<sub>i</sub></code>

- <code>1 &lt;= time<sub>i</sub> &lt;= 10<sup>5</sup></code>

- <code>1 &lt;= firstPerson &lt;= n - 1</code>
