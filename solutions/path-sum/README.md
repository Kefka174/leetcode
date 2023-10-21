# Path Sum

Given the <code>root</code> of a binary tree and an integer <code>targetSum</code>, return <code>true</code> if the tree has a **root-to-leaf** path such that adding up all the values along the path equals <code>targetSum</code>.

A **leaf** is a node with no children.


**Example 1:**
>
> **Input:** root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
>
> **Output:** true
>
> **Explanation:** The root-to-leaf path with the target sum is shown.

**Example 2:**
>
> **Input:** root = [1,2,3], targetSum = 5
>
> **Output:** false
>
> **Explanation:** There two root-to-leaf paths in the tree:
>
> (1 --&gt; 2): The sum is 3.
>
> (1 --&gt; 3): The sum is 4.
>
> There is no root-to-leaf path with sum = 5.

**Example 3:**
>
> **Input:** root = [], targetSum = 0
>
> **Output:** false
>
> **Explanation:** Since the tree is empty, there are no root-to-leaf paths.


**Constraints:**

- The number of nodes in the tree is in the range <code>[0, 5000]</code>.

- <code>-1000 &lt;= Node.val &lt;= 1000</code>

- <code>-1000 &lt;= targetSum &lt;= 1000</code>
