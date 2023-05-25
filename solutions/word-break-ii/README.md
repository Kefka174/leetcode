# Word Break II

Given a string <code>s</code> and a dictionary of strings <code>wordDict</code>, add spaces in <code>s</code> to construct a sentence where each word is a valid dictionary word. Return all such possible sentences in **any order**.

**Note** that the same word in the dictionary may be reused multiple times in the segmentation.


**Example 1:**
>
> **Input:** s = "catsanddog", wordDict = ["cat","cats","and","sand","dog"]
>
> **Output:** ["cats and dog","cat sand dog"]

**Example 2:**
>
> **Input:** s = "pineapplepenapple", wordDict = ["apple","pen","applepen","pine","pineapple"]
>
> **Output:** ["pine apple pen apple","pineapple pen apple","pine applepen apple"]
>
> **Explanation:** Note that you are allowed to reuse a dictionary word.

**Example 3:**
>
> **Input:** s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
>
> **Output:** []


**Constraints:**

- <code>1 &lt;= s.length &lt;= 20</code>

- <code>1 &lt;= wordDict.length &lt;= 1000</code>

- <code>1 &lt;= wordDict[i].length &lt;= 10</code>

- <code>s</code> and <code>wordDict[i]</code> consist of only lowercase English letters.

- All the strings of <code>wordDict</code> are **unique**.

- Input is generated in a way that the length of the answer doesn't exceed&nbsp;10<sup>5</sup>.
