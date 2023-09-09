# Edit Distance

Given two strings <code>word1</code> and <code>word2</code>, return *the minimum number of operations required to convert <code>word1</code> to <code>word2</code>*.

You have the following three operations permitted on a word:

- Insert a character

- Delete a character

- Replace a character


**Example 1:**
>
> **Input:** word1 = "horse", word2 = "ros"
>
> **Output:** 3
>
> **Explanation:**
>
> horse -&gt; rorse (replace 'h' with 'r')
>
> rorse -&gt; rose (remove 'r')
>
> rose -&gt; ros (remove 'e')

**Example 2:**
>
> **Input:** word1 = "intention", word2 = "execution"
>
> **Output:** 5
>
> **Explanation:**
>
> intention -&gt; inention (remove 't')
>
> inention -&gt; enention (replace 'i' with 'e')
>
> enention -&gt; exention (replace 'n' with 'x')
>
> exention -&gt; exection (replace 'n' with 'c')
>
> exection -&gt; execution (insert 'u')


**Constraints:**

- <code>0 &lt;= word1.length, word2.length &lt;= 500</code>

- <code>word1</code> and <code>word2</code> consist of lowercase English letters.
