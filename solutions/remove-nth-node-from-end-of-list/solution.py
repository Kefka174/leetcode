class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

"""
:type head: ListNode
:type n: int
:rtype: ListNode
"""
def removeNthFromEnd(self, head, n):
    endPointer = head
    nPointer = head
    travelCounter = 0
    while endPointer != None:
        if travelCounter > n: nPointer = nPointer.next
        endPointer = endPointer.next
        travelCounter += 1
    if travelCounter == n: return head.next
    nPointer.next = nPointer.next.next
    return head