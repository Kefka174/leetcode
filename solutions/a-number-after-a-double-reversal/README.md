# A Number After a Double Reversal

**Reversing** an integer means to reverse all its digits.

- For example, reversing <code>2021</code> gives <code>1202</code>. Reversing <code>12300</code> gives <code>321</code> as the **leading zeros are not retained**.

Given an integer <code>num</code>, **reverse** <code>num</code> to get <code>reversed1</code>, **then reverse** <code>reversed1</code> to get <code>reversed2</code>. Return <code>true</code> *if* <code>reversed2</code> *equals* <code>num</code>. Otherwise return <code>false</code>.


**Example 1:**
>
> **Input:** num = 526
>
> **Output:** true
>
> **Explanation:** Reverse num to get 625, then reverse 625 to get 526, which equals num.

**Example 2:**
>
> **Input:** num = 1800
>
> **Output:** false
>
> **Explanation:** Reverse num to get 81, then reverse 81 to get 18, which does not equal num.

**Example 3:**
>
> **Input:** num = 0
>
> **Output:** true
>
> **Explanation:** Reverse num to get 0, then reverse 0 to get 0, which equals num.


**Constraints:**

- <code>0 &lt;= num &lt;= 10<sup>6</sup></code>
