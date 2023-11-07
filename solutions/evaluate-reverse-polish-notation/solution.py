from typing import List
from collections import deque

class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = deque()
        for token in reversed(tokens):
            if token not in "+-*/":
                token = int(token)
                while stack and isinstance(stack[-1], int):
                    val = stack.pop()
                    op = stack.pop()
                    token = self.performOperation(token, op, val)
            stack.append(token)
        return stack.pop()
        
    def performOperation(self, val1: int, operation: str, val2: int) -> int:
        match operation:
            case '+':
                return val1 + val2
            case '-':
                return val1 - val2
            case '*':
                return val1 * val2
            case '/':
                return int(val1 / val2)