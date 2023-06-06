#include <vector>
#include <unordered_map>
#include <queue>
using namespace std;

class Node {
public:
    int val;
    vector<Node*> neighbors;
    Node() {
        val = 0;
        neighbors = vector<Node*>();
    }
    Node(int _val) {
        val = _val;
        neighbors = vector<Node*>();
    }
    Node(int _val, vector<Node*> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};

Node* cloneGraph(Node* node) {
    if (node == nullptr) return nullptr;
    Node *first = new Node(node->val);
    unordered_map<int, Node*> nodeMap = {{node->val, first}};
    queue<Node*> nodeQueue;
    nodeQueue.push(node);

    while (!nodeQueue.empty()) {
        Node *currentNode = nodeQueue.front();
        nodeQueue.pop();
        for (Node *neighbor : currentNode->neighbors) {
            if (nodeMap.count(neighbor->val) == 0) {
                nodeMap[neighbor->val] = new Node(neighbor->val);
                nodeQueue.push(neighbor);
            }
            nodeMap[currentNode->val]->neighbors.push_back(nodeMap[neighbor->val]);
        }
    }
    return first;
}