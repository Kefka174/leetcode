# Amount of Time for Binary Tree to Be Infected

You are given the <code>root</code> of a binary tree with **unique** values, and an integer <code>start</code>. At minute <code>0</code>, an **infection** starts from the node with value <code>start</code>.

Each minute, a node becomes infected if:

- The node is currently uninfected.

- The node is adjacent to an infected node.

Return *the number of minutes needed for the entire tree to be infected.*


**Example 1:**
>
> **Input:** root = [1,5,3,null,4,10,6,9,2], start = 3
>
> **Output:** 4
>
> **Explanation:** The following nodes are infected during:
>
> - Minute 0: Node 3
>
> - Minute 1: Nodes 1, 10 and 6
>
> - Minute 2: Node 5
>
> - Minute 3: Node 4
>
> - Minute 4: Nodes 9 and 2
>
> It takes 4 minutes for the whole tree to be infected so we return 4.

**Example 2:**
>
> **Input:** root = [1], start = 1
>
> **Output:** 0
>
> **Explanation:** At minute 0, the only node in the tree is infected so we return 0.


**Constraints:**

- The number of nodes in the tree is in the range <code>[1, 10<sup>5</sup>]</code>.

- <code>1 &lt;= Node.val &lt;= 10<sup>5</sup></code>

- Each node has a **unique** value.

- A node with a value of <code>start</code> exists in the tree.
