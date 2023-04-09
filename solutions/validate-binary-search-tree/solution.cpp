#include <stack>
using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

bool recursiveHelper(TreeNode* root, int* min, int* max) {
    if (root == nullptr) return true;

    if (min != nullptr && root->val <= *min) return false;
    if (max != nullptr && root->val >= *max) return false;

    return recursiveHelper(root->left, min, &root->val) && recursiveHelper(root->right, &root->val, max);
}

bool isValidBSTRecursive(TreeNode* root) {
    int *min = nullptr;
    int *max = nullptr;
    return recursiveHelper(root, min, max);
}

void digLeft(TreeNode* n, stack<TreeNode*> &s) {
    do {
        s.push(n);
        n = n->left;
    } while (n != nullptr);
}

bool isValidBSTIterative(TreeNode* root) {
    stack<TreeNode*> traversalStack;
    stack<TreeNode*> orderedStack;
    digLeft(root, traversalStack);

    while (traversalStack.size() > 0) { // assemble in-order stack
        TreeNode *currentNode = traversalStack.top();
        traversalStack.pop();
        orderedStack.push(currentNode);
        if (currentNode->right) digLeft(currentNode->right, traversalStack);
    }

    while (orderedStack.size() > 1) { // verify orderedStack's values are in order
        TreeNode* currentNode = orderedStack.top();
        orderedStack.pop();
        if (currentNode->val <= orderedStack.top()->val) return false;
    }
    return true;
}