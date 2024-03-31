# Insert Delete GetRandom O(1)

Implement the <code>RandomizedSet</code> class:

- <code>RandomizedSet()</code> Initializes the <code>RandomizedSet</code> object.

- <code>bool insert(int val)</code> Inserts an item <code>val</code> into the set if not present. Returns <code>true</code> if the item was not present, <code>false</code> otherwise.

- <code>bool remove(int val)</code> Removes an item <code>val</code> from the set if present. Returns <code>true</code> if the item was present, <code>false</code> otherwise.

- <code>int getRandom()</code> Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the <b>same probability</b> of being returned.

You must implement the functions of the class such that each function works in&nbsp;**average**&nbsp;<code>O(1)</code>&nbsp;time complexity.


**Example 1:**
>
> **Input**
>
> ["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
>
> [[], [1], [2], [2], [], [1], [2], []]
>
> **Output**
>
> [null, true, false, true, 2, true, false, 2]
>
> **Explanation**
>
> RandomizedSet randomizedSet = new RandomizedSet();
>
> randomizedSet.insert(1); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
>
> randomizedSet.remove(2); // Returns false as 2 does not exist in the set.
>
> randomizedSet.insert(2); // Inserts 2 to the set, returns true. Set now contains [1,2].
>
> randomizedSet.getRandom(); // getRandom() should return either 1 or 2 randomly.
>
> randomizedSet.remove(1); // Removes 1 from the set, returns true. Set now contains [2].
>
> randomizedSet.insert(2); // 2 was already in the set, so return false.
>
> randomizedSet.getRandom(); // Since 2 is the only number in the set, getRandom() will always return 2.


**Constraints:**

- <code>-2<sup>31</sup> &lt;= val &lt;= 2<sup>31</sup> - 1</code>

- At most <code>2 *&nbsp;</code><code>10<sup>5</sup></code> calls will be made to <code>insert</code>, <code>remove</code>, and <code>getRandom</code>.

- There will be **at least one** element in the data structure when <code>getRandom</code> is called.
