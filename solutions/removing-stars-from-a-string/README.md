# Removing Stars From a String

You are given a string <code>s</code>, which contains stars <code>*</code>.

In one operation, you can:

- Choose a star in <code>s</code>.

- Remove the closest **non-star** character to its **left**, as well as remove the star itself.

Return *the string after **all** stars have been removed*.

**Note:**

- The input will be generated such that the operation is always possible.

- It can be shown that the resulting string will always be unique.


**Example 1:**
>
> **Input:** s = "leet**cod*e"
>
> **Output:** "lecoe"
>
> **Explanation:** Performing the removals from left to right:
>
> - The closest character to the 1<sup>st</sup> star is 't' in "lee**<u>t</u>****cod*e". s becomes "lee*cod*e".
>
> - The closest character to the 2<sup>nd</sup> star is 'e' in "le**<u>e</u>***cod*e". s becomes "lecod*e".
>
> - The closest character to the 3<sup>rd</sup> star is 'd' in "leco**<u>d</u>***e". s becomes "lecoe".
>
> There are no more stars, so we return "lecoe".

**Example 2:**
>
> **Input:** s = "erase*****"
>
> **Output:** ""
>
> **Explanation:** The entire string is removed, so we return an empty string.


**Constraints:**

- <code>1 &lt;= s.length &lt;= 10<sup>5</sup></code>

- <code>s</code> consists of lowercase English letters and stars <code>*</code>.

- The operation above can be performed on <code>s</code>.
