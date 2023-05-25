#include <algorithm> // max
using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};


int maxPathSumRecursive(TreeNode* root) {
    pair<int, int> maxRootPaths = recursiveHelper(root);
    return max(maxRootPaths.first, maxRootPaths.second);
}

// Returns pair of (max value of path ending at node) and (max value of path under node)
pair<int, int> recursiveHelper(TreeNode* node) {
    if (node == nullptr) return pair<int, int>(0, 0);

    pair<int, int> leftPaths = recursiveHelper(node->left);
    pair<int, int> rightPaths = recursiveHelper(node->right);
    int maxPathEndingAtNode = node->val;
    int maxPathUnderNode = node->val;

    if (node->left != nullptr) {
        maxPathEndingAtNode = max(maxPathEndingAtNode, leftPaths.first + node->val);
        maxPathUnderNode = max3(maxPathUnderNode, leftPaths.first, leftPaths.second);
    }
    if (node->right != nullptr) {
        maxPathEndingAtNode = max(maxPathEndingAtNode, rightPaths.first + node->val);
        maxPathUnderNode = max3(maxPathUnderNode, rightPaths.first, rightPaths.second);
    }
    if (node->left != nullptr && node->right != nullptr) {
        maxPathUnderNode = max(maxPathUnderNode, leftPaths.first + node->val + rightPaths.first);
    }

    return pair<int, int>(maxPathEndingAtNode, maxPathUnderNode);
}

// Returns the maximum of 3 integers using algorithm's max()
int max3(int first, int second, int third) {
    return max(max(first, second), third);
}