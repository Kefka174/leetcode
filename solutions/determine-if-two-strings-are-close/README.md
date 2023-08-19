# Determine if Two Strings Are Close

Two strings are considered **close** if you can attain one from the other using the following operations:

- Operation 1: Swap any two **existing** characters.

- <ul>

- <li>For example, <code>a<u>b</u>cd<u>e</u> -&gt; a<u>e</u>cd<u>b</u></code></li>

- </ul>

- 

- For example, <code>a<u>b</u>cd<u>e</u> -&gt; a<u>e</u>cd<u>b</u></code>

- Operation 2: Transform **every** occurrence of one **existing** character into another **existing** character, and do the same with the other character.

- <ul>

- <li>For example, <code><u>aa</u>c<u>abb</u> -&gt; <u>bb</u>c<u>baa</u></code> (all <code>a</code>'s turn into <code>b</code>'s, and all <code>b</code>'s turn into <code>a</code>'s)</li>

- </ul>

- 

- For example, <code><u>aa</u>c<u>abb</u> -&gt; <u>bb</u>c<u>baa</u></code> (all <code>a</code>'s turn into <code>b</code>'s, and all <code>b</code>'s turn into <code>a</code>'s)

You can use the operations on either string as many times as necessary.

Given two strings, <code>word1</code> and <code>word2</code>, return <code>true</code>* if *<code>word1</code>* and *<code>word2</code>* are **close**, and *<code>false</code>* otherwise.*


**Example 1:**
>
> **Input:** word1 = "abc", word2 = "bca"
>
> **Output:** true
>
> **Explanation:** You can attain word2 from word1 in 2 operations.
>
> Apply Operation 1: "a<u>bc</u>" -&gt; "a<u>cb</u>"
>
> Apply Operation 1: "<u>a</u>c<u>b</u>" -&gt; "<u>b</u>c<u>a</u>"

**Example 2:**
>
> **Input:** word1 = "a", word2 = "aa"
>
> **Output:** false
>
> **Explanation: **It is impossible to attain word2 from word1, or vice versa, in any number of operations.

**Example 3:**
>
> **Input:** word1 = "cabbba", word2 = "abbccc"
>
> **Output:** true
>
> **Explanation:** You can attain word2 from word1 in 3 operations.
>
> Apply Operation 1: "ca<u>b</u>bb<u>a</u>" -&gt; "ca<u>a</u>bb<u>b</u>"
>
> <code>Apply Operation 2: "</code><u>c</u>aa<u>bbb</u>" -&gt; "<u>b</u>aa<u>ccc</u>"
>
> Apply Operation 2: "<u>baa</u>ccc" -&gt; "<u>abb</u>ccc"


**Constraints:**

- <code>1 &lt;= word1.length, word2.length &lt;= 10<sup>5</sup></code>

- <code>word1</code> and <code>word2</code> contain only lowercase English letters.
