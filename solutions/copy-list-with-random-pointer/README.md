# Copy List with Random Pointer

A linked list of length <code>n</code> is given such that each node contains an additional random pointer, which could point to any node in the list, or <code>null</code>.

Construct a <a href="https://en.wikipedia.org/wiki/Object_copying#Deep_copy" target="_blank">**deep copy**</a> of the list. The deep copy should consist of exactly <code>n</code> **brand new** nodes, where each new node has its value set to the value of its corresponding original node. Both the <code>next</code> and <code>random</code> pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. **None of the pointers in the new list should point to nodes in the original list**.

For example, if there are two nodes <code>X</code> and <code>Y</code> in the original list, where <code>X.random --&gt; Y</code>, then for the corresponding two nodes <code>x</code> and <code>y</code> in the copied list, <code>x.random --&gt; y</code>.

Return *the head of the copied linked list*.

The linked list is represented in the input/output as a list of <code>n</code> nodes. Each node is represented as a pair of <code>[val, random_index]</code> where:

- <code>val</code>: an integer representing <code>Node.val</code>

- <code>random_index</code>: the index of the node (range from <code>0</code> to <code>n-1</code>) that the <code>random</code> pointer points to, or <code>null</code> if it does not point to any node.

Your code will **only** be given the <code>head</code> of the original linked list.


**Example 1:**
>
> **Input:** head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
>
> **Output:** [[7,null],[13,0],[11,4],[10,2],[1,0]]

**Example 2:**
>
> **Input:** head = [[1,1],[2,1]]
>
> **Output:** [[1,1],[2,1]]

**Example 3:**

**<img alt="" src="https://assets.leetcode.com/uploads/2019/12/18/e3.png" style="width: 700px; height: 122px;">**
>
> **Input:** head = [[3,null],[3,0],[3,null]]
>
> **Output:** [[3,null],[3,0],[3,null]]


**Constraints:**

- <code>0 &lt;= n &lt;= 1000</code>

- <code>-10<sup>4</sup> &lt;= Node.val &lt;= 10<sup>4</sup></code>

- <code>Node.random</code> is <code>null</code> or is pointing to some node in the linked list.
