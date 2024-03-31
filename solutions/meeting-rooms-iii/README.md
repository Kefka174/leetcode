# Meeting Rooms III

You are given an integer <code>n</code>. There are <code>n</code> rooms numbered from <code>0</code> to <code>n - 1</code>.

You are given a 2D integer array <code>meetings</code> where <code>meetings[i] = [start<sub>i</sub>, end<sub>i</sub>]</code> means that a meeting will be held during the **half-closed** time interval <code>[start<sub>i</sub>, end<sub>i</sub>)</code>. All the values of <code>start<sub>i</sub></code> are **unique**.

Meetings are allocated to rooms in the following manner:

- Each meeting will take place in the unused room with the **lowest** number.

- If there are no available rooms, the meeting will be delayed until a room becomes free. The delayed meeting should have the **same** duration as the original meeting.

- When a room becomes unused, meetings that have an earlier original **start** time should be given the room.

Return* the **number** of the room that held the most meetings. *If there are multiple rooms, return* the room with the **lowest** number.*

A **half-closed interval** <code>[a, b)</code> is the interval between <code>a</code> and <code>b</code> **including** <code>a</code> and **not including** <code>b</code>.


**Example 1:**
>
> **Input:** n = 2, meetings = [[0,10],[1,5],[2,7],[3,4]]
>
> **Output:** 0
>
> **Explanation:**
>
> - At time 0, both rooms are not being used. The first meeting starts in room 0.
>
> - At time 1, only room 1 is not being used. The second meeting starts in room 1.
>
> - At time 2, both rooms are being used. The third meeting is delayed.
>
> - At time 3, both rooms are being used. The fourth meeting is delayed.
>
> - At time 5, the meeting in room 1 finishes. The third meeting starts in room 1 for the time period [5,10).
>
> - At time 10, the meetings in both rooms finish. The fourth meeting starts in room 0 for the time period [10,11).
>
> Both rooms 0 and 1 held 2 meetings, so we return 0.

**Example 2:**
>
> **Input:** n = 3, meetings = [[1,20],[2,10],[3,5],[4,9],[6,8]]
>
> **Output:** 1
>
> **Explanation:**
>
> - At time 1, all three rooms are not being used. The first meeting starts in room 0.
>
> - At time 2, rooms 1 and 2 are not being used. The second meeting starts in room 1.
>
> - At time 3, only room 2 is not being used. The third meeting starts in room 2.
>
> - At time 4, all three rooms are being used. The fourth meeting is delayed.
>
> - At time 5, the meeting in room 2 finishes. The fourth meeting starts in room 2 for the time period [5,10).
>
> - At time 6, all three rooms are being used. The fifth meeting is delayed.
>
> - At time 10, the meetings in rooms 1 and 2 finish. The fifth meeting starts in room 1 for the time period [10,12).
>
> Room 0 held 1 meeting while rooms 1 and 2 each held 2 meetings, so we return 1.


**Constraints:**

- <code>1 &lt;= n &lt;= 100</code>

- <code>1 &lt;= meetings.length &lt;= 10<sup>5</sup></code>

- <code>meetings[i].length == 2</code>

- <code>0 &lt;= start<sub>i</sub> &lt; end<sub>i</sub> &lt;= 5 * 10<sup>5</sup></code>

- All the values of <code>start<sub>i</sub></code> are **unique**.
