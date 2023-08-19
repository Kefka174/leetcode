# Merge Strings Alternately

You are given two strings <code>word1</code> and <code>word2</code>. Merge the strings by adding letters in alternating order, starting with <code>word1</code>. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return *the merged string.*


**Example 1:**
>
> **Input:** word1 = "abc", word2 = "pqr"
>
> **Output:** "apbqcr"
>
> **Explanation:**&nbsp;The merged string will be merged as so:
>
> word1:  a   b   c
>
> word2:    p   q   r
>
> merged: a p b q c r

**Example 2:**
>
> **Input:** word1 = "ab", word2 = "pqrs"
>
> **Output:** "apbqrs"
>
> **Explanation:**&nbsp;Notice that as word2 is longer, "rs" is appended to the end.
>
> word1:  a   b
>
> word2:    p   q   r   s
>
> merged: a p b q   r   s

**Example 3:**
>
> **Input:** word1 = "abcd", word2 = "pq"
>
> **Output:** "apbqcd"
>
> **Explanation:**&nbsp;Notice that as word1 is longer, "cd" is appended to the end.
>
> word1:  a   b   c   d
>
> word2:    p   q
>
> merged: a p b q c   d


**Constraints:**

- <code>1 &lt;= word1.length, word2.length &lt;= 100</code>

- <code>word1</code> and <code>word2</code> consist of lowercase English letters.
