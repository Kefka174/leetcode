from heapq import heappush, heappop

class SeatManager:
    def __init__(self, n: int):
        self.seatHeap = list(range(1, n + 1))

    def reserve(self) -> int:
        return heappop(self.seatHeap)

    def unreserve(self, seatNumber: int) -> None:
        heappush(self.seatHeap, seatNumber)