#include <vector>
using namespace std;

vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
    return recursiveHelper(candidates, 0, target);
}

vector<vector<int>> recursiveHelper(vector<int>& candidates, int startingIndex, int target) {
    vector<vector<int>> combinations;
    for (int i = startingIndex; i < candidates.size(); i++) {
        if (candidates[i] < target) {
            vector<vector<int>> combosUsingCandidate = recursiveHelper(candidates, i, target - candidates[i]);
            for (vector<int>& combo : combosUsingCandidate) combo.push_back(candidates[i]);
            combinations.insert(combinations.end(), combosUsingCandidate.begin(), combosUsingCandidate.end());
        }
        else if (candidates[i] == target) {
            vector<int> singleCandidate{candidates[i]};
            combinations.push_back(singleCandidate);
        }
    }
    return combinations;
}