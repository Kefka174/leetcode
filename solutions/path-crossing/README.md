# Path Crossing

Given a string <code>path</code>, where <code>path[i] = 'N'</code>, <code>'S'</code>, <code>'E'</code> or <code>'W'</code>, each representing moving one unit north, south, east, or west, respectively. You start at the origin <code>(0, 0)</code> on a 2D plane and walk on the path specified by <code>path</code>.

Return <code>true</code> *if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited*. Return <code>false</code> otherwise.


**Example 1:**
>
> **Input:** path = "NES"
>
> **Output:** false
>
> **Explanation:** Notice that the path doesn't cross any point more than once.

**Example 2:**
>
> **Input:** path = "NESWW"
>
> **Output:** true
>
> **Explanation:** Notice that the path visits the origin twice.


**Constraints:**

- <code>1 &lt;= path.length &lt;= 10<sup>4</sup></code>

- <code>path[i]</code> is either <code>'N'</code>, <code>'S'</code>, <code>'E'</code>, or <code>'W'</code>.
