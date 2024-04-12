# Maximum Nesting Depth of the Parentheses

A string is a **valid parentheses string** (denoted **VPS**) if it meets one of the following:

- It is an empty string <code>""</code>, or a single character not equal to <code>"("</code> or <code>")"</code>,

- It can be written as <code>AB</code> (<code>A</code> concatenated with <code>B</code>), where <code>A</code> and <code>B</code> are **VPS**'s, or

- It can be written as <code>(A)</code>, where <code>A</code> is a **VPS**.

We can similarly define the **nesting depth** <code>depth(S)</code> of any VPS <code>S</code> as follows:

- <code>depth("") = 0</code>

- <code>depth(C) = 0</code>, where <code>C</code> is a string with a single character not equal to <code>"("</code> or <code>")"</code>.

- <code>depth(A + B) = max(depth(A), depth(B))</code>, where <code>A</code> and <code>B</code> are **VPS**'s.

- <code>depth("(" + A + ")") = 1 + depth(A)</code>, where <code>A</code> is a **VPS**.

For example, <code>""</code>, <code>"()()"</code>, and <code>"()(()())"</code> are **VPS**'s (with nesting depths 0, 1, and 2), and <code>")("</code> and <code>"(()"</code> are not **VPS**'s.

Given a **VPS** represented as string <code>s</code>, return *the **nesting depth** of *<code>s</code>.


**Example 1:**
>
> **Input:** s = "(1+(2*3)+((<u>8</u>)/4))+1"
>
> **Output:** 3
>
> **Explanation:** Digit 8 is inside of 3 nested parentheses in the string.

**Example 2:**
>
> **Input:** s = "(1)+((2))+(((<u>3</u>)))"
>
> **Output:** 3


**Constraints:**

- <code>1 &lt;= s.length &lt;= 100</code>

- <code>s</code> consists of digits <code>0-9</code> and characters <code>'+'</code>, <code>'-'</code>, <code>'*'</code>, <code>'/'</code>, <code>'('</code>, and <code>')'</code>.

- It is guaranteed that parentheses expression <code>s</code> is a **VPS**.
