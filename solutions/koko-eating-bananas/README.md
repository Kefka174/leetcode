# Koko Eating Bananas

Koko loves to eat bananas. There are <code>n</code> piles of bananas, the <code>i<sup>th</sup></code> pile has <code>piles[i]</code> bananas. The guards have gone and will come back in <code>h</code> hours.

Koko can decide her bananas-per-hour eating speed of <code>k</code>. Each hour, she chooses some pile of bananas and eats <code>k</code> bananas from that pile. If the pile has less than <code>k</code> bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return *the minimum integer* <code>k</code> *such that she can eat all the bananas within* <code>h</code> *hours*.


**Example 1:**
>
> **Input:** piles = [3,6,7,11], h = 8
>
> **Output:** 4

**Example 2:**
>
> **Input:** piles = [30,11,23,4,20], h = 5
>
> **Output:** 30

**Example 3:**
>
> **Input:** piles = [30,11,23,4,20], h = 6
>
> **Output:** 23


**Constraints:**

- <code>1 &lt;= piles.length &lt;= 10<sup>4</sup></code>

- <code>piles.length &lt;= h &lt;= 10<sup>9</sup></code>

- <code>1 &lt;= piles[i] &lt;= 10<sup>9</sup></code>
