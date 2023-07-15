# Cousins in Binary Tree

Given the <code>root</code> of a binary tree with unique values and the values of two different nodes of the tree <code>x</code> and <code>y</code>, return <code>true</code> *if the nodes corresponding to the values *<code>x</code>* and *<code>y</code>* in the tree are **cousins**, or *<code>false</code>* otherwise.*

Two nodes of a binary tree are **cousins** if they have the same depth with different parents.

Note that in a binary tree, the root node is at the depth <code>0</code>, and children of each depth <code>k</code> node are at the depth <code>k + 1</code>.


**Example 1:**
>
> **Input:** root = [1,2,3,4], x = 4, y = 3
>
> **Output:** false

**Example 2:**
>
> **Input:** root = [1,2,3,null,4,null,5], x = 5, y = 4
>
> **Output:** true

**Example 3:**
>
> **Input:** root = [1,2,3,null,4], x = 2, y = 3
>
> **Output:** false


**Constraints:**

- The number of nodes in the tree is in the range <code>[2, 100]</code>.

- <code>1 &lt;= Node.val &lt;= 100</code>

- Each node has a **unique** value.

- <code>x != y</code>

- <code>x</code> and <code>y</code> are exist in the tree.
