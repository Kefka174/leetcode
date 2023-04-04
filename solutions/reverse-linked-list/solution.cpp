#include <iostream>
using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

ListNode* reverseList(ListNode* head) {
    if (head == nullptr) return head;
    ListNode *listIndex = head->next;
    ListNode *listNextIndex;
    head->next = nullptr;

    while (listIndex != nullptr) {
        listNextIndex = listIndex->next;
        listIndex->next = head;
        head = listIndex;
        listIndex = listNextIndex;
    }
    return head;
}

ListNode* recursiveHelper(ListNode* current, ListNode*& newHead) {
    if (current->next == nullptr){
        newHead = current;
        return current;
    }
    recursiveHelper(current->next, newHead)->next = current;
    return current;
}

ListNode* reverseListRecursive(ListNode* head) {
    if (head == nullptr || head->next == nullptr) return head;
    ListNode *newHead;
    recursiveHelper(head, newHead);
    head->next = nullptr;

    return newHead;
}



void printList(ListNode* head) {
    ListNode *index = head;
    while (index != nullptr) {
        cout << index->val << ", ";
        index = index->next;
    }
}

int main() {
    ListNode *c = new ListNode(3);
    ListNode *b = new ListNode(2, c);
    ListNode *a = new ListNode(1, b);
    printList(reverseList(a));
    return 0;
}