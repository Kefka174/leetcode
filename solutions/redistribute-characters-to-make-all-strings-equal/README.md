# Redistribute Characters to Make All Strings Equal

You are given an array of strings <code>words</code> (**0-indexed**).

In one operation, pick two **distinct** indices <code>i</code> and <code>j</code>, where <code>words[i]</code> is a non-empty string, and move **any** character from <code>words[i]</code> to **any** position in <code>words[j]</code>.

Return <code>true</code> *if you can make** every** string in *<code>words</code>* **equal **using **any** number of operations*,* and *<code>false</code> *otherwise*.


**Example 1:**
>
> **Input:** words = ["abc","aabc","bc"]
>
> **Output:** true
>
> **Explanation:** Move the first 'a' in <code>words[1] to the front of words[2],
>
> to make </code><code>words[1]</code> = "abc" and words[2] = "abc".
>
> All the strings are now equal to "abc", so return <code>true</code>.

**Example 2:**
>
> **Input:** words = ["ab","a"]
>
> **Output:** false
>
> **Explanation:** It is impossible to make all the strings equal using the operation.


**Constraints:**

- <code>1 &lt;= words.length &lt;= 100</code>

- <code>1 &lt;= words[i].length &lt;= 100</code>

- <code>words[i]</code> consists of lowercase English letters.
