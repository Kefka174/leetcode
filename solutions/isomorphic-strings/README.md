# Isomorphic Strings

Given two strings <code>s</code> and <code>t</code>, *determine if they are isomorphic*.

Two strings <code>s</code> and <code>t</code> are isomorphic if the characters in <code>s</code> can be replaced to get <code>t</code>.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.


**Example 1:**
>
> **Input:** s = "egg", t = "add"
>
> **Output:** true

**Example 2:**
>
> **Input:** s = "foo", t = "bar"
>
> **Output:** false

**Example 3:**
>
> **Input:** s = "paper", t = "title"
>
> **Output:** true


**Constraints:**

- <code>1 &lt;= s.length &lt;= 5 * 10<sup>4</sup></code>

- <code>t.length == s.length</code>

- <code>s</code> and <code>t</code> consist of any valid ascii character.
