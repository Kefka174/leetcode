"""
:type intervals: List[List[int]]
:rtype: List[List[int]]
"""
def merge(intervals):
    intervals.sort()
    mergedIntervals = [intervals[0]]

    for currentInterval in intervals:
        if currentInterval[0] <= mergedIntervals[-1][1]:
            mergedIntervals[-1][1] = max(mergedIntervals[-1][1], currentInterval[1])
        else: mergedIntervals.append(currentInterval)

    return mergedIntervals



assert merge([[1,3],[2,6],[8,10],[15,18]]) == [[1,6],[8,10],[15,18]]
assert merge([[1,4],[4,5]]) == [[1,5]]
assert merge([[1,4],[0,4]]) == [[0,4]]