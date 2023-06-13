# Summary Ranges

You are given a **sorted unique** integer array <code>nums</code>.

A **range** <code>[a,b]</code> is the set of all integers from <code>a</code> to <code>b</code> (inclusive).

Return *the **smallest sorted** list of ranges that **cover all the numbers in the array exactly***. That is, each element of <code>nums</code> is covered by exactly one of the ranges, and there is no integer <code>x</code> such that <code>x</code> is in one of the ranges but not in <code>nums</code>.

Each range <code>[a,b]</code> in the list should be output as:

- <code>"a-&gt;b"</code> if <code>a != b</code>

- <code>"a"</code> if <code>a == b</code>


**Example 1:**
>
> **Input:** nums = [0,1,2,4,5,7]
>
> **Output:** ["0-&gt;2","4-&gt;5","7"]
>
> **Explanation:** The ranges are:
>
> [0,2] --&gt; "0-&gt;2"
>
> [4,5] --&gt; "4-&gt;5"
>
> [7,7] --&gt; "7"

**Example 2:**
>
> **Input:** nums = [0,2,3,4,6,8,9]
>
> **Output:** ["0","2-&gt;4","6","8-&gt;9"]
>
> **Explanation:** The ranges are:
>
> [0,0] --&gt; "0"
>
> [2,4] --&gt; "2-&gt;4"
>
> [6,6] --&gt; "6"
>
> [8,9] --&gt; "8-&gt;9"


**Constraints:**

- <code>0 &lt;= nums.length &lt;= 20</code>

- <code>-2<sup>31</sup> &lt;= nums[i] &lt;= 2<sup>31</sup> - 1</code>

- All the values of <code>nums</code> are **unique**.

- <code>nums</code> is sorted in ascending order.
