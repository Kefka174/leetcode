# Add One Row to Tree

Given the <code>root</code> of a binary tree and two integers <code>val</code> and <code>depth</code>, add a row of nodes with value <code>val</code> at the given depth <code>depth</code>.

Note that the <code>root</code> node is at depth <code>1</code>.

The adding rule is:

- Given the integer <code>depth</code>, for each not null tree node <code>cur</code> at the depth <code>depth - 1</code>, create two tree nodes with value <code>val</code> as <code>cur</code>'s left subtree root and right subtree root.

- <code>cur</code>'s original left subtree should be the left subtree of the new left subtree root.

- <code>cur</code>'s original right subtree should be the right subtree of the new right subtree root.

- If <code>depth == 1</code> that means there is no depth <code>depth - 1</code> at all, then create a tree node with value <code>val</code> as the new root of the whole original tree, and the original tree is the new root's left subtree.


**Example 1:**
>
> **Input:** root = [4,2,6,3,1,5], val = 1, depth = 2
>
> **Output:** [4,1,1,2,null,null,6,3,1,5]

**Example 2:**
>
> **Input:** root = [4,2,null,3,1], val = 1, depth = 3
>
> **Output:** [4,2,null,1,1,3,null,null,1]


**Constraints:**

- The number of nodes in the tree is in the range <code>[1, 10<sup>4</sup>]</code>.

- The depth of the tree is in the range <code>[1, 10<sup>4</sup>]</code>.

- <code>-100 &lt;= Node.val &lt;= 100</code>

- <code>-10<sup>5</sup> &lt;= val &lt;= 10<sup>5</sup></code>

- <code>1 &lt;= depth &lt;= the depth of tree + 1</code>
