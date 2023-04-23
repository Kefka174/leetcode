# Longest Palindrome by Concatenating Two Letter Words

You are given an array of strings <code>words</code>. Each element of <code>words</code> consists of **two** lowercase English letters.

Create the **longest possible palindrome** by selecting some elements from <code>words</code> and concatenating them in **any order**. Each element can be selected **at most once**.

Return *the **length** of the longest palindrome that you can create*. If it is impossible to create any palindrome, return <code>0</code>.

A **palindrome** is a string that reads the same forward and backward.


**Example 1:**
>
> **Input:** words = ["lc","cl","gg"]
>
> **Output:** 6
>
> **Explanation:** One longest palindrome is "lc" + "gg" + "cl" = "lcggcl", of length 6.
>
> Note that "clgglc" is another longest palindrome that can be created.

**Example 2:**
>
> **Input:** words = ["ab","ty","yt","lc","cl","ab"]
>
> **Output:** 8
>
> **Explanation:** One longest palindrome is "ty" + "lc" + "cl" + "yt" = "tylcclyt", of length 8.
>
> Note that "lcyttycl" is another longest palindrome that can be created.

**Example 3:**
>
> **Input:** words = ["cc","ll","xx"]
>
> **Output:** 2
>
> **Explanation:** One longest palindrome is "cc", of length 2.
>
> Note that "ll" is another longest palindrome that can be created, and so is "xx".


**Constraints:**

- <code>1 &lt;= words.length &lt;= 10<sup>5</sup></code>

- <code>words[i].length == 2</code>

- <code>words[i]</code> consists of lowercase English letters.
