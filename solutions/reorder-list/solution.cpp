struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

// splits the list in two in the middle, reverses the back half list, weaves the two lists together
void reorderList(ListNode* head) {
    // find middle of list
    ListNode *fastIndex = head;
    ListNode *slowIndex = head;
    ListNode *previousSlowIndex;
    
    while (fastIndex != nullptr && fastIndex->next != nullptr) {
        fastIndex = fastIndex->next->next;
        previousSlowIndex = slowIndex;
        slowIndex = slowIndex->next;
    }
    if (slowIndex->next == nullptr) return; // less than 3 nodes in list

    // cut off the end of the first-half list
    previousSlowIndex->next = nullptr;
    previousSlowIndex = nullptr;

    // reverse back half
    while (slowIndex != nullptr) {
        ListNode *nextSlowIndex = slowIndex->next;
        slowIndex->next = previousSlowIndex;
        previousSlowIndex = slowIndex;
        slowIndex = nextSlowIndex;
    }

    // build new list
    ListNode *forwardIndex = head;
    ListNode *reverseIndex = previousSlowIndex;
    ListNode *nextForward, *nextReverse;
    while (forwardIndex != nullptr) {
        nextForward = forwardIndex->next;
        nextReverse = reverseIndex->next;

        forwardIndex->next = reverseIndex;
        forwardIndex = nextForward;
        if (forwardIndex != nullptr) reverseIndex->next = forwardIndex;
        reverseIndex = nextReverse;
    }
}