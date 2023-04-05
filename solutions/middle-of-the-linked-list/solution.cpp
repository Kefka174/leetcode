struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

ListNode* middleNode(ListNode* head) {
    ListNode *listIndex = head;
    ListNode *middleIndex;
    int i = 0;

    while (listIndex != nullptr) {
        listIndex = listIndex->next;
        if (i % 2 == 1) middleIndex = middleIndex->next;
        i++;
    }
    return middleIndex;
}