#include <vector>
#include <queue>
using namespace std;

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