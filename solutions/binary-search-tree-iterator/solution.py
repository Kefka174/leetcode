class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class BSTIterator(object):
    # :type root: TreeNode
    def __init__(self, root):
        self._nodeStack = []
        self.__fallLeft(root)
        
    # :rtype: int
    def next(self):
        currentNode = self._nodeStack.pop()
        # handle self
        val = currentNode.val
        # move right
        currentNode = currentNode.right
        # fall left
        self.__fallLeft(currentNode)
        return val

    # :rtype: bool
    def hasNext(self):
        return len(self._nodeStack) > 0

    def __fallLeft(self, node):
        while node:
            self._nodeStack.append(node)
            node = node.left

