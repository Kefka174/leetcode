#include <vector>
using namespace std;

int uniquePaths(int r, int c) {
    vector<vector<int>> pathsToSpace(r, vector<int>(c, 1)); // could be reduced to one row

    for (int i = 1; i < r; i++) {
        for (int j = 1; j < c; j++) {
            pathsToSpace[i][j] = pathsToSpace[i-1][j] + pathsToSpace[i][j-1];
        }
    }
    return pathsToSpace[r-1][c-1];
}