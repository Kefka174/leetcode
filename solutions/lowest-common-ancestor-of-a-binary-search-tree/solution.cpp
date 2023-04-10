struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
};

TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
    TreeNode* currentNode = root;
    while (currentNode != p && currentNode != q) {
        if (p->val < currentNode->val && q->val < currentNode->val) currentNode = currentNode->left;
        else if (p->val > currentNode->val && q->val > currentNode->val) currentNode = currentNode->right;
        else return currentNode;
    }
    
    return currentNode;
}