# Search Suggestions System

You are given an array of strings <code>products</code> and a string <code>searchWord</code>.

Design a system that suggests at most three product names from <code>products</code> after each character of <code>searchWord</code> is typed. Suggested products should have common prefix with <code>searchWord</code>. If there are more than three products with a common prefix return the three lexicographically minimums products.

Return *a list of lists of the suggested products after each character of *<code>searchWord</code>* is typed*.


**Example 1:**
>
> **Input:** products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse"
>
> **Output:** [["mobile","moneypot","monitor"],["mobile","moneypot","monitor"],["mouse","mousepad"],["mouse","mousepad"],["mouse","mousepad"]]
>
> **Explanation:** products sorted lexicographically = ["mobile","moneypot","monitor","mouse","mousepad"].
>
> After typing m and mo all products match and we show user ["mobile","moneypot","monitor"].
>
> After typing mou, mous and mouse the system suggests ["mouse","mousepad"].

**Example 2:**
>
> **Input:** products = ["havana"], searchWord = "havana"
>
> **Output:** [["havana"],["havana"],["havana"],["havana"],["havana"],["havana"]]
>
> **Explanation:** The only word "havana" will be always suggested while typing the search word.


**Constraints:**

- <code>1 &lt;= products.length &lt;= 1000</code>

- <code>1 &lt;= products[i].length &lt;= 3000</code>

- <code>1 &lt;= sum(products[i].length) &lt;= 2 * 10<sup>4</sup></code>

- All the strings of <code>products</code> are **unique**.

- <code>products[i]</code> consists of lowercase English letters.

- <code>1 &lt;= searchWord.length &lt;= 1000</code>

- <code>searchWord</code> consists of lowercase English letters.
