# Seat Reservation Manager

Design a system that manages the reservation state of <code>n</code> seats that are numbered from <code>1</code> to <code>n</code>.

Implement the <code>SeatManager</code> class:

- <code>SeatManager(int n)</code> Initializes a <code>SeatManager</code> object that will manage <code>n</code> seats numbered from <code>1</code> to <code>n</code>. All seats are initially available.

- <code>int reserve()</code> Fetches the **smallest-numbered** unreserved seat, reserves it, and returns its number.

- <code>void unreserve(int seatNumber)</code> Unreserves the seat with the given <code>seatNumber</code>.


**Example 1:**
>
> **Input**
>
> ["SeatManager", "reserve", "reserve", "unreserve", "reserve", "reserve", "reserve", "reserve", "unreserve"]
>
> [[5], [], [], [2], [], [], [], [], [5]]
>
> **Output**
>
> [null, 1, 2, null, 2, 3, 4, 5, null]
>
> **Explanation**
>
> SeatManager seatManager = new SeatManager(5); // Initializes a SeatManager with 5 seats.
>
> seatManager.reserve();    // All seats are available, so return the lowest numbered seat, which is 1.
>
> seatManager.reserve();    // The available seats are [2,3,4,5], so return the lowest of them, which is 2.
>
> seatManager.unreserve(2); // Unreserve seat 2, so now the available seats are [2,3,4,5].
>
> seatManager.reserve();    // The available seats are [2,3,4,5], so return the lowest of them, which is 2.
>
> seatManager.reserve();    // The available seats are [3,4,5], so return the lowest of them, which is 3.
>
> seatManager.reserve();    // The available seats are [4,5], so return the lowest of them, which is 4.
>
> seatManager.reserve();    // The only available seat is seat 5, so return 5.
>
> seatManager.unreserve(5); // Unreserve seat 5, so now the available seats are [5].


**Constraints:**

- <code>1 &lt;= n &lt;= 10<sup>5</sup></code>

- <code>1 &lt;= seatNumber &lt;= n</code>

- For each call to <code>reserve</code>, it is guaranteed that there will be at least one unreserved seat.

- For each call to <code>unreserve</code>, it is guaranteed that <code>seatNumber</code> will be reserved.

- At most <code>10<sup>5</sup></code> calls **in total** will be made to <code>reserve</code> and <code>unreserve</code>.
