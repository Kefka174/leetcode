class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
        
"""
:type root: TreeNode
:rtype: int
"""
def maxDepth(root):
    if not root: return 0 # node is None
    elif not (root.left or root.right): return 1 # node is a leaf
    else: # node has children
        leftHeight = maxDepth(root.left)
        rightHeight = maxDepth(root.right)
        return max(leftHeight, rightHeight) + 1