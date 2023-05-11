# Combination Sum

Given an array of **distinct** integers <code>candidates</code> and a target integer <code>target</code>, return *a list of all **unique combinations** of *<code>candidates</code>* where the chosen numbers sum to *<code>target</code>*.* You may return the combinations in **any order**.

The **same** number may be chosen from <code>candidates</code> an **unlimited number of times**. Two combinations are unique if the <span data-keyword="frequency-array">frequency</span> of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to <code>target</code> is less than <code>150</code> combinations for the given input.


**Example 1:**
>
> **Input:** candidates = [2,3,6,7], target = 7
>
> **Output:** [[2,2,3],[7]]
>
> **Explanation:**
>
> 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
>
> 7 is a candidate, and 7 = 7.
>
> These are the only two combinations.

**Example 2:**
>
> **Input:** candidates = [2,3,5], target = 8
>
> **Output:** [[2,2,2,2],[2,3,3],[3,5]]

**Example 3:**
>
> **Input:** candidates = [2], target = 1
>
> **Output:** []


**Constraints:**

- <code>1 &lt;= candidates.length &lt;= 30</code>

- <code>2 &lt;= candidates[i] &lt;= 40</code>

- All elements of <code>candidates</code> are **distinct**.

- <code>1 &lt;= target &lt;= 40</code>
