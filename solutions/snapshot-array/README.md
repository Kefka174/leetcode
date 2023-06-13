# Snapshot Array

Implement a SnapshotArray that supports the following interface:

- <code>SnapshotArray(int length)</code> initializes an array-like data structure with the given length. **Initially, each element equals 0**.

- <code>void set(index, val)</code> sets the element at the given <code>index</code> to be equal to <code>val</code>.

- <code>int snap()</code> takes a snapshot of the array and returns the <code>snap_id</code>: the total number of times we called <code>snap()</code> minus <code>1</code>.

- <code>int get(index, snap_id)</code> returns the value at the given <code>index</code>, at the time we took the snapshot with the given <code>snap_id</code>


**Example 1:**
>
> **Input:** ["SnapshotArray","set","snap","set","get"]
>
> [[3],[0,5],[],[0,6],[0,0]]
>
> **Output:** [null,null,0,null,5]
>
> **Explanation: **
>
> SnapshotArray snapshotArr = new SnapshotArray(3); // set the length to be 3
>
> snapshotArr.set(0,5);  // Set array[0] = 5
>
> snapshotArr.snap();  // Take a snapshot, return snap_id = 0
>
> snapshotArr.set(0,6);
>
> snapshotArr.get(0,0);  // Get the value of array[0] with snap_id = 0, return 5


**Constraints:**

- <code>1 &lt;= length &lt;= 5 * 10<sup>4</sup></code>

- <code>0 &lt;= index &lt; length</code>

- <code>0 &lt;= val &lt;= 10<sup>9</sup></code>

- <code>0 &lt;= snap_id &lt; </code>(the total number of times we call <code>snap()</code>)

- At most <code>5 * 10<sup>4</sup></code> calls will be made to <code>set</code>, <code>snap</code>, and <code>get</code>.
