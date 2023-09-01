# Delete the Middle Node of a Linked List

You are given the <code>head</code> of a linked list. **Delete** the **middle node**, and return *the* <code>head</code> *of the modified linked list*.

The **middle node** of a linked list of size <code>n</code> is the <code>⌊n / 2⌋<sup>th</sup></code> node from the <b>start</b> using **0-based indexing**, where <code>⌊x⌋</code> denotes the largest integer less than or equal to <code>x</code>.

- For <code>n</code> = <code>1</code>, <code>2</code>, <code>3</code>, <code>4</code>, and <code>5</code>, the middle nodes are <code>0</code>, <code>1</code>, <code>1</code>, <code>2</code>, and <code>2</code>, respectively.


**Example 1:**
>
> **Input:** head = [1,3,4,7,1,2,6]
>
> **Output:** [1,3,4,1,2,6]
>
> **Explanation:**
>
> The above figure represents the given linked list. The indices of the nodes are written below.
>
> Since n = 7, node 3 with value 7 is the middle node, which is marked in red.
>
> We return the new list after removing this node.

**Example 2:**
>
> **Input:** head = [1,2,3,4]
>
> **Output:** [1,2,4]
>
> **Explanation:**
>
> The above figure represents the given linked list.
>
> For n = 4, node 2 with value 3 is the middle node, which is marked in red.

**Example 3:**
>
> **Input:** head = [2,1]
>
> **Output:** [2]
>
> **Explanation:**
>
> The above figure represents the given linked list.
>
> For n = 2, node 1 with value 1 is the middle node, which is marked in red.
>
> Node 0 with value 2 is the only node remaining after removing node 1.


**Constraints:**

- The number of nodes in the list is in the range <code>[1, 10<sup>5</sup>]</code>.

- <code>1 &lt;= Node.val &lt;= 10<sup>5</sup></code>
