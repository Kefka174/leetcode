# Task Scheduler

Given a characters array <code>tasks</code>, representing the tasks a CPU needs to do, where each letter represents a different task. Tasks could be done in any order. Each task is done in one unit of time. For each unit of time, the CPU could complete either one task or just be idle.

However, there is a non-negative integer&nbsp;<code>n</code> that represents the cooldown period between&nbsp;two <b>same tasks</b>&nbsp;(the same letter in the array), that is that there must be at least <code>n</code> units of time between any two same tasks.

Return *the least number of units of times that the CPU will take to finish all the given tasks*.


**Example 1:**
>
> **Input:** tasks = ["A","A","A","B","B","B"], n = 2
>
> **Output:** 8
>
> **Explanation:**
>
> A -&gt; B -&gt; idle -&gt; A -&gt; B -&gt; idle -&gt; A -&gt; B
>
> There is at least 2 units of time between any two same tasks.

**Example 2:**
>
> **Input:** tasks = ["A","A","A","B","B","B"], n = 0
>
> **Output:** 6
>
> **Explanation:** On this case any permutation of size 6 would work since n = 0.
>
> ["A","A","A","B","B","B"]
>
> ["A","B","A","B","A","B"]
>
> ["B","B","B","A","A","A"]
>
> ...
>
> And so on.

**Example 3:**
>
> **Input:** tasks = ["A","A","A","A","A","A","B","C","D","E","F","G"], n = 2
>
> **Output:** 16
>
> **Explanation:**
>
> One possible solution is
>
> A -&gt; B -&gt; C -&gt; A -&gt; D -&gt; E -&gt; A -&gt; F -&gt; G -&gt; A -&gt; idle -&gt; idle -&gt; A -&gt; idle -&gt; idle -&gt; A


**Constraints:**

- <code>1 &lt;= task.length &lt;= 10<sup>4</sup></code>

- <code>tasks[i]</code> is upper-case English letter.

- The integer <code>n</code> is in the range <code>[0, 100]</code>.
