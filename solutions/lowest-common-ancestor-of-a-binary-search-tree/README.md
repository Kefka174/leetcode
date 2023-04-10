# Lowest Common Ancestor of a Binary Search Tree

Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.

According to the <a href="https://en.wikipedia.org/wiki/Lowest_common_ancestor" target="_blank">definition of LCA on Wikipedia</a>: “The lowest common ancestor is defined between two nodes <code>p</code> and <code>q</code> as the lowest node in <code>T</code> that has both <code>p</code> and <code>q</code> as descendants (where we allow **a node to be a descendant of itself**).”


**Example 1:**
>
> **Input:** root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
>
> **Output:** 6
>
> **Explanation:** The LCA of nodes 2 and 8 is 6.

**Example 2:**
>
> **Input:** root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
>
> **Output:** 2
>
> **Explanation:** The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.

**Example 3:**
>
> **Input:** root = [2,1], p = 2, q = 1
>
> **Output:** 2


**Constraints:**

- The number of nodes in the tree is in the range <code>[2, 10<sup>5</sup>]</code>.

- <code>-10<sup>9</sup> &lt;= Node.val &lt;= 10<sup>9</sup></code>

- All <code>Node.val</code> are **unique**.

- <code>p != q</code>

- <code>p</code> and <code>q</code> will exist in the BST.
