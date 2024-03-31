# Number of Laser Beams in a Bank

Anti-theft security devices are activated inside a bank. You are given a **0-indexed** binary string array <code>bank</code> representing the floor plan of the bank, which is an <code>m x n</code> 2D matrix. <code>bank[i]</code> represents the <code>i<sup>th</sup></code> row, consisting of <code>'0'</code>s and <code>'1'</code>s. <code>'0'</code> means the cell is empty, while<code>'1'</code> means the cell has a security device.

There is **one** laser beam between any **two** security devices **if both** conditions are met:

- The two devices are located on two **different rows**: <code>r<sub>1</sub></code> and <code>r<sub>2</sub></code>, where <code>r<sub>1</sub> &lt; r<sub>2</sub></code>.

- For **each** row <code>i</code> where <code>r<sub>1</sub> &lt; i &lt; r<sub>2</sub></code>, there are **no security devices** in the <code>i<sup>th</sup></code> row.

Laser beams are independent, i.e., one beam does not interfere nor join with another.

Return *the total number of laser beams in the bank*.


**Example 1:**
>
> **Input:** bank = ["011001","000000","010100","001000"]
>
> **Output:** 8
>
> **Explanation:** Between each of the following device pairs, there is one beam. In total, there are 8 beams:
>
> * bank[0][1] -- bank[2][1]
>
> * bank[0][1] -- bank[2][3]
>
> * bank[0][2] -- bank[2][1]
>
> * bank[0][2] -- bank[2][3]
>
> * bank[0][5] -- bank[2][1]
>
> * bank[0][5] -- bank[2][3]
>
> * bank[2][1] -- bank[3][2]
>
> * bank[2][3] -- bank[3][2]
>
> Note that there is no beam between any device on the 0<sup>th</sup> row with any on the 3<sup>rd</sup> row.
>
> This is because the 2<sup>nd</sup> row contains security devices, which breaks the second condition.

**Example 2:**
>
> **Input:** bank = ["000","111","000"]
>
> **Output:** 0
>
> **Explanation:** There does not exist two devices located on two different rows.


**Constraints:**

- <code>m == bank.length</code>

- <code>n == bank[i].length</code>

- <code>1 &lt;= m, n &lt;= 500</code>

- <code>bank[i][j]</code> is either <code>'0'</code> or <code>'1'</code>.
