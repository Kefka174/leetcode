class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

"""
:type root: TreeNode
:rtype: int
"""
def diameterOfBinaryTree(root):
    if not root or not (root.left or root.right): return 0
    height, diameter = nodeHeightAndMaxDiameter(root)
    return diameter
    
# returns the node's height and the maximum diameter of it's children
def nodeHeightAndMaxDiameter(node): # return height and maxDiameter
    if not node: return 0, 0
    elif not (node.left or node.right): return 1, 0 # node is a leaf
    else: # node has children
        leftHeight, leftMaxDiameter = nodeHeightAndMaxDiameter(node.left)
        rightHeight, rightMaxDiameter = nodeHeightAndMaxDiameter(node.right)
        currentMaxDiameter = leftHeight + rightHeight
        return max(leftHeight, rightHeight) + 1, max(currentMaxDiameter, leftMaxDiameter, rightMaxDiameter)