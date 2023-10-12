class ListNode:
    def __init__(self, key = 0, val = 0):
        self.key = key
        self.val = val
        self.next = None
        self.prev = None

class LRUCache:
    def __init__(self, capacity: int):
        self.cache = {}
        self.capacity = capacity
        self.linkedListHead = None
        self.linkedListTail = None

    def get(self, key: int) -> int:
        if key not in self.cache:
            return -1
        return self.__insertNode(self.__removeKey(key))

    def put(self, key: int, value: int) -> None:
        node = self.__removeKey(key)
        if node is None:
            node = ListNode(key)
        node.val = value
        self.__insertNode(node)
        
        if len(self.cache) > self.capacity:
            self.__removeKey(self.linkedListTail.key)

    def __removeKey(self, key: int) -> ListNode:
        node = self.cache.pop(key, None)
        if node is not None:
            if node.prev is not None:
                node.prev.next = node.next
            if node.next is not None:
                node.next.prev = node.prev
            
            if node is self.linkedListHead:
                self.linkedListHead = node.next
            if node is self.linkedListTail:
                self.linkedListTail = node.prev
        return node

    def __insertNode(self, node: ListNode) -> int:
        self.cache[node.key] = node
        if self.linkedListTail is None:
            self.linkedListTail = node

        node.prev = None
        if self.linkedListHead is not None:
            self.linkedListHead.prev = node
        node.next = self.linkedListHead
        self.linkedListHead = node

        return node.val