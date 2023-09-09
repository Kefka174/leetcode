# Lowest Common Ancestor of a Binary Tree

Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the <a href="https://en.wikipedia.org/wiki/Lowest_common_ancestor" target="_blank">definition of LCA on Wikipedia</a>: “The lowest common ancestor is defined between two nodes <code>p</code> and <code>q</code> as the lowest node in <code>T</code> that has both <code>p</code> and <code>q</code> as descendants (where we allow <b>a node to be a descendant of itself</b>).”


**Example 1:**
>
> **Input:** root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
>
> **Output:** 3
>
> **Explanation:** The LCA of nodes 5 and 1 is 3.

**Example 2:**
>
> **Input:** root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
>
> **Output:** 5
>
> **Explanation:** The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.

**Example 3:**
>
> **Input:** root = [1,2], p = 1, q = 2
>
> **Output:** 1


**Constraints:**

- The number of nodes in the tree is in the range <code>[2, 10<sup>5</sup>]</code>.

- <code>-10<sup>9</sup> &lt;= Node.val &lt;= 10<sup>9</sup></code>

- All <code>Node.val</code> are **unique**.

- <code>p != q</code>

- <code>p</code> and <code>q</code> will exist in the tree.
