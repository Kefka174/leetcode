#include <iostream>
#include <vector>
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

void printIntVector(vector<int> v) {
    for (int val : v) cout << val << ", ";
    cout << "\n";
}

void printNodeVector(vector<Node*> v) {
    for (Node* node : v) cout << node->val << ", ";
}

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