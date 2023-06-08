#include <vector>
using namespace std;

int countNegatives(vector<vector<int>>& grid) { // O(n * m)
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