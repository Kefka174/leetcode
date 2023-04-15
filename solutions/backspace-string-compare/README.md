# Backspace String Compare

Given two strings <code>s</code> and <code>t</code>, return <code>true</code> *if they are equal when both are typed into empty text editors*. <code>'#'</code> means a backspace character.

Note that after backspacing an empty text, the text will continue empty.


**Example 1:**
>
> **Input:** s = "ab#c", t = "ad#c"
>
> **Output:** true
>
> **Explanation:** Both s and t become "ac".

**Example 2:**
>
> **Input:** s = "ab##", t = "c#d#"
>
> **Output:** true
>
> **Explanation:** Both s and t become "".

**Example 3:**
>
> **Input:** s = "a#c", t = "b"
>
> **Output:** false
>
> **Explanation:** s becomes "c" while t becomes "b".


**Constraints:**

- <code><span>1 &lt;= s.length, t.length &lt;= 200</span></code>

- <span><code>s</code> and <code>t</code> only contain lowercase letters and <code>'#'</code> characters.</span>


**Follow up:** Can you solve it in <code>O(n)</code> time and <code>O(1)</code> space?
