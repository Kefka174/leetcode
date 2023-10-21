# Decoded String at Index

You are given an encoded string <code>s</code>. To decode the string to a tape, the encoded string is read one character at a time and the following steps are taken:

- If the character read is a letter, that letter is written onto the tape.

- If the character read is a digit <code>d</code>, the entire current tape is repeatedly written <code>d - 1</code> more times in total.

Given an integer <code>k</code>, return *the *<code>k<sup>th</sup></code>* letter (**1-indexed)** in the decoded string*.


**Example 1:**
>
> **Input:** s = "leet2code3", k = 10
>
> **Output:** "o"
>
> **Explanation:** The decoded string is "leetleetcodeleetleetcodeleetleetcode".
>
> The 10<sup>th</sup> letter in the string is "o".

**Example 2:**
>
> **Input:** s = "ha22", k = 5
>
> **Output:** "h"
>
> **Explanation:** The decoded string is "hahahaha".
>
> The 5<sup>th</sup> letter is "h".

**Example 3:**
>
> **Input:** s = "a2345678999999999999999", k = 1
>
> **Output:** "a"
>
> **Explanation:** The decoded string is "a" repeated 8301530446056247680 times.
>
> The 1<sup>st</sup> letter is "a".


**Constraints:**

- <code>2 &lt;= s.length &lt;= 100</code>

- <code>s</code> consists of lowercase English letters and digits <code>2</code> through <code>9</code>.

- <code>s</code> starts with a letter.

- <code>1 &lt;= k &lt;= 10<sup>9</sup></code>

- It is guaranteed that <code>k</code> is less than or equal to the length of the decoded string.

- The decoded string is guaranteed to have less than <code>2<sup>63</sup></code> letters.
