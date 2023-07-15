# Decode Ways II

A message containing letters from <code>A-Z</code> can be **encoded** into numbers using the following mapping:
>
> 'A' -&gt; "1"
>
> 'B' -&gt; "2"
>
> ...
>
> 'Z' -&gt; "26"

To **decode** an encoded message, all the digits must be grouped then mapped back into letters using the reverse of the mapping above (there may be multiple ways). For example, <code>"11106"</code> can be mapped into:

- <code>"AAJF"</code> with the grouping <code>(1 1 10 6)</code>

- <code>"KJF"</code> with the grouping <code>(11 10 6)</code>

Note that the grouping <code>(1 11 06)</code> is invalid because <code>"06"</code> cannot be mapped into <code>'F'</code> since <code>"6"</code> is different from <code>"06"</code>.

**In addition** to the mapping above, an encoded message may contain the <code>'*'</code> character, which can represent any digit from <code>'1'</code> to <code>'9'</code> (<code>'0'</code> is excluded). For example, the encoded message <code>"1*"</code> may represent any of the encoded messages <code>"11"</code>, <code>"12"</code>, <code>"13"</code>, <code>"14"</code>, <code>"15"</code>, <code>"16"</code>, <code>"17"</code>, <code>"18"</code>, or <code>"19"</code>. Decoding <code>"1*"</code> is equivalent to decoding **any** of the encoded messages it can represent.

Given a string <code>s</code> consisting of digits and <code>'*'</code> characters, return *the **number** of ways to **decode** it*.

Since the answer may be very large, return it **modulo** <code>10<sup>9</sup> + 7</code>.


**Example 1:**
>
> **Input:** s = "*"
>
> **Output:** 9
>
> **Explanation:** The encoded message can represent any of the encoded messages "1", "2", "3", "4", "5", "6", "7", "8", or "9".
>
> Each of these can be decoded to the strings "A", "B", "C", "D", "E", "F", "G", "H", and "I" respectively.
>
> Hence, there are a total of 9 ways to decode "*".

**Example 2:**
>
> **Input:** s = "1*"
>
> **Output:** 18
>
> **Explanation:** The encoded message can represent any of the encoded messages "11", "12", "13", "14", "15", "16", "17", "18", or "19".
>
> Each of these encoded messages have 2 ways to be decoded (e.g. "11" can be decoded to "AA" or "K").
>
> Hence, there are a total of 9 * 2 = 18 ways to decode "1*".

**Example 3:**
>
> **Input:** s = "2*"
>
> **Output:** 15
>
> **Explanation:** The encoded message can represent any of the encoded messages "21", "22", "23", "24", "25", "26", "27", "28", or "29".
>
> "21", "22", "23", "24", "25", and "26" have 2 ways of being decoded, but "27", "28", and "29" only have 1 way.
>
> Hence, there are a total of (6 * 2) + (3 * 1) = 12 + 3 = 15 ways to decode "2*".


**Constraints:**

- <code>1 &lt;= s.length &lt;= 10<sup>5</sup></code>

- <code>s[i]</code> is a digit or <code>'*'</code>.
