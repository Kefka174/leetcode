# Build an Array With Stack Operations

You are given an integer array <code>target</code> and an integer <code>n</code>.

You have an empty stack with the two following operations:

- **<code>"Push"</code>**: pushes an integer to the top of the stack.

- **<code>"Pop"</code>**: removes the integer on the top of the stack.

You also have a stream of the integers in the range <code>[1, n]</code>.

Use the two stack operations to make the numbers in the stack (from the bottom to the top) equal to <code>target</code>. You should follow the following rules:

- If the stream of the integers is not empty, pick the next integer from the stream and push it to the top of the stack.

- If the stack is not empty, pop the integer at the top of the stack.

- If, at any moment, the elements in the stack (from the bottom to the top) are equal to <code>target</code>, do not read new integers from the stream and do not do more operations on the stack.

Return *the stack operations needed to build *<code>target</code> following the mentioned rules. If there are multiple valid answers, return **any of them**.


**Example 1:**
>
> **Input:** target = [1,3], n = 3
>
> **Output:** ["Push","Push","Pop","Push"]
>
> **Explanation:** Initially the stack s is empty. The last element is the top of the stack.
>
> Read 1 from the stream and push it to the stack. s = [1].
>
> Read 2 from the stream and push it to the stack. s = [1,2].
>
> Pop the integer on the top of the stack. s = [1].
>
> Read 3 from the stream and push it to the stack. s = [1,3].

**Example 2:**
>
> **Input:** target = [1,2,3], n = 3
>
> **Output:** ["Push","Push","Push"]
>
> **Explanation:** Initially the stack s is empty. The last element is the top of the stack.
>
> Read 1 from the stream and push it to the stack. s = [1].
>
> Read 2 from the stream and push it to the stack. s = [1,2].
>
> Read 3 from the stream and push it to the stack. s = [1,2,3].

**Example 3:**
>
> **Input:** target = [1,2], n = 4
>
> **Output:** ["Push","Push"]
>
> **Explanation:** Initially the stack s is empty. The last element is the top of the stack.
>
> Read 1 from the stream and push it to the stack. s = [1].
>
> Read 2 from the stream and push it to the stack. s = [1,2].
>
> Since the stack (from the bottom to the top) is equal to target, we stop the stack operations.
>
> The answers that read integer 3 from the stream are not accepted.


**Constraints:**

- <code>1 &lt;= target.length &lt;= 100</code>

- <code>1 &lt;= n &lt;= 100</code>

- <code>1 &lt;= target[i] &lt;= n</code>

- <code>target</code> is strictly increasing.
