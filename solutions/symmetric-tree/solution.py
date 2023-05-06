class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

"""
:type root: TreeNode
:rtype: bool
"""
def isSymmetricRecursive(root):
    return twoNodesSymmetric(root.left, root.right)

def twoNodesSymmetric(left, right):
    if left == None and right == None: return True
    elif left == None or right == None or left.val != right.val: return False
    return twoNodesSymmetric(left.left, right.right) and twoNodesSymmetric(left.right, right.left)