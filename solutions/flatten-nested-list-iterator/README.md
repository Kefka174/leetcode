# Flatten Nested List Iterator

You are given a nested list of integers <code>nestedList</code>. Each element is either an integer or a list whose elements may also be integers or other lists. Implement an iterator to flatten it.

Implement the <code>NestedIterator</code> class:

- <code>NestedIterator(List&lt;NestedInteger&gt; nestedList)</code> Initializes the iterator with the nested list <code>nestedList</code>.

- <code>int next()</code> Returns the next integer in the nested list.

- <code>boolean hasNext()</code> Returns <code>true</code> if there are still some integers in the nested list and <code>false</code> otherwise.

Your code will be tested with the following pseudocode:
>
> initialize iterator with nestedList
>
> res = []
>
> while iterator.hasNext()
>
> append iterator.next() to the end of res
>
> return res

If <code>res</code> matches the expected flattened list, then your code will be judged as correct.


**Example 1:**
>
> **Input:** nestedList = [[1,1],2,[1,1]]
>
> **Output:** [1,1,2,1,1]
>
> **Explanation:** By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,1,2,1,1].

**Example 2:**
>
> **Input:** nestedList = [1,[4,[6]]]
>
> **Output:** [1,4,6]
>
> **Explanation:** By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,4,6].


**Constraints:**

- <code>1 &lt;= nestedList.length &lt;= 500</code>

- The values of the integers in the nested list is in the range <code>[-10<sup>6</sup>, 10<sup>6</sup>]</code>.
