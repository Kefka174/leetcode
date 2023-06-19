# Find the Highest Altitude

There is a biker going on a road trip. The road trip consists of <code>n + 1</code> points at different altitudes. The biker starts his trip on point <code>0</code> with altitude equal <code>0</code>.

You are given an integer array <code>gain</code> of length <code>n</code> where <code>gain[i]</code> is the **net gain in altitude** between points <code>i</code>​​​​​​ and <code>i + 1</code> for all (<code>0 &lt;= i &lt; n)</code>. Return *the **highest altitude** of a point.*


**Example 1:**
>
> **Input:** gain = [-5,1,5,0,-7]
>
> **Output:** 1
>
> **Explanation:** The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

**Example 2:**
>
> **Input:** gain = [-4,-3,-2,-1,4,3,2]
>
> **Output:** 0
>
> **Explanation:** The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.


**Constraints:**

- <code>n == gain.length</code>

- <code>1 &lt;= n &lt;= 100</code>

- <code>-100 &lt;= gain[i] &lt;= 100</code>
