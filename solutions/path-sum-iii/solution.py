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


#####################################################

def pathSum(root, targetSum): # o(n) time and space
    return pathsInBranch(root, targetSum, 0, {0:1})

def pathsInBranch(node, targetSum, sumFromRootToNode, branchSums):
    if not node: return 0
    total = 0
    # check if a valid path ends at current node
    pathSumNeeded = sumFromRootToNode + node.val - targetSum
    if pathSumNeeded in branchSums: total += branchSums[pathSumNeeded]
    
    # add node to branchSums as a potential start of path
    branchSums[sumFromRootToNode + node.val] = branchSums.get(sumFromRootToNode + node.val, 0) + 1
    # visit children
    total += pathsInBranch(node.left, targetSum, sumFromRootToNode + node.val, branchSums)
    total += pathsInBranch(node.right, targetSum, sumFromRootToNode + node.val, branchSums)
    # remove node from branchSums as a potential start of path so it won't affect other branches
    branchSums[sumFromRootToNode + node.val] -= 1
    if branchSums[sumFromRootToNode + node.val] == 0: branchSums.pop(sumFromRootToNode + node.val)

    return total