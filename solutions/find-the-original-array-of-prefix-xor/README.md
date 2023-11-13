# Find The Original Array of Prefix Xor

You are given an **integer** array <code>pref</code> of size <code>n</code>. Find and return *the array *<code>arr</code>* of size *<code>n</code>* that satisfies*:

- <code>pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i]</code>.

Note that <code>^</code> denotes the **bitwise-xor** operation.

It can be proven that the answer is **unique**.


**Example 1:**
>
> **Input:** pref = [5,2,0,3,1]
>
> **Output:** [5,7,2,3,2]
>
> **Explanation:** From the array [5,7,2,3,2] we have the following:
>
> - pref[0] = 5.
>
> - pref[1] = 5 ^ 7 = 2.
>
> - pref[2] = 5 ^ 7 ^ 2 = 0.
>
> - pref[3] = 5 ^ 7 ^ 2 ^ 3 = 3.
>
> - pref[4] = 5 ^ 7 ^ 2 ^ 3 ^ 2 = 1.

**Example 2:**
>
> **Input:** pref = [13]
>
> **Output:** [13]
>
> **Explanation:** We have pref[0] = arr[0] = 13.


**Constraints:**

- <code>1 &lt;= pref.length &lt;= 10<sup>5</sup></code>

- <code>0 &lt;= pref[i] &lt;= 10<sup>6</sup></code>
