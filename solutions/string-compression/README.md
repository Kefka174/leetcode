# String Compression

Given an array of characters <code>chars</code>, compress it using the following algorithm:

Begin with an empty string <code>s</code>. For each group of **consecutive repeating characters** in <code>chars</code>:

- If the group's length is <code>1</code>, append the character to <code>s</code>.

- Otherwise, append the character followed by the group's length.

The compressed string <code>s</code> **should not be returned separately**, but instead, be stored **in the input character array <code>chars</code>**. Note that group lengths that are <code>10</code> or longer will be split into multiple characters in <code>chars</code>.

After you are done **modifying the input array,** return *the new length of the array*.

You must write an algorithm that uses only constant extra space.


**Example 1:**
>
> **Input:** chars = ["a","a","b","b","c","c","c"]
>
> **Output:** Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
>
> **Explanation:** The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

**Example 2:**
>
> **Input:** chars = ["a"]
>
> **Output:** Return 1, and the first character of the input array should be: ["a"]
>
> **Explanation:** The only group is "a", which remains uncompressed since it's a single character.

**Example 3:**
>
> **Input:** chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
>
> **Output:** Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
>
> **Explanation:** The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".


**Constraints:**

- <code>1 &lt;= chars.length &lt;= 2000</code>

- <code>chars[i]</code> is a lowercase English letter, uppercase English letter, digit, or symbol.
