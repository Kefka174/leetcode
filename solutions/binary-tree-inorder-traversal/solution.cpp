#include <vector>
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

void digLeft(TreeNode* n, stack<TreeNode*> &s) {
    do {
        s.push(n);
        n = n->left;
    } while (n != nullptr);
}

vector<int> inorderTraversal(TreeNode* root) {
    vector<int> ordered;
    if (root == nullptr) return ordered;
    stack<TreeNode*> traversalStack;
    digLeft(root, traversalStack);

    while (traversalStack.size() > 0) { // assemble in-order stack
        TreeNode *currentNode = traversalStack.top();
        traversalStack.pop();
        ordered.push_back(currentNode->val);
        if (currentNode->right) digLeft(currentNode->right, traversalStack);
    }
    return ordered;
}

vector<int> inorderTraversalRecursive(TreeNode* root) {
    vector<int> ordered;
    if (root == nullptr) return ordered;
    
    vector<int> left = inorderTraversalRecursive(root->left);
    vector<int> right = inorderTraversalRecursive(root->right);
    
    ordered.insert(ordered.end(), left.begin(), left.end());
    ordered.push_back(root->val);
    ordered.insert(ordered.end(), right.begin(), right.end());

    return ordered;
}