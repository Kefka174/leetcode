# Merge In Between Linked Lists

You are given two linked lists: <code>list1</code> and <code>list2</code> of sizes <code>n</code> and <code>m</code> respectively.

Remove <code>list1</code>'s nodes from the <code>a<sup>th</sup></code> node to the <code>b<sup>th</sup></code> node, and put <code>list2</code> in their place.

The blue edges and nodes in the following figure indicate the result:

*Build the result list and return its head.*


**Example 1:**
>
> **Input:** list1 = [10,1,13,6,9,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
>
> **Output:** [10,1,13,1000000,1000001,1000002,5]
>
> **Explanation:** We remove the nodes 3 and 4 and put the entire list2 in their place. The blue edges and nodes in the above figure indicate the result.

**Example 2:**
>
> **Input:** list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,1000003,1000004]
>
> **Output:** [0,1,1000000,1000001,1000002,1000003,1000004,6]
>
> **Explanation:** The blue edges and nodes in the above figure indicate the result.


**Constraints:**

- <code>3 &lt;= list1.length &lt;= 10<sup>4</sup></code>

- <code>1 &lt;= a &lt;= b &lt; list1.length - 1</code>

- <code>1 &lt;= list2.length &lt;= 10<sup>4</sup></code>
