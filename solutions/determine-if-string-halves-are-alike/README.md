# Determine if String Halves Are Alike

You are given a string <code>s</code> of even length. Split this string into two halves of equal lengths, and let <code>a</code> be the first half and <code>b</code> be the second half.

Two strings are **alike** if they have the same number of vowels (<code>'a'</code>, <code>'e'</code>, <code>'i'</code>, <code>'o'</code>, <code>'u'</code>, <code>'A'</code>, <code>'E'</code>, <code>'I'</code>, <code>'O'</code>, <code>'U'</code>). Notice that <code>s</code> contains uppercase and lowercase letters.

Return <code>true</code>* if *<code>a</code>* and *<code>b</code>* are **alike***. Otherwise, return <code>false</code>.


**Example 1:**
>
> **Input:** s = "book"
>
> **Output:** true
>
> **Explanation:** a = "b<u>o</u>" and b = "<u>o</u>k". a has 1 vowel and b has 1 vowel. Therefore, they are alike.

**Example 2:**
>
> **Input:** s = "textbook"
>
> **Output:** false
>
> **Explanation:** a = "t<u>e</u>xt" and b = "b<u>oo</u>k". a has 1 vowel whereas b has 2. Therefore, they are not alike.
>
> Notice that the vowel o is counted twice.


**Constraints:**

- <code>2 &lt;= s.length &lt;= 1000</code>

- <code>s.length</code> is even.

- <code>s</code> consists of **uppercase and lowercase** letters.
