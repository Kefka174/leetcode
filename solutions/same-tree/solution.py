class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

"""
:type p: TreeNode
:type q: TreeNode
:rtype: bool
"""
def isSameTreeRecursive(p, q):
    if p == None and q == None: return True

    onlyOneNodeIsNone = (p == None) != (q == None)
    if onlyOneNodeIsNone or p.val != q.val: return False
    
    return isSameTreeRecursive(p.left, q.left) and isSameTreeRecursive(p.right, q.right)