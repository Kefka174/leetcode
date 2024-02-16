# Check If Two String Arrays are Equivalent

Given two string arrays <code>word1</code> and <code>word2</code>, return* *<code>true</code>* if the two arrays **represent** the same string, and *<code>false</code>* otherwise.*

A string is **represented** by an array if the array elements concatenated **in order** forms the string.


**Example 1:**
>
> **Input:** word1 = ["ab", "c"], word2 = ["a", "bc"]
>
> **Output:** true
>
> **Explanation:**
>
> word1 represents string "ab" + "c" -&gt; "abc"
>
> word2 represents string "a" + "bc" -&gt; "abc"
>
> The strings are the same, so return true.

**Example 2:**
>
> **Input:** word1 = ["a", "cb"], word2 = ["ab", "c"]
>
> **Output:** false

**Example 3:**
>
> **Input:** word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
>
> **Output:** true


**Constraints:**

- <code>1 &lt;= word1.length, word2.length &lt;= 10<sup>3</sup></code>

- <code>1 &lt;= word1[i].length, word2[i].length &lt;= 10<sup>3</sup></code>

- <code>1 &lt;= sum(word1[i].length), sum(word2[i].length) &lt;= 10<sup>3</sup></code>

- <code>word1[i]</code> and <code>word2[i]</code> consist of lowercase letters.
