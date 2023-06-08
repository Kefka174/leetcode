#include <vector>
using namespace std;

int countNegatives(vector<vector<int>>& grid) { // O(n + m)
    int row = grid.size() - 1;
    int col = 0;
    int negativeCount = 0;
    while (row >= 0 && col < grid[0].size()) {
        if (grid[row][col] < 0) {
            row--;
            negativeCount += grid[0].size() - col;
        }
        else col++;
    }
    return negativeCount;
}

////////////////////////////////////////////////////////////////
int countNegativesBrute(vector<vector<int>>& grid) { // O(n * m)
    int negativeCount = grid.size() * grid[0].size();
    for (vector<int> row : grid) {
        int numIndex = 0;
        while (numIndex < row.size() && row[numIndex] >= 0) {
            numIndex++;
            negativeCount--;
        }
    }
    return negativeCount;
}