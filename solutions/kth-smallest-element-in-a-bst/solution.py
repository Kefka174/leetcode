class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

"""
:type root: TreeNode
:type k: int
:rtype: int
"""
def kthSmallest(root, k): # in-order traversal
    nodeStack = []
    nodeIndex = root
    while nodeIndex or nodeStack:
        while nodeIndex:
            nodeStack.append(nodeIndex)
            nodeIndex = nodeIndex.left

        nodeIndex = nodeStack.pop()
        
        k -= 1
        if k == 0: return nodeIndex.val
        
        nodeIndex = nodeIndex.right