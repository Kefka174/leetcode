class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

"""
:type nums: List[int]
:rtype: TreeNode
"""
def sortedArrayToBST(nums):
    if not nums: return None
    midIndex = len(nums) // 2
    root = TreeNode(nums[midIndex])
    root.left = sortedArrayToBST(nums[:midIndex])
    root.right = sortedArrayToBST(nums[midIndex + 1:])
    return root