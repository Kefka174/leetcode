# N-ary Tree Preorder Traversal

Given the <code>root</code> of an n-ary tree, return *the preorder traversal of its nodes' values*.

Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)


**Example 1:**

<img src="https://assets.leetcode.com/uploads/2018/10/12/narytreeexample.png" style="width: 100%; max-width: 300px;">
>
> **Input:** root = [1,null,3,2,4,null,5,6]
>
> **Output:** [1,3,5,6,2,4]

**Example 2:**

<img alt="" src="https://assets.leetcode.com/uploads/2019/11/08/sample_4_964.png" style="width: 296px; height: 241px;">
>
> **Input:** root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
>
> **Output:** [1,2,3,6,7,11,14,4,8,12,5,9,13,10]


**Constraints:**

- The number of nodes in the tree is in the range <code>[0, 10<sup>4</sup>]</code>.

- <code>0 &lt;= Node.val &lt;= 10<sup>4</sup></code>

- The height of the n-ary tree is less than or equal to <code>1000</code>.


**Follow up:** Recursive solution is trivial, could you do it iteratively?
