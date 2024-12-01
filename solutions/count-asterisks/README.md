# Count Asterisks

You are given a string <code>s</code>, where every **two** consecutive vertical bars <code>'|'</code> are grouped into a **pair**. In other words, the 1<sup>st</sup> and 2<sup>nd</sup> <code>'|'</code> make a pair, the 3<sup>rd</sup> and 4<sup>th</sup> <code>'|'</code> make a pair, and so forth.

Return *the number of *<code>'*'</code>* in *<code>s</code>*, **excluding** the *<code>'*'</code>* between each pair of *<code>'|'</code>.

**Note** that each <code>'|'</code> will belong to **exactly** one pair.


**Example 1:**
>
> **Input:** s = "l|*e*et|c**o|*de|"
>
> **Output:** 2
>
> **Explanation:** The considered characters are underlined: "<u>l</u>|*e*et|<u>c**o</u>|*de|".
>
> The characters between the first and second '|' are excluded from the answer.
>
> Also, the characters between the third and fourth '|' are excluded from the answer.
>
> There are 2 asterisks considered. Therefore, we return 2.

**Example 2:**
>
> **Input:** s = "iamprogrammer"
>
> **Output:** 0
>
> **Explanation:** In this example, there are no asterisks in s. Therefore, we return 0.

**Example 3:**
>
> **Input:** s = "yo|uar|e**|b|e***au|tifu|l"
>
> **Output:** 5
>
> **Explanation:** The considered characters are underlined: "<u>yo</u>|uar|<u>e**</u>|b|<u>e***au</u>|tifu|<u>l</u>". There are 5 asterisks considered. Therefore, we return 5.


**Constraints:**

- <code>1 &lt;= s.length &lt;= 1000</code>

- <code>s</code> consists of lowercase English letters, vertical bars <code>'|'</code>, and asterisks <code>'*'</code>.

- <code>s</code> contains an **even** number of vertical bars <code>'|'</code>.
