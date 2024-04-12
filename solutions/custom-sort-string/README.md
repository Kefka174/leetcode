# Custom Sort String

You are given two strings <code>order</code> and <code>s</code>. All the characters of <code>order</code> are **unique** and were sorted in some custom order previously.

Permute the characters of <code>s</code> so that they match the order that <code>order</code> was sorted. More specifically, if a character <code>x</code> occurs before a character <code>y</code> in <code>order</code>, then <code>x</code> should occur before <code>y</code> in the permuted string.

Return *any permutation of *<code>s</code>* that satisfies this property*.


**Example 1:**

**Input: ** <span class="example-io" style="font-family: Menlo,sans-serif; font-size: 0.85rem;"> order = "cba", s = "abcd" </span>

**Output: ** <span class="example-io" style="font-family: Menlo,sans-serif; font-size: 0.85rem;"> "cbad" </span>

**Explanation: ** <code>"a"</code>, <code>"b"</code>, <code>"c"</code> appear in order, so the order of <code>"a"</code>, <code>"b"</code>, <code>"c"</code> should be <code>"c"</code>, <code>"b"</code>, and <code>"a"</code>.

Since <code>"d"</code> does not appear in <code>order</code>, it can be at any position in the returned string. <code>"dcba"</code>, <code>"cdba"</code>, <code>"cbda"</code> are also valid outputs.

**Example 2:**

**Input: ** <span class="example-io" style="font-family: Menlo,sans-serif; font-size: 0.85rem;"> order = "bcafg", s = "abcd" </span>

**Output: ** <span class="example-io" style="font-family: Menlo,sans-serif; font-size: 0.85rem;"> "bcad" </span>

**Explanation: ** The characters <code>"b"</code>, <code>"c"</code>, and <code>"a"</code> from <code>order</code> dictate the order for the characters in <code>s</code>. The character <code>"d"</code> in <code>s</code> does not appear in <code>order</code>, so its position is flexible.

Following the order of appearance in <code>order</code>, <code>"b"</code>, <code>"c"</code>, and <code>"a"</code> from <code>s</code> should be arranged as <code>"b"</code>, <code>"c"</code>, <code>"a"</code>. <code>"d"</code> can be placed at any position since it's not in order. The output <code>"bcad"</code> correctly follows this rule. Other arrangements like <code>"bacd"</code> or <code>"bcda"</code> would also be valid, as long as <code>"b"</code>, <code>"c"</code>, <code>"a"</code> maintain their order.


**Constraints:**

- <code>1 &lt;= order.length &lt;= 26</code>

- <code>1 &lt;= s.length &lt;= 200</code>

- <code>order</code> and <code>s</code> consist of lowercase English letters.

- All the characters of <code>order</code> are **unique**.
