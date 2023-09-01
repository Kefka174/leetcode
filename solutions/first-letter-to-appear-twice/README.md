# First Letter to Appear Twice

Given a string <code>s</code> consisting of lowercase English letters, return *the first letter to appear **twice***.

**Note**:

- A letter <code>a</code> appears twice before another letter <code>b</code> if the **second** occurrence of <code>a</code> is before the **second** occurrence of <code>b</code>.

- <code>s</code> will contain at least one letter that appears twice.


**Example 1:**
>
> **Input:** s = "abccbaacz"
>
> **Output:** "c"
>
> **Explanation:**
>
> The letter 'a' appears on the indexes 0, 5 and 6.
>
> The letter 'b' appears on the indexes 1 and 4.
>
> The letter 'c' appears on the indexes 2, 3 and 7.
>
> The letter 'z' appears on the index 8.
>
> The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.

**Example 2:**
>
> **Input:** s = "abcdd"
>
> **Output:** "d"
>
> **Explanation:**
>
> The only letter that appears twice is 'd' so we return 'd'.


**Constraints:**

- <code>2 &lt;= s.length &lt;= 100</code>

- <code>s</code> consists of lowercase English letters.

- <code>s</code> has at least one repeated letter.
