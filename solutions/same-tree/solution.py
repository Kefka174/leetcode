from collections import deque
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
def isSameTreeIterative(p, q):
    nodeQueue = deque()
    nodeQueue.append((p, q))
    while nodeQueue:
        currentP, currentQ = nodeQueue.popleft()
        onlyOneNodeIsNone = (currentP == None) != (currentQ == None)
        if onlyOneNodeIsNone: return False

        if currentP != None: # then currentQ is also not none
            if currentP.val != currentQ.val: return False
            nodeQueue.append((currentP.left, currentQ.left))
            nodeQueue.append((currentP.right, currentQ.right))
    return True


#######################################################################################
def isSameTreeRecursive(p, q):
    if p == None and q == None: return True

    onlyOneNodeIsNone = (p == None) != (q == None)
    if onlyOneNodeIsNone or p.val != q.val: return False

    return isSameTreeRecursive(p.left, q.left) and isSameTreeRecursive(p.right, q.right)