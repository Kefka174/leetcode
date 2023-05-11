#include <vector>
#include <unordered_map>
using namespace std;

int removeStones(vector<vector<int>>& stones) {
    vector<int> stoneGroups(stones.size());
    for (int i = 0; i < stoneGroups.size(); i++) stoneGroups[i] = i;
    unordered_map<int, int> rowsWithStones;
    unordered_map<int, int> colsWithStones;
    int stonesRemoved = 0;

    // for each stone, set it as the leader of it's row and column
    // if there is already another stone in the current stone's row or column, it can be removed
    for (int i = 0; i < stones.size(); i++) {
        int currentStoneRow = stones[i][1];
        int currentStoneCol = stones[i][0];
        if (rowsWithStones.count(currentStoneRow)) {
            int rowLeader = findGroupLeader(rowsWithStones[currentStoneRow], stoneGroups);
            stoneGroups[rowLeader] = i;
            stonesRemoved++;
        }
        if (colsWithStones.count(currentStoneCol)) {
            int colLeader = findGroupLeader(colsWithStones[currentStoneCol], stoneGroups);
            if (stoneGroups[colLeader] != i) {
                stonesRemoved++;
                stoneGroups[colLeader] = i;
            }
        }
        rowsWithStones[currentStoneRow] = i;
        colsWithStones[currentStoneCol] = i;
    }
    return stonesRemoved;
}

int findGroupLeader(int stoneNum, vector<int>& stoneGroups) {
    if (stoneGroups[stoneNum] == stoneNum) return stoneNum;
    return findGroupLeader(stoneGroups[stoneNum], stoneGroups);
}