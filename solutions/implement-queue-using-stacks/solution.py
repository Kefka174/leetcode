class MyQueue(object):
    def __init__(self):
        self._inputStack = []
        self._outputStack = []

    """
    :type x: int
    :rtype: None
    """
    def push(self, x):
        self._inputStack.append(x)

    """
    :rtype: int
    """
    def pop(self):
        if not self._outputStack: self.__swapStacks()
        return self._outputStack.pop()

    """
    :rtype: int
    """
    def peek(self):
        if not self._outputStack: self.__swapStacks()
        return self._outputStack[-1]

    """
    :rtype: bool
    """
    def empty(self):
        return not self._outputStack and not self._inputStack
    
    def __swapStacks(self):
        while self._inputStack: self._outputStack.append(self._inputStack.pop())


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()