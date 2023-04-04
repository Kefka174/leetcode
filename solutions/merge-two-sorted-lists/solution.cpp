struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
    if (list1 == nullptr) return list2;
    if (list2 == nullptr) return list1;
    ListNode *sortedHead;

    if (list1->val < list2->val) {
        sortedHead = list1;
        list1 = list1->next;
    }
    else {
        sortedHead = list2;
        list2 = list2->next;
    }
    ListNode *sortedIndex = sortedHead;

    while (list1 != nullptr && list2 != nullptr) {
        if (list1->val < list2->val) {
            sortedIndex->next = list1;
            list1 = list1->next;
        }
        else {
            sortedIndex->next = list2;
            list2 = list2->next;
        }
        sortedIndex = sortedIndex->next;
    }
    if (list1 == nullptr) sortedIndex->next = list2;
    else if (list2 == nullptr) sortedIndex->next = list1;
    return sortedHead;
}

int main() {
    return 0;
}