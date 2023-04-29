from collections import OrderedDict
"""
:type numCourses: int
:type prerequisites: List[List[int]]
:rtype: List[int]
"""
def findOrder(numCourses, prerequisites):
    prereqDict = {i: [] for i in range(numCourses)}
    for prereq in prerequisites: prereqDict[prereq[0]].append(prereq[1])

    courseOrder = []
    processStack = OrderedDict()
    unprocessedCourses = {i for i in range(numCourses)}
    prereqLoopDetector = set()
    while unprocessedCourses or processStack:
        if not processStack: 
            nextCourse = unprocessedCourses.pop()
            processStack[nextCourse] = None
            unprocessedCourses.add(nextCourse)
        
        course = processStack.popitem()[0]

        if course in unprocessedCourses:
            prereqs = prereqDict[course]
            unmetPrereqs = []
            for pre in prereqs:
                if pre in unprocessedCourses: unmetPrereqs.append(pre)

            if unmetPrereqs:
                processStack[course] = None
                prereqLoopDetector.add(course)
                for pre in prereqs: 
                    if pre in prereqLoopDetector: return []
                    processStack.pop(pre, None)
                    processStack[pre] = None
            else:
                if course in prereqLoopDetector: prereqLoopDetector.remove(course)
                unprocessedCourses.remove(course)
                courseOrder.append(course)
    return courseOrder



assert findOrder(2, [[1,0]]) == [0,1]
assert findOrder(4, [[1,0],[2,0],[3,1],[3,2]]) == [0,1,2,3]
assert findOrder(1, []) == [0]
assert findOrder(2, [[0,1],[1,0]]) == []
assert findOrder(8, [[1,0],[2,6],[1,7],[6,4],[7,0],[0,5]]) == [5,0,7,1,4,6,2,3]