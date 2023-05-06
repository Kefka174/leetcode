"""
:type intervals: List[List[int]]
:type newInterval: List[int]
:rtype: List[List[int]]
"""
def insert(intervals, newInterval):
    if not intervals: return [newInterval]
    if intervals[-1][1] < newInterval[0]: return intervals + [newInterval] # new interval is after all intervals

    # Find the position in intervals the newInterval will start at
    newIntervalPosition = 0
    while intervals[newIntervalPosition][1] < newInterval[0]: newIntervalPosition += 1

    # Merge intervals
    mergeCount = 0
    doneMerging = intervals[newIntervalPosition + mergeCount][0] > newInterval[1]
    while not doneMerging:
        newInterval[0] = min(newInterval[0], intervals[newIntervalPosition + mergeCount][0])
        newInterval[1] = max(newInterval[1], intervals[newIntervalPosition + mergeCount][1])
        mergeCount += 1

        intervalAbsorbed = newInterval == intervals[newIntervalPosition + mergeCount - 1]
        if intervalAbsorbed or newIntervalPosition + mergeCount == len(intervals): doneMerging = True
        else: doneMerging = intervals[newIntervalPosition + mergeCount][0] > newInterval[1]
        
    return intervals[:newIntervalPosition] + [newInterval] + intervals[newIntervalPosition + mergeCount:]



assert insert([[1,3],[7,9]], [4,6]) == [[1,3],[4,6],[7,9]]
assert insert([[1,3],[6,9]], [2,5]) == [[1,5],[6,9]]
assert insert([[1,2],[3,5],[6,7],[8,10],[12,16]], [4,8]) == [[1,2],[3,10],[12,16]]
assert insert([], [5,7]) == [[5,7]]
assert insert([[1,4],[5,7]], [9,11]) == [[1,4],[5,7],[9,11]]
assert insert([[1,5]], [2,3]) == [[1,5]]
assert insert([[1,5]], [2,7]) == [[1,7]]