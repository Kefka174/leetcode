from typing import List, Optional

class Solution:
    def largestValues(self, root: Optional['TreeNode']) -> List[int]:
        levelValues = []
        if root != None:
            nodeStack, nextLevelNodes = [root], []
            maxLevelVal = root.val
            while nodeStack:
                if nodeStack[-1].right:
                    nextLevelNodes.append(nodeStack[-1].right)
                if nodeStack[-1].left:
                    nextLevelNodes.append(nodeStack[-1].left)
                maxLevelVal = max(maxLevelVal, nodeStack[-1].val)
                nodeStack.pop()

                if not nodeStack:
                    nodeStack, nextLevelNodes = nextLevelNodes, []
                    levelValues.append(maxLevelVal)
                    maxLevelVal = float("-inf")

        return levelValues


# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right