# Minimum Deletions to Make Character Frequencies Unique

A string <code>s</code> is called **good** if there are no two different characters in <code>s</code> that have the same **frequency**.

Given a string <code>s</code>, return* the **minimum** number of characters you need to delete to make *<code>s</code>* **good**.*

The **frequency** of a character in a string is the number of times it appears in the string. For example, in the string <code>"aab"</code>, the **frequency** of <code>'a'</code> is <code>2</code>, while the **frequency** of <code>'b'</code> is <code>1</code>.


**Example 1:**
>
> **Input:** s = "aab"
>
> **Output:** 0
>
> **Explanation:** <code>s</code> is already good.

**Example 2:**
>
> **Input:** s = "aaabbbcc"
>
> **Output:** 2
>
> **Explanation:** You can delete two 'b's resulting in the good string "aaabcc".
>
> Another way it to delete one 'b' and one 'c' resulting in the good string "aaabbc".

**Example 3:**
>
> **Input:** s = "ceabaacb"
>
> **Output:** 2
>
> **Explanation:** You can delete both 'c's resulting in the good string "eabaab".
>
> Note that we only care about characters that are still in the string at the end (i.e. frequency of 0 is ignored).


**Constraints:**

- <code>1 &lt;= s.length &lt;= 10<sup>5</sup></code>

- <code>s</code>&nbsp;contains only lowercase English letters.
