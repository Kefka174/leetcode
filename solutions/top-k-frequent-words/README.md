# Top K Frequent Words

Given an array of strings <code>words</code> and an integer <code>k</code>, return *the *<code>k</code>* most frequent strings*.

Return the answer **sorted** by **the frequency** from highest to lowest. Sort the words with the same frequency by their **lexicographical order**.


**Example 1:**
>
> **Input:** words = ["i","love","leetcode","i","love","coding"], k = 2
>
> **Output:** ["i","love"]
>
> **Explanation:** "i" and "love" are the two most frequent words.
>
> Note that "i" comes before "love" due to a lower alphabetical order.

**Example 2:**
>
> **Input:** words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
>
> **Output:** ["the","is","sunny","day"]
>
> **Explanation:** "the", "is", "sunny" and "day" are the four most frequent words, with the number of occurrence being 4, 3, 2 and 1 respectively.


**Constraints:**

- <code>1 &lt;= words.length &lt;= 500</code>

- <code>1 &lt;= words[i].length &lt;= 10</code>

- <code>words[i]</code> consists of lowercase English letters.

- <code>k</code> is in the range <code>[1, The number of **unique** words[i]]</code>


**Follow-up:** Could you solve it in <code>O(n log(k))</code> time and <code>O(n)</code> extra space?
