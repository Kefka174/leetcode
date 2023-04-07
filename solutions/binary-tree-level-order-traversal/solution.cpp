#include <vector>
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

vector<vector<int>> levelOrder(TreeNode* root) {
    if (root == nullptr) return vector<vector<int>>();
    vector<vector<int>> vals;
    queue<TreeNode*> nodeQueue;
    int nextLevelNodeCount = 1;
    int currentLevelNodeCount = 0;
    nodeQueue.push(root);

    while (nextLevelNodeCount != 0) { // for each level
        currentLevelNodeCount = nextLevelNodeCount;
        nextLevelNodeCount = 0;
        vector<int> levelVals;
        while (currentLevelNodeCount > 0) { // for each node in the level
            TreeNode* currentNode = nodeQueue.front();
            nodeQueue.pop();
            levelVals.push_back(currentNode->val);

            if (currentNode->left != nullptr) {
                nodeQueue.push(currentNode->left);
                nextLevelNodeCount++;
            }
            if (currentNode->right != nullptr) {
                nodeQueue.push(currentNode->right);
                nextLevelNodeCount++;
            }

            currentLevelNodeCount--;
        }
        vals.push_back(levelVals);
    }
    return vals;
}