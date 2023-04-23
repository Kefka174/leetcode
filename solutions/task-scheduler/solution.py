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



def leastIntervalMathematical(tasks, n): # o(n)
    frequencyCounter = {}
    maxFrequency = 0
    tasksWithMaxFrequency = 0
    for task in tasks: # count the frequencies of each task
        frequencyCounter[task] = frequencyCounter.get(task, 0) + 1
        if frequencyCounter[task] > maxFrequency:
            maxFrequency = frequencyCounter[task]
            tasksWithMaxFrequency = 1
        elif frequencyCounter[task] == maxFrequency:
            tasksWithMaxFrequency += 1
    
    # Start by scheduling the tasks with max frequency, with idles inbetween as needed.
    # Ex. ["A", "A", "A, "B", "B", "B", "C"] n = 2 is scheduled as A,B,_,A,B,_,A,B
    # Next calculate how many idle slots are in between the maxFrequency tasks.
    idleSlots = (n - (tasksWithMaxFrequency - 1)) * (maxFrequency - 1)
    # Then calculate how many tasks exist that don't have maxFrequency.
    lessFrequentTaskCount = len(tasks) - (maxFrequency * tasksWithMaxFrequency)
    # Finally, plug those less frequent tasks into the idle slots to find out how many idles are needed.
    idlesNeeded = idleSlots - lessFrequentTaskCount
    if idlesNeeded < 0: idlesNeeded = 0 # the minimum number of idles needed is 0

    timeNeeded = len(tasks) + idlesNeeded
    return timeNeeded




assert leastInterval(["A","A","A","B","B","B"], 2) == 8
assert leastInterval(["A","A","A","B","B","B"], 0) == 6
assert leastInterval(["A","A","A","A","A","A","B","C","D","E","F","G"], 2) == 16