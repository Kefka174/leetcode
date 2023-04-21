class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

"""
:type head: ListNode
:rtype: bool
"""
def isPalindrome(self, head): # reverses the first half of the list and uses Floyd's cycle detection to find the middle
    fastNode = head
    slowNode = head
    prevSlowNode = None
    while fastNode and fastNode.next:
        fastNode = fastNode.next.next

        nextSlowNode = slowNode.next
        slowNode.next = prevSlowNode
        prevSlowNode = slowNode
        slowNode = nextSlowNode

    if fastNode: fastNode = slowNode.next # odd number of nodes
    else: fastNode = slowNode # even number of nodes
    slowNode = prevSlowNode
    
    while slowNode:
        if slowNode.val != fastNode.val: return False
        slowNode = slowNode.next
        fastNode = fastNode.next
    return True