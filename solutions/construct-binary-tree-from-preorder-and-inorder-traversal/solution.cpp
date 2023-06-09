#include <vector>
#include <map>
#include <stack>
#include <tuple>
#include <unordered_map>
using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};


// Iterative implementation of the recursive solution below
TreeNode* buildTreeIterative(vector<int>& preorder, vector<int>& inorder) { // O(n)
    unordered_map<int, int> valInorderIndexes;
    for (int i = 0; i < inorder.size(); i++) valInorderIndexes[inorder[i]] = i;

    TreeNode *nodeParent, *head = nullptr;
    int inorderStartIndex = 0;
    int inorderEndIndex = inorder.size() - 1;
    vector<int>::iterator preorderIterator = preorder.begin()++;
    stack<tuple<TreeNode*, int, int>> rightChildrenToProcess;
    while (inorderStartIndex <= inorderEndIndex || !rightChildrenToProcess.empty()) {
        TreeNode *currentNode = new TreeNode(*preorderIterator);
        int currentInorderIndex = valInorderIndexes[*preorderIterator];
        preorderIterator++;

        if (head == nullptr) head = currentNode;
        else { // need to attach to parent
            if (inorderStartIndex > inorderEndIndex) {
                tie(nodeParent, inorderStartIndex, inorderEndIndex) = rightChildrenToProcess.top();
                rightChildrenToProcess.pop();
                nodeParent->right = currentNode;
            }
            else nodeParent->left = currentNode;
        }

        if (currentInorderIndex < inorderEndIndex) { // currentNode has right children
            rightChildrenToProcess.push({currentNode, currentInorderIndex + 1, inorderEndIndex});
        }

        nodeParent = currentNode;
        inorderEndIndex = currentInorderIndex - 1;
    }

    return head;
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Creates nodes in the order of the preorder traversal. When a node is created, the inorder traversal list is split at that node.
// The left part of the split inorder list become that node's left children, the right part of the split list become its right children.
TreeNode* buildTreeRecursive(vector<int>& preorder, vector<int>& inorder) { // O(n)
    unordered_map<int, int> valInorderIndexes;
    for (int i = 0; i < inorder.size(); i++) valInorderIndexes[inorder[i]] = i;
    vector<int>::iterator preorderIterator = preorder.begin();

    return recursiveHelper(preorderIterator, valInorderIndexes, 0, inorder.size() - 1);
}

TreeNode* recursiveHelper(vector<int>::iterator& preorderIterator, unordered_map<int, int>& valInorderIndexes, 
                            int inorderStartIndex, int inorderEndIndex) {
    TreeNode *head = new TreeNode(*preorderIterator);
    int headInorderIndex = valInorderIndexes[*preorderIterator];
    preorderIterator++;
    if (headInorderIndex > inorderStartIndex) {
        head->left = recursiveHelper(preorderIterator, valInorderIndexes, inorderStartIndex, headInorderIndex - 1);
    }
    if (headInorderIndex < inorderEndIndex) {
        head->right = recursiveHelper(preorderIterator, valInorderIndexes, headInorderIndex + 1, inorderEndIndex);
    }
    return head;
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Creates nodes in the order of the preorder traversal and stores them in a map according to their inorder traversal ordering.
// When a node is created, its parent is looked up in the map (takes logn time) and is connected to the new node.
TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {// O(nlogn)
    unordered_map<int, int> valInorderIndexes;
    for (int i = 0; i < inorder.size(); i++) valInorderIndexes[inorder[i]] = i;
    
    TreeNode *head;
    map<int, TreeNode*> inorderNodes;
    int previousInorderIndex;
    for (int val : preorder) {
        TreeNode *valNode = new TreeNode(val);

        if (inorderNodes.size() == 0) head = valNode;
        else { // find and connect parent O(logn)
            map<int, TreeNode*>::iterator parentIterator = inorderNodes.upper_bound(valInorderIndexes[val]);
            if (valInorderIndexes[val] > previousInorderIndex) {
                parentIterator--;
                parentIterator->second->right = valNode;
            }
            else parentIterator->second->left = valNode;
        }

        inorderNodes[valInorderIndexes[val]] = valNode;
        previousInorderIndex = valInorderIndexes[val];
    }

    return head;
}


// test cases: preorder, inorder
// [1,2,3], [2,3,1]
// [1,2,4,3], [1,2,3,4]
// [1,2,3,4,5,9,6,7,8], [3,2,4,1,9,5,6,8,7]
// [8,3,1,6,4,7,10,14,13], [1,3,4,6,7,8,10,13,14]
// [1,2,5,6,3], [5,2,6,1,3]