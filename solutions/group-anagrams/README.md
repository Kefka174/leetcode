# Group Anagrams

Given an array of strings <code>strs</code>, group **the anagrams** together. You can return the answer in **any order**.

An **Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.


**Example 1:**
>
> **Input:** strs = ["eat","tea","tan","ate","nat","bat"]
>
> **Output:** [["bat"],["nat","tan"],["ate","eat","tea"]]

**Example 2:**
>
> **Input:** strs = [""]
>
> **Output:** [[""]]

**Example 3:**
>
> **Input:** strs = ["a"]
>
> **Output:** [["a"]]


**Constraints:**

- <code>1 &lt;= strs.length &lt;= 10<sup>4</sup></code>

- <code>0 &lt;= strs[i].length &lt;= 100</code>

- <code>strs[i]</code> consists of lowercase English letters.
