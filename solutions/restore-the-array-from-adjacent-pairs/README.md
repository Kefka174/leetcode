# Restore the Array From Adjacent Pairs

There is an integer array <code>nums</code> that consists of <code>n</code> **unique **elements, but you have forgotten it. However, you do remember every pair of adjacent elements in <code>nums</code>.

You are given a 2D integer array <code>adjacentPairs</code> of size <code>n - 1</code> where each <code>adjacentPairs[i] = [u<sub>i</sub>, v<sub>i</sub>]</code> indicates that the elements <code>u<sub>i</sub></code> and <code>v<sub>i</sub></code> are adjacent in <code>nums</code>.

It is guaranteed that every adjacent pair of elements <code>nums[i]</code> and <code>nums[i+1]</code> will exist in <code>adjacentPairs</code>, either as <code>[nums[i], nums[i+1]]</code> or <code>[nums[i+1], nums[i]]</code>. The pairs can appear **in any order**.

Return *the original array *<code>nums</code>*. If there are multiple solutions, return **any of them***.


**Example 1:**
>
> **Input:** adjacentPairs = [[2,1],[3,4],[3,2]]
>
> **Output:** [1,2,3,4]
>
> **Explanation:** This array has all its adjacent pairs in adjacentPairs.
>
> Notice that adjacentPairs[i] may not be in left-to-right order.

**Example 2:**
>
> **Input:** adjacentPairs = [[4,-2],[1,4],[-3,1]]
>
> **Output:** [-2,4,1,-3]
>
> **Explanation:** There can be negative numbers.
>
> Another solution is [-3,1,4,-2], which would also be accepted.

**Example 3:**
>
> **Input:** adjacentPairs = [[100000,-100000]]
>
> **Output:** [100000,-100000]


**Constraints:**

- <code>nums.length == n</code>

- <code>adjacentPairs.length == n - 1</code>

- <code>adjacentPairs[i].length == 2</code>

- <code>2 &lt;= n &lt;= 10<sup>5</sup></code>

- <code>-10<sup>5</sup> &lt;= nums[i], u<sub>i</sub>, v<sub>i</sub> &lt;= 10<sup>5</sup></code>

- There exists some <code>nums</code> that has <code>adjacentPairs</code> as its pairs.
