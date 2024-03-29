# Maximum Twin Sum of a Linked List

In a linked list of size <code>n</code>, where <code>n</code> is **even**, the <code>i<sup>th</sup></code> node (**0-indexed**) of the linked list is known as the **twin** of the <code>(n-1-i)<sup>th</sup></code> node, if <code>0 &lt;= i &lt;= (n / 2) - 1</code>.

- For example, if <code>n = 4</code>, then node <code>0</code> is the twin of node <code>3</code>, and node <code>1</code> is the twin of node <code>2</code>. These are the only nodes with twins for <code>n = 4</code>.

The **twin sum **is defined as the sum of a node and its twin.

Given the <code>head</code> of a linked list with even length, return *the **maximum twin sum** of the linked list*.


**Example 1:**
>
> **Input:** head = [5,4,2,1]
>
> **Output:** 6
>
> **Explanation:**
>
> Nodes 0 and 1 are the twins of nodes 3 and 2, respectively. All have twin sum = 6.
>
> There are no other nodes with twins in the linked list.
>
> Thus, the maximum twin sum of the linked list is 6.

**Example 2:**
>
> **Input:** head = [4,2,2,3]
>
> **Output:** 7
>
> **Explanation:**
>
> The nodes with twins present in this linked list are:
>
> - Node 0 is the twin of node 3 having a twin sum of 4 + 3 = 7.
>
> - Node 1 is the twin of node 2 having a twin sum of 2 + 2 = 4.
>
> Thus, the maximum twin sum of the linked list is max(7, 4) = 7.

**Example 3:**
>
> **Input:** head = [1,100000]
>
> **Output:** 100001
>
> **Explanation:**
>
> There is only one node with a twin in the linked list having twin sum of 1 + 100000 = 100001.


**Constraints:**

- The number of nodes in the list is an **even** integer in the range <code>[2, 10<sup>5</sup>]</code>.

- <code>1 &lt;= Node.val &lt;= 10<sup>5</sup></code>
