# Range Sum of BST

Given the <code>root</code> node of a binary search tree and two integers <code>low</code> and <code>high</code>, return *the sum of values of all nodes with a value in the **inclusive** range *<code>[low, high]</code>.


**Example 1:**
>
> **Input:** root = [10,5,15,3,7,null,18], low = 7, high = 15
>
> **Output:** 32
>
> **Explanation:** Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.

**Example 2:**
>
> **Input:** root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
>
> **Output:** 23
>
> **Explanation:** Nodes 6, 7, and 10 are in the range [6, 10]. 6 + 7 + 10 = 23.


**Constraints:**

- The number of nodes in the tree is in the range <code>[1, 2 * 10<sup>4</sup>]</code>.

- <code>1 &lt;= Node.val &lt;= 10<sup>5</sup></code>

- <code>1 &lt;= low &lt;= high &lt;= 10<sup>5</sup></code>

- All <code>Node.val</code> are **unique**.
