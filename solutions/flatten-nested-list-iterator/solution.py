class NestedIterator:
    def __init__(self, nestedList: ['NestedInteger']):
        self.listStack = []
        self.currentList = nestedList
        self.index = 0
    
    def next(self) -> int:
        if self.hasNext():
            retVal = self.currentList[self.index].getInteger()
            self.index += 1
            return retVal
        else:
            return None # unreachable by challenge usage
    
    def hasNext(self) -> bool:
        while (not self.currentList
               or self.index == len(self.currentList)
               or not self.currentList[self.index].isInteger()):
            if (not self.currentList) or self.index == len(self.currentList):
                if self.listStack:
                    self.currentList, self.index = self.listStack.pop()
                else:
                    return False
            else:
                if self.index < len(self.currentList) - 1:
                    self.listStack.append([self.currentList, self.index + 1])
                self.currentList = self.currentList[self.index].getList()
                self.index = 0

        return True
    

# """
# This is the interface that allows for creating nested lists.
# You should not implement it, or speculate about its implementation
# """
# class NestedInteger:
#    def isInteger(self) -> bool:
#        """
#        @return True if this NestedInteger holds a single integer, rather than a nested list.
#        """

#    def getInteger(self) -> int:
#        """
#        @return the single integer that this NestedInteger holds, if it holds a single integer
#        Return None if this NestedInteger holds a nested list
#        """

#    def getList(self) -> ['NestedInteger']:
#        """
#        @return the nested list that this NestedInteger holds, if it holds a nested list
#        Return None if this NestedInteger holds a single integer
#        """