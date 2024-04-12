# Make The String Great

Given a string <code>s</code> of lower and upper case English letters.

A good string is a string which doesn't have **two adjacent characters** <code>s[i]</code> and <code>s[i + 1]</code> where:

- <code>0 &lt;= i &lt;= s.length - 2</code>

- <code>s[i]</code> is a lower-case letter and <code>s[i + 1]</code> is the same letter but in upper-case or **vice-versa**.

To make the string good, you can choose **two adjacent** characters that make the string bad and remove them. You can keep doing this until the string becomes good.

Return *the string* after making it good. The answer is guaranteed to be unique under the given constraints.

**Notice** that an empty string is also good.


**Example 1:**
>
> **Input:** s = "leEeetcode"
>
> **Output:** "leetcode"
>
> **Explanation:** In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".

**Example 2:**
>
> **Input:** s = "abBAcC"
>
> **Output:** ""
>
> **Explanation:** We have many possible scenarios, and all lead to the same answer. For example:
>
> "abBAcC" --&gt; "aAcC" --&gt; "cC" --&gt; ""
>
> "abBAcC" --&gt; "abBA" --&gt; "aA" --&gt; ""

**Example 3:**
>
> **Input:** s = "s"
>
> **Output:** "s"


**Constraints:**

- <code>1 &lt;= s.length &lt;= 100</code>

- <code>s</code> contains only lower and upper case English letters.
