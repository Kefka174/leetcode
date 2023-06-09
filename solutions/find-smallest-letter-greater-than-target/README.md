# Find Smallest Letter Greater Than Target

You are given an array of characters <code>letters</code> that is sorted in **non-decreasing order**, and a character <code>target</code>. There are **at least two different** characters in <code>letters</code>.

Return *the smallest character in *<code>letters</code>* that is lexicographically greater than *<code>target</code>. If such a character does not exist, return the first character in <code>letters</code>.


**Example 1:**
>
> **Input:** letters = ["c","f","j"], target = "a"
>
> **Output:** "c"
>
> **Explanation:** The smallest character that is lexicographically greater than 'a' in letters is 'c'.

**Example 2:**
>
> **Input:** letters = ["c","f","j"], target = "c"
>
> **Output:** "f"
>
> **Explanation:** The smallest character that is lexicographically greater than 'c' in letters is 'f'.

**Example 3:**
>
> **Input:** letters = ["x","x","y","y"], target = "z"
>
> **Output:** "x"
>
> **Explanation:** There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].


**Constraints:**

- <code>2 &lt;= letters.length &lt;= 10<sup>4</sup></code>

- <code>letters[i]</code> is a lowercase English letter.

- <code>letters</code> is sorted in **non-decreasing** order.

- <code>letters</code> contains at least two different characters.

- <code>target</code> is a lowercase English letter.
