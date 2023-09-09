# Leaf-Similar Trees

Consider all the leaves of a binary tree, from&nbsp;left to right order, the values of those&nbsp;leaves form a **leaf value sequence***.*

<img alt="" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/16/tree.png" style="width: 400px; height: 336px;">

For example, in the given tree above, the leaf value sequence is <code>(6, 7, 4, 9, 8)</code>.

Two binary trees are considered *leaf-similar*&nbsp;if their leaf value sequence is the same.

Return <code>true</code> if and only if the two given trees with head nodes <code>root1</code> and <code>root2</code> are leaf-similar.


**Example 1:**
>
> **Input:** root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
>
> **Output:** true

**Example 2:**
>
> **Input:** root1 = [1,2,3], root2 = [1,3,2]
>
> **Output:** false


**Constraints:**

- The number of nodes in each tree will be in the range <code>[1, 200]</code>.

- Both of the given trees will have values in the range <code>[0, 200]</code>.
