# Smallest Number in Infinite Set

You have a set which contains all positive integers <code>[1, 2, 3, 4, 5, ...]</code>.

Implement the <code>SmallestInfiniteSet</code> class:

- <code>SmallestInfiniteSet()</code> Initializes the **SmallestInfiniteSet** object to contain **all** positive integers.

- <code>int popSmallest()</code> **Removes** and returns the smallest integer contained in the infinite set.

- <code>void addBack(int num)</code> **Adds** a positive integer <code>num</code> back into the infinite set, if it is **not** already in the infinite set.


**Example 1:**
>
> **Input**
>
> ["SmallestInfiniteSet", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest"]
>
> [[], [2], [], [], [], [1], [], [], []]
>
> **Output**
>
> [null, null, 1, 2, 3, null, 1, 4, 5]
>
> **Explanation**
>
> SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
>
> smallestInfiniteSet.addBack(2);    // 2 is already in the set, so no change is made.
>
> smallestInfiniteSet.popSmallest(); // return 1, since 1 is the smallest number, and remove it from the set.
>
> smallestInfiniteSet.popSmallest(); // return 2, and remove it from the set.
>
> smallestInfiniteSet.popSmallest(); // return 3, and remove it from the set.
>
> smallestInfiniteSet.addBack(1);    // 1 is added back to the set.
>
> smallestInfiniteSet.popSmallest(); // return 1, since 1 was added back to the set and
>
> // is the smallest number, and remove it from the set.
>
> smallestInfiniteSet.popSmallest(); // return 4, and remove it from the set.
>
> smallestInfiniteSet.popSmallest(); // return 5, and remove it from the set.


**Constraints:**

- <code>1 &lt;= num &lt;= 1000</code>

- At most <code>1000</code> calls will be made **in total** to <code>popSmallest</code> and <code>addBack</code>.
