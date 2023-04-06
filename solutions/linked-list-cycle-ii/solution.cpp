struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(nullptr) {}
};

// Using Floyd's Cycle Finding algorithm
ListNode *detectCycleFloyd(ListNode *head) {
    ListNode *slowIndex = head;
    ListNode *fastIndex = head;

    while (fastIndex != nullptr && fastIndex->next != nullptr) {
        fastIndex = fastIndex->next->next;
        slowIndex = slowIndex->next;
        
        if (fastIndex == slowIndex) {
            slowIndex = head;
            while (fastIndex != slowIndex) {
                fastIndex = fastIndex->next;
                slowIndex = slowIndex->next;
            }
            return fastIndex;
        }
    }
    return nullptr;
}

// Traversing the list multiple times, constant memory but quadratic runtime
ListNode *detectCycle(ListNode *head) {
    ListNode *slowIndex = head;
    ListNode *fastIndex = head;

    while (slowIndex != nullptr) {
        fastIndex = head;
        while (fastIndex != slowIndex) {
            if (fastIndex == slowIndex->next) return fastIndex;
            fastIndex = fastIndex->next;
        }
        if (slowIndex->next == slowIndex) return slowIndex;
        slowIndex = slowIndex->next;
    }
    return nullptr;
}