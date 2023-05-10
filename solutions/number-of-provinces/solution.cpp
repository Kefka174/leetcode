#include <vector>
#include <queue>
using namespace std;

int findCircleNumUnionFind(vector<vector<int>>& isConnected) {
    vector<int> groupLeader(isConnected.size());
    for (int i = 0; i < groupLeader.size(); i++) groupLeader[i] = i;
    int numProvinces = groupLeader.size();

    // Find unions between the group leaders
    for (int i = 0; i < isConnected.size(); i++) {
        for (int j = i + 1; j < isConnected.size(); j++) {
            if (isConnected[i][j] == 1) {
                int iLeader = findLeader(i, groupLeader);
                int jLeader = findLeader(j, groupLeader);
                if (iLeader != jLeader){
                    groupLeader[jLeader] = iLeader;
                    numProvinces--;
                }
            }
        }
    }
    return numProvinces;
}

int findLeader(int node, vector<int>& groupLeader) {
    if (groupLeader[node] == node) return node;
    return findLeader(groupLeader[node], groupLeader);
}


///////////////////////////////////////////////////////////////////////////////////////////
int findCircleNumDFS(vector<vector<int>>& isConnected) { // O(n^2)
    int numProvinces = 0;
    vector<bool> visitedCities(isConnected.size());

    for (int i = 0; i < isConnected.size(); i++) {
        if (visitedCities[i] == false) {
            numProvinces++;
            dfs(i, isConnected, visitedCities);
        }
    }
    return numProvinces;
}

void dfs(int startingNode, vector<vector<int>> graph, vector<bool>& visitedNodes) {
    queue<int> citiesToVisit;
    citiesToVisit.push(startingNode);
    while (!citiesToVisit.empty()) {
        int currentCity = citiesToVisit.front();
        citiesToVisit.pop();
        for (int i = 0; i < graph[currentCity].size(); i++) {
            if (graph[currentCity][i] == 1 && visitedNodes[i] == false) {
                visitedNodes[i] = true;
                citiesToVisit.push(i);
            }
        }
    }
}