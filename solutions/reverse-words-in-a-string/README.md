# Reverse Words in a String

Given an input string <code>s</code>, reverse the order of the **words**.

A **word** is defined as a sequence of non-space characters. The **words** in <code>s</code> will be separated by at least one space.

Return *a string of the words in reverse order concatenated by a single space.*

<b>Note</b> that <code>s</code> may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.


**Example 1:**
>
> **Input:** s = "the sky is blue"
>
> **Output:** "blue is sky the"

**Example 2:**
>
> **Input:** s = "  hello world  "
>
> **Output:** "world hello"
>
> **Explanation:** Your reversed string should not contain leading or trailing spaces.

**Example 3:**
>
> **Input:** s = "a good   example"
>
> **Output:** "example good a"
>
> **Explanation:** You need to reduce multiple spaces between two words to a single space in the reversed string.


**Constraints:**

- <code>1 &lt;= s.length &lt;= 10<sup>4</sup></code>

- <code>s</code> contains English letters (upper-case and lower-case), digits, and spaces <code>' '</code>.

- There is **at least one** word in <code>s</code>.


<b data-stringify-type="bold">Follow-up:&nbsp;</b>If the string data type is mutable in your language, can&nbsp;you solve it&nbsp;<b data-stringify-type="bold">in-place</b>&nbsp;with&nbsp;<code data-stringify-type="code">O(1)</code>&nbsp;extra space?
