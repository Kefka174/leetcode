class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

"""
:type head: ListNode
:rtype: ListNode
"""
def oddEvenList(self, head):
    if head == None: return head
    evenNode = head
    oddNode = head.next
    oddHead = oddNode

    while oddNode and oddNode.next:
        evenNode.next = oddNode.next
        evenNode = evenNode.next

        oddNode.next = evenNode.next
        oddNode = oddNode.next
    evenNode.next = oddHead
    return head