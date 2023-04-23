class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
        
"""
:type root: TreeNode
:rtype: bool
"""
def isBalanced(root):
    if not root: return True
    if balancedTreeHeight(root) == -1: return False
    return True

# returns -1 if node is unbalanced
def balancedTreeHeight(node):
    if not node: return 0 # node is None
    elif not (node.left or node.right): return 1 # node is a leaf
    else: # node has children
        leftHeight = balancedTreeHeight(node.left)
        rightHeight = balancedTreeHeight(node.right)
        if leftHeight == -1 or rightHeight == -1: return -1
        
        if leftHeight - rightHeight < 2 and rightHeight - leftHeight < 2:
            return max(leftHeight, rightHeight) + 1
        else: return -1