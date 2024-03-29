# Text Justification

Given an array of strings <code>words</code> and a width <code>maxWidth</code>, format the text such that each line has exactly <code>maxWidth</code> characters and is fully (left and right) justified.

You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces <code>' '</code> when necessary so that each line has exactly <code>maxWidth</code> characters.

Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line does not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.

For the last line of text, it should be left-justified, and no extra space is inserted between words.

**Note:**

- A word is defined as a character sequence consisting of non-space characters only.

- Each word's length is guaranteed to be greater than <code>0</code> and not exceed <code>maxWidth</code>.

- The input array <code>words</code> contains at least one word.


**Example 1:**
>
> **Input:** words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
>
> **Output:**
>
> [
>
> &nbsp; &nbsp;"This &nbsp; &nbsp;is &nbsp; &nbsp;an",
>
> &nbsp; &nbsp;"example &nbsp;of text",
>
> &nbsp; &nbsp;"justification. &nbsp;"
>
> ]

**Example 2:**
>
> **Input:** words = ["What","must","be","acknowledgment","shall","be"], maxWidth = 16
>
> **Output:**
>
> [
>
> &nbsp; "What &nbsp; must &nbsp; be",
>
> &nbsp; "acknowledgment &nbsp;",
>
> &nbsp; "shall be &nbsp; &nbsp; &nbsp; &nbsp;"
>
> ]
>
> **Explanation:** Note that the last line is "shall be    " instead of "shall     be", because the last line must be left-justified instead of fully-justified.
>
> Note that the second line is also left-justified because it contains only one word.

**Example 3:**
>
> **Input:** words = ["Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"], maxWidth = 20
>
> **Output:**
>
> [
>
> &nbsp; "Science &nbsp;is &nbsp;what we",
>
> "understand &nbsp; &nbsp; &nbsp;well",
>
> &nbsp; "enough to explain to",
>
> &nbsp; "a &nbsp;computer. &nbsp;Art is",
>
> &nbsp; "everything &nbsp;else &nbsp;we",
>
> &nbsp; "do &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
>
> ]


**Constraints:**

- <code>1 &lt;= words.length &lt;= 300</code>

- <code>1 &lt;= words[i].length &lt;= 20</code>

- <code>words[i]</code> consists of only English letters and symbols.

- <code>1 &lt;= maxWidth &lt;= 100</code>

- <code>words[i].length &lt;= maxWidth</code>
