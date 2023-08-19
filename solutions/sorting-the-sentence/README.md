# Sorting the Sentence

A **sentence** is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

A sentence can be **shuffled** by appending the **1-indexed word position** to each word then rearranging the words in the sentence.

- For example, the sentence <code>"This is a sentence"</code> can be shuffled as <code>"sentence4 a3 is2 This1"</code> or <code>"is2 sentence4 This1 a3"</code>.

Given a **shuffled sentence** <code>s</code> containing no more than <code>9</code> words, reconstruct and return *the original sentence*.


**Example 1:**
>
> **Input:** s = "is2 sentence4 This1 a3"
>
> **Output:** "This is a sentence"
>
> **Explanation:** Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.

**Example 2:**
>
> **Input:** s = "Myself2 Me1 I4 and3"
>
> **Output:** "Me Myself and I"
>
> **Explanation:** Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.


**Constraints:**

- <code>2 &lt;= s.length &lt;= 200</code>

- <code>s</code> consists of lowercase and uppercase English letters, spaces, and digits from <code>1</code> to <code>9</code>.

- The number of words in <code>s</code> is between <code>1</code> and <code>9</code>.

- The words in <code>s</code> are separated by a single space.

- <code>s</code> contains no leading or trailing spaces.
