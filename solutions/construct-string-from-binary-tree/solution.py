from collections import Optional, deque

class Solution:
    def tree2str(self, root: Optional["TreeNode"]) -> str:
        string, childStack = [], deque()
        nodesSinceRightChild = 0
        currentNode = root
        while currentNode or childStack:
            if not currentNode:
                string.append(')' * nodesSinceRightChild + '(')
                currentNode, nodesSinceRightChild = childStack.pop()
            string.append(str(currentNode.val))

            if currentNode.right:
                childStack.append((currentNode.right, nodesSinceRightChild + 1))
                nodesSinceRightChild = 0
            if currentNode.left or currentNode.right:
                string.append('(')
                nodesSinceRightChild += 1
            currentNode = currentNode.left

        string.append(')' * nodesSinceRightChild)
        return "".join(string)


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right