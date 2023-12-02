# Word Pattern

Given a <code>pattern</code> and a string <code>s</code>, find if <code>s</code>&nbsp;follows the same pattern.

Here <b>follow</b> means a full match, such that there is a bijection between a letter in <code>pattern</code> and a <b>non-empty</b> word in <code>s</code>.


**Example 1:**
>
> **Input:** pattern = "abba", s = "dog cat cat dog"
>
> **Output:** true

**Example 2:**
>
> **Input:** pattern = "abba", s = "dog cat cat fish"
>
> **Output:** false

**Example 3:**
>
> **Input:** pattern = "aaaa", s = "dog cat cat dog"
>
> **Output:** false


**Constraints:**

- <code>1 &lt;= pattern.length &lt;= 300</code>

- <code>pattern</code> contains only lower-case English letters.

- <code>1 &lt;= s.length &lt;= 3000</code>

- <code>s</code> contains only lowercase English letters and spaces <code>' '</code>.

- <code>s</code> **does not contain** any leading or trailing spaces.

- All the words in <code>s</code> are separated by a **single space**.
