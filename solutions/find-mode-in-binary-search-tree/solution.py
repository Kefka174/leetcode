from typing import Optional, List, Dict

class Solution:
    def findMode(self, root: Optional['TreeNode']) -> List[int]:
        freqMap = self.frequencyMapFromTree(root)
        maxCount, modes = 0, []
        for num in freqMap:
            if freqMap[num] > maxCount:
                maxCount = freqMap[num]
                modes = [num]
            elif freqMap[num] == maxCount:
                modes.append(num)
        return modes

    def frequencyMapFromTree(self, root: 'TreeNode') -> Dict[int, int]:
        nodeStack, freqMap = [root], {}
        while nodeStack:
            currentNode = nodeStack.pop()

            if currentNode.val not in freqMap:
                freqMap[currentNode.val] = 1
            else:
                freqMap[currentNode.val] += 1

            if currentNode.left:
                nodeStack.append(currentNode.left)
            if currentNode.right:
                nodeStack.append(currentNode.right)
                
        return freqMap


# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right