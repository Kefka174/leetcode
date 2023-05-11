# Basic Calculator II

Given a string <code>s</code> which represents an expression, *evaluate this expression and return its value*.&nbsp;

The integer division should truncate toward zero.

You may assume that the given expression is always valid. All intermediate results will be in the range of <code>[-2<sup>31</sup>, 2<sup>31</sup> - 1]</code>.

**Note:** You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as <code>eval()</code>.


**Example 1:**
>
> **Input:** s = "3+2*2"
>
> **Output:** 7

**Example 2:**
>
> **Input:** s = " 3/2 "
>
> **Output:** 1

**Example 3:**
>
> **Input:** s = " 3+5 / 2 "
>
> **Output:** 5


**Constraints:**

- <code>1 &lt;= s.length &lt;= 3 * 10<sup>5</sup></code>

- <code>s</code> consists of integers and operators <code>('+', '-', '*', '/')</code> separated by some number of spaces.

- <code>s</code> represents **a valid expression**.

- All the integers in the expression are non-negative integers in the range <code>[0, 2<sup>31</sup> - 1]</code>.

- The answer is **guaranteed** to fit in a **32-bit integer**.
