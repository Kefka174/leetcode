#include <queue>
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