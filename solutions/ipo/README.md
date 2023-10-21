# IPO

Suppose LeetCode will start its **IPO** soon. In order to sell a good price of its shares to Venture Capital, LeetCode would like to work on some projects to increase its capital before the **IPO**. Since it has limited resources, it can only finish at most <code>k</code> distinct projects before the **IPO**. Help LeetCode design the best way to maximize its total capital after finishing at most <code>k</code> distinct projects.

You are given <code>n</code> projects where the <code>i<sup>th</sup></code> project has a pure profit <code>profits[i]</code> and a minimum capital of <code>capital[i]</code> is needed to start it.

Initially, you have <code>w</code> capital. When you finish a project, you will obtain its pure profit and the profit will be added to your total capital.

Pick a list of **at most** <code>k</code> distinct projects from given projects to **maximize your final capital**, and return *the final maximized capital*.

The answer is guaranteed to fit in a 32-bit signed integer.


**Example 1:**
>
> **Input:** k = 2, w = 0, profits = [1,2,3], capital = [0,1,1]
>
> **Output:** 4
>
> **Explanation:** Since your initial capital is 0, you can only start the project indexed 0.
>
> After finishing it you will obtain profit 1 and your capital becomes 1.
>
> With capital 1, you can either start the project indexed 1 or the project indexed 2.
>
> Since you can choose at most 2 projects, you need to finish the project indexed 2 to get the maximum capital.
>
> Therefore, output the final maximized capital, which is 0 + 1 + 3 = 4.

**Example 2:**
>
> **Input:** k = 3, w = 0, profits = [1,2,3], capital = [0,1,2]
>
> **Output:** 6


**Constraints:**

- <code>1 &lt;= k &lt;= 10<sup>5</sup></code>

- <code>0 &lt;= w &lt;= 10<sup>9</sup></code>

- <code>n == profits.length</code>

- <code>n == capital.length</code>

- <code>1 &lt;= n &lt;= 10<sup>5</sup></code>

- <code>0 &lt;= profits[i] &lt;= 10<sup>4</sup></code>

- <code>0 &lt;= capital[i] &lt;= 10<sup>9</sup></code>
