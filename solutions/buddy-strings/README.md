# Buddy Strings

Given two strings <code>s</code> and <code>goal</code>, return <code>true</code>* if you can swap two letters in *<code>s</code>* so the result is equal to *<code>goal</code>*, otherwise, return *<code>false</code>*.*

Swapping letters is defined as taking two indices <code>i</code> and <code>j</code> (0-indexed) such that <code>i != j</code> and swapping the characters at <code>s[i]</code> and <code>s[j]</code>.

- For example, swapping at indices <code>0</code> and <code>2</code> in <code>"abcd"</code> results in <code>"cbad"</code>.


**Example 1:**
>
> **Input:** s = "ab", goal = "ba"
>
> **Output:** true
>
> **Explanation:** You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.

**Example 2:**
>
> **Input:** s = "ab", goal = "ab"
>
> **Output:** false
>
> **Explanation:** The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.

**Example 3:**
>
> **Input:** s = "aa", goal = "aa"
>
> **Output:** true
>
> **Explanation:** You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.


**Constraints:**

- <code>1 &lt;= s.length, goal.length &lt;= 2 * 10<sup>4</sup></code>

- <code>s</code> and <code>goal</code> consist of lowercase letters.
