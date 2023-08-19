# Can Place Flowers

You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in **adjacent** plots.

Given an integer array <code>flowerbed</code> containing <code>0</code>'s and <code>1</code>'s, where <code>0</code> means empty and <code>1</code> means not empty, and an integer <code>n</code>, return <code>true</code>&nbsp;*if* <code>n</code> *new flowers can be planted in the* <code>flowerbed</code> *without violating the no-adjacent-flowers rule and* <code>false</code> *otherwise*.


**Example 1:**
>
> **Input:** flowerbed = [1,0,0,0,1], n = 1
>
> **Output:** true

**Example 2:**
>
> **Input:** flowerbed = [1,0,0,0,1], n = 2
>
> **Output:** false


**Constraints:**

- <code>1 &lt;= flowerbed.length &lt;= 2 * 10<sup>4</sup></code>

- <code>flowerbed[i]</code> is <code>0</code> or <code>1</code>.

- There are no two adjacent flowers in <code>flowerbed</code>.

- <code>0 &lt;= n &lt;= flowerbed.length</code>
