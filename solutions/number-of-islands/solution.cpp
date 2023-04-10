#include <vector>
#include <queue>
using namespace std;

void exploreLand(vector<vector<char>> &discoveredLand, int row, int col) {
    queue<pair<int, int>> landToExplore;
    landToExplore.push(pair(row, col));
    
    while (!landToExplore.empty()) {
        pair<int, int> currentCoordinates = landToExplore.front();
        landToExplore.pop();
        // mark as discovered
        if (discoveredLand[currentCoordinates.first][currentCoordinates.second] != 'd') {
            discoveredLand[currentCoordinates.first][currentCoordinates.second] = 'd';

            // check cardinally for undiscovered land
            if (currentCoordinates.first > 0 && discoveredLand[currentCoordinates.first - 1][currentCoordinates.second] == '1') { // check above
                landToExplore.push(pair(currentCoordinates.first - 1, currentCoordinates.second));
            }
            if (currentCoordinates.first < discoveredLand.size() - 1 && discoveredLand[currentCoordinates.first + 1][currentCoordinates.second] == '1') { // check below
                landToExplore.push(pair(currentCoordinates.first + 1, currentCoordinates.second));
            }
            if (currentCoordinates.second > 0 && discoveredLand[currentCoordinates.first][currentCoordinates.second - 1] == '1') { // check left
                landToExplore.push(pair(currentCoordinates.first, currentCoordinates.second - 1));
            }
            if (currentCoordinates.second < discoveredLand[currentCoordinates.first].size() - 1 && discoveredLand[currentCoordinates.first][currentCoordinates.second + 1] == '1') { // check right
                landToExplore.push(pair(currentCoordinates.first, currentCoordinates.second + 1));
            }
        }
    }
}

int numIslands(vector<vector<char>>& grid) {
    vector<vector<char>> discoveredLand(grid);
    int islandCount = 0;

    for (int row = 0; row < grid.size(); row++) {
        for (int col = 0; col < grid[row].size(); col++) {
            if (discoveredLand[row][col] == '1') {
                islandCount++;
                exploreLand(discoveredLand, row, col);
            }
        }
    }
    return islandCount;
}

int main() {
    return 0;
}