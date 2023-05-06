class MinStack(object):
    # could instead use one stack storing tuples of (val, minSoFar)
    def __init__(self):
        self._stack = []
        self._minValStack = []

    """
    :type val: int
    :rtype: None
    """
    def push(self, val):
        if not self._minValStack or self._minValStack[-1] >= val:
            self._minValStack.append(val)
        self._stack.append(val)

    """
    :rtype: None
    """
    def pop(self):
        if self._stack[-1] == self._minValStack[-1]: self._minValStack.pop()
        self._stack.pop()

    """
    :rtype: int
    """
    def top(self):
        return self._stack[-1]

    """
    :rtype: int
    """
    def getMin(self):
        return self._minValStack[-1]


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()