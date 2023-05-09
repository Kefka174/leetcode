#include <vector>
#include <queue>
using namespace std;

int findCircleNum(vector<vector<int>>& isConnected) {
    int numProvinces = 0;
    vector<bool> visitedCities(isConnected.size());
    queue<int> citiesToVisit;

    for (int i = 0; i < isConnected.size(); i++) {
        if (visitedCities[i] == false) {
            numProvinces++;
            citiesToVisit.push(i);
            while (!citiesToVisit.empty()) {
                int currentCity = citiesToVisit.front();
                citiesToVisit.pop();
                for (int j = 0; j < isConnected[currentCity].size(); j++) {
                    if (isConnected[currentCity][j] == 1 && visitedCities[j] == false) {
                        visitedCities[j] = true;
                        citiesToVisit.push(j);
                    }
                }
            }
        }
    }
    return numProvinces;
}