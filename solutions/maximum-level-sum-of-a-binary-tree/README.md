# Maximum Level Sum of a Binary Tree

Given the <code>root</code> of a binary tree, the level of its root is <code>1</code>, the level of its children is <code>2</code>, and so on.

Return the **smallest** level <code>x</code> such that the sum of all the values of nodes at level <code>x</code> is **maximal**.


**Example 1:**
>
> **Input:** root = [1,7,0,7,-8,null,null]
>
> **Output:** 2
>
> **Explanation: **
>
> Level 1 sum = 1.
>
> Level 2 sum = 7 + 0 = 7.
>
> Level 3 sum = 7 + -8 = -1.
>
> So we return the level with the maximum sum which is level 2.

**Example 2:**
>
> **Input:** root = [989,null,10250,98693,-89388,null,null,null,-32127]
>
> **Output:** 2


**Constraints:**

- The number of nodes in the tree is in the range <code>[1, 10<sup>4</sup>]</code>.

- <code>-10<sup>5</sup> &lt;= Node.val &lt;= 10<sup>5</sup></code>
