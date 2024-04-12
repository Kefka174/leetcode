# Maximum Odd Binary Number

You are given a **binary** string <code>s</code> that contains at least one <code>'1'</code>.

You have to **rearrange** the bits in such a way that the resulting binary number is the **maximum odd binary number** that can be created from this combination.

Return *a string representing the maximum odd binary number that can be created from the given combination.*

**Note **that the resulting string **can** have leading zeros.


**Example 1:**
>
> **Input:** s = "010"
>
> **Output:** "001"
>
> **Explanation:** Because there is just one '1', it must be in the last position. So the answer is "001".

**Example 2:**
>
> **Input:** s = "0101"
>
> **Output:** "1001"
>
> **Explanation: **One of the '1's must be in the last position. The maximum number that can be made with the remaining digits is "100". So the answer is "1001".


**Constraints:**

- <code>1 &lt;= s.length &lt;= 100</code>

- <code>s</code> consists only of <code>'0'</code> and <code>'1'</code>.

- <code>s</code> contains at least one <code>'1'</code>.
