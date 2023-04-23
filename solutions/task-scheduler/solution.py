from collections import deque, Counter
from heapq import heapify, heappush, heappop
"""
:type tasks: List[str]
:type n: int
:rtype: int
"""
def leastInterval(tasks, n): # o(nlogn) because of sorting and n*logn heaping
    remainingTasks = []
    cooldownQ = deque()
    timeCounter = 0
    
    for name, frequency in Counter(tasks).most_common(): # o(nlogn)
        remainingTasks.append(Task(name, frequency, -(n + 1)))
    heapify(remainingTasks)

    while remainingTasks or cooldownQ:
        # cooldownQ
        tasksDoneCooling = True
        while cooldownQ and tasksDoneCooling:
            nextCooldownTask = cooldownQ.popleft()
            if timeCounter > nextCooldownTask.lastTimeRun + n:
                heappush(remainingTasks, nextCooldownTask)
            else:
                cooldownQ.appendleft(nextCooldownTask)
                tasksDoneCooling = False
        # remaining tasks
        if remainingTasks:
            currentTask = heappop(remainingTasks)
            currentTask.lastTimeRun = timeCounter
            currentTask.count -= 1
            if currentTask.count: cooldownQ.append(currentTask)
        timeCounter += 1
    return timeCounter
        
class Task:
    def __init__(self, name, count, lastTimeRun):
        self.name = name
        self.count = count
        self.lastTimeRun = lastTimeRun

    def __lt__(self, nxt): # reversed so heap will be maxHeap
        return self.count > nxt.count



assert leastInterval(["A","A","A","B","B","B"], 2) == 8
assert leastInterval(["A","A","A","B","B","B"], 0) == 6
assert leastInterval(["A","A","A","A","A","A","B","C","D","E","F","G"], 2) == 16