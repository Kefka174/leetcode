class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

"""
:type head: ListNode
:rtype: ListNode
"""
def sortList(head):
    if head == None or head.next == None: return head
    # find middle
    fastNode = head
    slowNode = head
    midNode = None
    while fastNode.next and fastNode.next.next:
        fastNode = fastNode.next.next
        slowNode = slowNode.next
    mid = slowNode.next
    
    slowNode.next = None # cut off first half of the list
    
    head = sortList(head)
    mid = sortList(mid)
    return mergeLinkedLists(head, mid)

def mergeLinkedLists(leftHead, rightHead):
    # set up head of list
    mergedHead = None
    if leftHead.val < rightHead.val: 
        mergedHead = leftHead
        leftHead = leftHead.next
    else: 
        mergedHead = rightHead
        rightHead = rightHead.next
    mergedIndex = mergedHead

    # merge the bodies of the lists
    while leftHead and rightHead:
        if leftHead.val < rightHead.val:
            mergedIndex.next = leftHead
            leftHead = leftHead.next
        else:
            mergedIndex.next = rightHead
            rightHead = rightHead.next
        mergedIndex = mergedIndex.next

    if rightHead: mergedIndex.next = rightHead
    elif leftHead: mergedIndex.next = leftHead

    return mergedHead