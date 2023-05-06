class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

"""
:type root: TreeNode
:rtype: List[int]
"""
def rightSideView(root): # modified in-order traversal, could use post-order or level-order
    returnList = []
    nodeStack = []
    currentNode = root
    currentDepth = 1

    while currentNode or nodeStack:
        while currentNode: # fall right
            if currentDepth > len(returnList): returnList.append(currentNode.val)
            nodeStack.append((currentNode, currentDepth))
            currentNode = currentNode.right
            currentDepth += 1
        
        currentNode, currentDepth = nodeStack.pop()
        currentNode = currentNode.left
        if currentNode: currentDepth += 1

    return returnList