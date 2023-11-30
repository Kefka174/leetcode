from typing import Optional, List

class Solution:
    # Instead of disconnecting right children, could keep nodeStack of (node, parentsAsDigits)
    def sumNumbers(self, root: Optional["TreeNode"]) -> int:
        sum, nodeStack = 0, [root]
        disconnectedRightChildren = []
        while nodeStack:
            while nodeStack[-1].left:
                nodeStack.append(nodeStack[-1].left)

            if (not nodeStack[-1].left) and (not nodeStack[-1].right):
                sum += self.nodesAsDigits(nodeStack)

            while nodeStack and not nodeStack[-1].right:
                nodeStack.pop()
            if nodeStack:
                nodeStack.append(nodeStack[-1].right)
                disconnectedRightChildren.append((nodeStack[-2], nodeStack[-1]))
                nodeStack[-2].right = None

        for parent, rightChild in disconnectedRightChildren:
            parent.right = rightChild

        return sum

    def nodesAsDigits(self, nodeList: List["TreeNode"]) -> int:
        num = 0
        for node in nodeList:
            num *= 10
            num += node.val
        return num


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right