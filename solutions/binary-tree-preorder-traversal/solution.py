class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
        
"""
:type root: TreeNode
:rtype: List[int]
"""
def preorderTraversal(root):
    if not root: return []
    treeNodes = []
    returnList = []

    treeNodes.append(root)

    while treeNodes:
        currentNode = treeNodes.pop()
        returnList.append(currentNode.val)
        if currentNode.right: treeNodes.append(currentNode.right)
        if currentNode.left: treeNodes.append(currentNode.left)
    return returnList