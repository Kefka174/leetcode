# Linked List Cycle

Given <code>head</code>, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the&nbsp;<code>next</code>&nbsp;pointer. Internally, <code>pos</code>&nbsp;is used to denote the index of the node that&nbsp;tail's&nbsp;<code>next</code>&nbsp;pointer is connected to.&nbsp;**Note that&nbsp;<code>pos</code>&nbsp;is not passed as a parameter**.

Return&nbsp;<code>true</code>* if there is a cycle in the linked list*. Otherwise, return <code>false</code>.


**Example 1:**
>
> **Input:** head = [3,2,0,-4], pos = 1
>
> **Output:** true
>
> **Explanation:** There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

**Example 2:**
>
> **Input:** head = [1,2], pos = 0
>
> **Output:** true
>
> **Explanation:** There is a cycle in the linked list, where the tail connects to the 0th node.

**Example 3:**
>
> **Input:** head = [1], pos = -1
>
> **Output:** false
>
> **Explanation:** There is no cycle in the linked list.


**Constraints:**

- The number of the nodes in the list is in the range <code>[0, 10<sup>4</sup>]</code>.

- <code>-10<sup>5</sup> &lt;= Node.val &lt;= 10<sup>5</sup></code>

- <code>pos</code> is <code>-1</code> or a **valid index** in the linked-list.


**Follow up:** Can you solve it using <code>O(1)</code> (i.e. constant) memory?
