# Daily Temperatures

Given an array of integers <code>temperatures</code> represents the daily temperatures, return *an array* <code>answer</code> *such that* <code>answer[i]</code> *is the number of days you have to wait after the* <code>i<sup>th</sup></code> *day to get a warmer temperature*. If there is no future day for which this is possible, keep <code>answer[i] == 0</code> instead.


**Example 1:**
>
> **Input:** temperatures = [73,74,75,71,69,72,76,73]
>
> **Output:** [1,1,4,2,1,1,0,0]

**Example 2:**
>
> **Input:** temperatures = [30,40,50,60]
>
> **Output:** [1,1,1,0]

**Example 3:**
>
> **Input:** temperatures = [30,60,90]
>
> **Output:** [1,1,0]


**Constraints:**

- <code>1 &lt;=&nbsp;temperatures.length &lt;= 10<sup>5</sup></code>

- <code>30 &lt;=&nbsp;temperatures[i] &lt;= 100</code>
