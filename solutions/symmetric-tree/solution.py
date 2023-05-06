class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

"""
:type root: TreeNode
:rtype: bool
"""
def isSymmetric(root):
    nodeStack = [(root.left, root.right)]
    while nodeStack:
        left, right = nodeStack.pop()

        onlyOneNodeIsNone = (left == None) != (right == None)
        if onlyOneNodeIsNone: return False

        if left != None: # then right is also not None
            if left.val != right.val: return False
            nodeStack.append((left.left, right.right))
            nodeStack.append((left.right, right.left))
    return True


###################################################################################################
def isSymmetricRecursive(root):
    return twoNodesSymmetric(root.left, root.right)

def twoNodesSymmetric(left, right):
    if left == None and right == None: return True
    elif left == None or right == None or left.val != right.val: return False
    return twoNodesSymmetric(left.left, right.right) and twoNodesSymmetric(left.right, right.left)