# Smallest String Starting From Leaf

You are given the <code>root</code> of a binary tree where each node has a value in the range <code>[0, 25]</code> representing the letters <code>'a'</code> to <code>'z'</code>.

Return *the **lexicographically smallest** string that starts at a leaf of this tree and ends at the root*.

As a reminder, any shorter prefix of a string is **lexicographically smaller**.

- For example, <code>"ab"</code> is lexicographically smaller than <code>"aba"</code>.

A leaf of a node is a node that has no children.


**Example 1:**
>
> **Input:** root = [0,1,2,3,4,3,4]
>
> **Output:** "dba"

**Example 2:**
>
> **Input:** root = [25,1,3,1,3,0,2]
>
> **Output:** "adz"

**Example 3:**
>
> **Input:** root = [2,2,1,null,1,0,null,0]
>
> **Output:** "abc"


**Constraints:**

- The number of nodes in the tree is in the range <code>[1, 8500]</code>.

- <code>0 &lt;= Node.val &lt;= 25</code>
