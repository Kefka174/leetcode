class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

"""
:type root: TreeNode
:type targetSum: int
:rtype: int
"""
def pathSumRecursive(root, targetSum): # o(n^2)
    return recursiveHelper(root, targetSum, False)

def recursiveHelper(node, targetSum, pathStarted):
    if not node: return 0
    total = 0
    if targetSum - node.val == 0: total += 1
    if not pathStarted:
        total += recursiveHelper(node.left, targetSum, False)
        total += recursiveHelper(node.right, targetSum, False)
    
    total += recursiveHelper(node.left, targetSum - node.val, True)
    total += recursiveHelper(node.right, targetSum - node.val, True)
    return total