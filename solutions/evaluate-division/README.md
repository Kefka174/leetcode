# Evaluate Division

You are given an array of variable pairs <code>equations</code> and an array of real numbers <code>values</code>, where <code>equations[i] = [A<sub>i</sub>, B<sub>i</sub>]</code> and <code>values[i]</code> represent the equation <code>A<sub>i</sub> / B<sub>i</sub> = values[i]</code>. Each <code>A<sub>i</sub></code> or <code>B<sub>i</sub></code> is a string that represents a single variable.

You are also given some <code>queries</code>, where <code>queries[j] = [C<sub>j</sub>, D<sub>j</sub>]</code> represents the <code>j<sup>th</sup></code> query where you must find the answer for <code>C<sub>j</sub> / D<sub>j</sub> = ?</code>.

Return *the answers to all queries*. If a single answer cannot be determined, return <code>-1.0</code>.

**Note:** The input is always valid. You may assume that evaluating the queries will not result in division by zero and that there is no contradiction.

**Note:&nbsp;**The variables that do not occur in the list of equations are undefined, so the answer cannot be determined for them.


**Example 1:**
>
> **Input:** equations = [["a","b"],["b","c"]], values = [2.0,3.0], queries = [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]
>
> **Output:** [6.00000,0.50000,-1.00000,1.00000,-1.00000]
>
> **Explanation:**
>
> Given: *a / b = 2.0*, *b / c = 3.0*
>
> queries are: *a / c = ?*, *b / a = ?*, *a / e = ?*, *a / a = ?*, *x / x = ? *
>
> return: [6.0, 0.5, -1.0, 1.0, -1.0 ]
>
> note: x is undefined =&gt; -1.0

**Example 2:**
>
> **Input:** equations = [["a","b"],["b","c"],["bc","cd"]], values = [1.5,2.5,5.0], queries = [["a","c"],["c","b"],["bc","cd"],["cd","bc"]]
>
> **Output:** [3.75000,0.40000,5.00000,0.20000]

**Example 3:**
>
> **Input:** equations = [["a","b"]], values = [0.5], queries = [["a","b"],["b","a"],["a","c"],["x","y"]]
>
> **Output:** [0.50000,2.00000,-1.00000,-1.00000]


**Constraints:**

- <code>1 &lt;= equations.length &lt;= 20</code>

- <code>equations[i].length == 2</code>

- <code>1 &lt;= A<sub>i</sub>.length, B<sub>i</sub>.length &lt;= 5</code>

- <code>values.length == equations.length</code>

- <code>0.0 &lt; values[i] &lt;= 20.0</code>

- <code>1 &lt;= queries.length &lt;= 20</code>

- <code>queries[i].length == 2</code>

- <code>1 &lt;= C<sub>j</sub>.length, D<sub>j</sub>.length &lt;= 5</code>

- <code>A<sub>i</sub>, B<sub>i</sub>, C<sub>j</sub>, D<sub>j</sub></code> consist of lower case English letters and digits.
