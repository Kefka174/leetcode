# Number of Flowers in Full Bloom

You are given a **0-indexed** 2D integer array <code>flowers</code>, where <code>flowers[i] = [start<sub>i</sub>, end<sub>i</sub>]</code> means the <code>i<sup>th</sup></code> flower will be in **full bloom** from <code>start<sub>i</sub></code> to <code>end<sub>i</sub></code> (**inclusive**). You are also given a **0-indexed** integer array <code>people</code> of size <code>n</code>, where <code>people[i]</code> is the time that the <code>i<sup>th</sup></code> person will arrive to see the flowers.

Return *an integer array *<code>answer</code>* of size *<code>n</code>*, where *<code>answer[i]</code>* is the **number** of flowers that are in full bloom when the *<code>i<sup>th</sup></code>* person arrives.*


**Example 1:**
>
> **Input:** flowers = [[1,6],[3,7],[9,12],[4,13]], people = [2,3,7,11]
>
> **Output:** [1,2,2,2]
>
> **Explanation: **The figure above shows the times when the flowers are in full bloom and when the people arrive.
>
> For each person, we return the number of flowers in full bloom during their arrival.

**Example 2:**
>
> **Input:** flowers = [[1,10],[3,3]], people = [3,3,2]
>
> **Output:** [2,2,1]
>
> **Explanation:** The figure above shows the times when the flowers are in full bloom and when the people arrive.
>
> For each person, we return the number of flowers in full bloom during their arrival.


**Constraints:**

- <code>1 &lt;= flowers.length &lt;= 5 * 10<sup>4</sup></code>

- <code>flowers[i].length == 2</code>

- <code>1 &lt;= start<sub>i</sub> &lt;= end<sub>i</sub> &lt;= 10<sup>9</sup></code>

- <code>1 &lt;= people.length &lt;= 5 * 10<sup>4</sup></code>

- <code>1 &lt;= people[i] &lt;= 10<sup>9</sup></code>
