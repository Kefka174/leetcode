# Maximum Number of Vowels in a Substring of Given Length

Given a string <code>s</code> and an integer <code>k</code>, return *the maximum number of vowel letters in any substring of *<code>s</code>* with length *<code>k</code>.

**Vowel letters** in English are <code>'a'</code>, <code>'e'</code>, <code>'i'</code>, <code>'o'</code>, and <code>'u'</code>.


**Example 1:**
>
> **Input:** s = "abciiidef", k = 3
>
> **Output:** 3
>
> **Explanation:** The substring "iii" contains 3 vowel letters.

**Example 2:**
>
> **Input:** s = "aeiou", k = 2
>
> **Output:** 2
>
> **Explanation:** Any substring of length 2 contains 2 vowels.

**Example 3:**
>
> **Input:** s = "leetcode", k = 3
>
> **Output:** 2
>
> **Explanation:** "lee", "eet" and "ode" contain 2 vowels.


**Constraints:**

- <code>1 &lt;= s.length &lt;= 10<sup>5</sup></code>

- <code>s</code> consists of lowercase English letters.

- <code>1 &lt;= k &lt;= s.length</code>
