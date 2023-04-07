#include <iostream>
#include <vector>
#include <stack>
using namespace std;

class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val) {
        val = _val;
    }

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};

vector<int> preorderRecursive(Node* root) {
    if (root == nullptr) return vector<int>();
    if (root->children.size() == 0) return vector<int>(1, root->val);

    vector<int> rootVals = {root->val};
    for (auto child : root->children) {
        vector<int> childrenVals = preorderRecursive(child);
        for (auto val : childrenVals) rootVals.push_back(val);
    }
    return rootVals;
}

vector<int> preorderIterative(Node* root) {
    if (root == nullptr) return vector<int>();
    vector<int> vals;
    stack<Node*> nodeStack;
    nodeStack.push(root);

    while (nodeStack.size() > 0) {
        Node* currentNode = nodeStack.top();
        nodeStack.pop();
        vals.push_back(currentNode->val);
        
        for (auto childIterator = currentNode->children.rbegin(); childIterator != currentNode->children.rend(); childIterator++) nodeStack.push(*childIterator);
    }
    return vals;
}