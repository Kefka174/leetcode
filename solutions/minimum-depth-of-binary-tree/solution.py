from collections import deque
class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
        
"""
:type root: TreeNode
:rtype: int
"""
def minDepth(root):
    if not root: return 0 # node is None
    currentLevelNodes = deque()
    nextLevelNodes = deque()
    depthCount = 1

    currentLevelNodes.append(root)

    while currentLevelNodes or nextLevelNodes:
        if not currentLevelNodes: # go to next level
            depthCount += 1
            currentLevelNodes = nextLevelNodes
            nextLevelNodes = deque()
        else:
            currentNode = currentLevelNodes.popleft()
            if not (currentNode.left or currentNode.right): return depthCount
            if currentNode.left: nextLevelNodes.append(currentNode.left)
            if currentNode.right: nextLevelNodes.append(currentNode.right)