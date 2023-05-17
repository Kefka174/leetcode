// function declarations
void reorderList(ListNode*);
ListNode* middleOfLinkedList(ListNode*);
ListNode* reverseLinkedList(ListNode*);
void weaveLinkedLists(ListNode*, ListNode*);


struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};


// Splits the list in the middle, reverses the back half list, weaves the front and reversed-back halves together
void reorderList(ListNode* head) {
    ListNode *backHalfHead = middleOfLinkedList(head);

    // return if there aren't enough nodes to warrant reordering ( <= 2 nodes)
    if (backHalfHead->next == nullptr) return;

    // cut off the end of the first-half list
    ListNode *tmp = backHalfHead->next;
    backHalfHead->next = nullptr;
    backHalfHead = tmp;

    backHalfHead = reverseLinkedList(backHalfHead);

    weaveLinkedLists(head, backHalfHead);
}

// Returns a pointer to the middle of a linked list
// for an even number of nodes, returns the first median
ListNode* middleOfLinkedList(ListNode* head) {
    ListNode *fastIndex = head;
    ListNode *slowIndex = head;

    while (fastIndex->next != nullptr && fastIndex->next->next != nullptr) {
        fastIndex = fastIndex->next->next;
        slowIndex = slowIndex->next;
    }
    return slowIndex;
}

// Reverses a linked-list and returns the new head
ListNode* reverseLinkedList(ListNode* head) {
    ListNode *index = head;
    ListNode *nextIndex, *previousIndex = nullptr;

    while (index != nullptr) {
        nextIndex = index->next;
        index->next = previousIndex;
        previousIndex = index;
        index = nextIndex;
    }
    return previousIndex;
}

// Merges two linked lists into one list with alternating elements [listA[0], listB[0], listA[1], listB[1], ...]
// *headA points to the head of the new list
void weaveLinkedLists(ListNode* headA, ListNode* headB) {
    ListNode *aIndex = headA;
    ListNode *bIndex = headB;
    ListNode *nextAIndex, *nextBIndex;
    while (aIndex != nullptr && bIndex != nullptr) {
        nextAIndex = aIndex->next;
        nextBIndex = bIndex->next;

        aIndex->next = bIndex;
        bIndex->next = nextAIndex;
        aIndex = nextAIndex;
        bIndex = nextBIndex;
    }
}