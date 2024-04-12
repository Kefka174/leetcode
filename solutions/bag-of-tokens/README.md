# Bag of Tokens

You start with an initial **power** of <code>power</code>, an initial **score** of <code>0</code>, and a bag of tokens given as an integer array <code>tokens</code>, where each&nbsp;<code>tokens[i]</code> denotes the value of token*<sub>i</sub>*.

Your goal is to **maximize** the total **score** by strategically playing these tokens. In one move, you can play an **unplayed** token in one of the two ways (but not both for the same token):

- **Face-up**: If your current power is **at least** <code>tokens[i]</code>, you may play token*<sub>i</sub>*, losing <code>tokens[i]</code> power and gaining <code>1</code> score.

- **Face-down**: If your current score is **at least** <code>1</code>, you may play token*<sub>i</sub>*, gaining <code>tokens[i]</code> power and losing <code>1</code> score.

Return *the **maximum** possible score you can achieve after playing **any** number of tokens*.


**Example 1:**

**Input:** <span class="example-io" style="

font-family: Menlo,sans-serif;

font-size: 0.85rem;

">tokens = [100], power = 50</span>

**Output:** <span class="example-io" style="

font-family: Menlo,sans-serif;

font-size: 0.85rem;

">0</span>

**Explanation****:** Since your score is <code>0</code> initially, you cannot play the token face-down. You also cannot play it face-up since your power (<code>50</code>) is less than <code>tokens[0]</code>&nbsp;(<code>100</code>).

**Example 2:**

**Input:** <span class="example-io" style="

font-family: Menlo,sans-serif;

font-size: 0.85rem;

">tokens = [200,100], power = 150</span>

**Output:** <span class="example-io" style="

font-family: Menlo,sans-serif;

font-size: 0.85rem;

">1</span>

**Explanation:** Play token*<sub>1</sub>* (<code>100</code>) face-up, reducing your power to&nbsp;<code>50</code> and increasing your score to&nbsp;<code>1</code>.

There is no need to play token*<sub>0</sub>*, since you cannot play it face-up to add to your score. The maximum score achievable is <code>1</code>.

**Example 3:**

**Input:** <span class="example-io" style="

font-family: Menlo,sans-serif;

font-size: 0.85rem;

">tokens = [100,200,300,400], power = 200</span>

**Output:** <span class="example-io" style="

font-family: Menlo,sans-serif;

font-size: 0.85rem;

">2</span>

**Explanation:** Play the tokens in this order to get a score of <code>2</code>:

- Play token*<sub>0</sub>* (<code>100</code>) face-up, reducing power to <code>100</code> and increasing score to <code>1</code>.

- Play token*<sub>3</sub>* (<code>400</code>) face-down, increasing power to <code>500</code> and reducing score to <code>0</code>.

- Play token*<sub>1</sub>* (<code>200</code>) face-up, reducing power to <code>300</code> and increasing score to <code>1</code>.

- Play token*<sub>2</sub>* (<code>300</code>) face-up, reducing power to <code>0</code> and increasing score to <code>2</code>.

<span style="color: var(--text-secondary); font-size: 0.875rem;">The maximum score achievable is </span><code style="color: var(--text-secondary); font-size: 0.875rem;">2</code><span style="color: var(--text-secondary); font-size: 0.875rem;">.</span>


**Constraints:**

- <code>0 &lt;= tokens.length &lt;= 1000</code>

- <code>0 &lt;= tokens[i], power &lt; 10<sup>4</sup></code>
