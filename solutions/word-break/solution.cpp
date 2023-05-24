#include <vector>
#include <string>
#include <unordered_set>
using namespace std;

bool wordBreak(string s, vector<string>& wordDict) {
    unordered_set<string> wordSet(wordDict.begin(), wordDict.end());
    vector<bool> memoizedResults {false};
    return recursiveHelper(s, 0, wordSet, memoizedResults);
}

bool recursiveHelper(string& s, int splitIndex, unordered_set<string>& wordSet, vector<bool>& memoizedResults) {
    if (splitIndex == s.length()) return true;
    for (int i = 1; i <= s.length() - splitIndex; i++) {
        if (memoizedResults.size() <= splitIndex + i) {
            memoizedResults.push_back(false);
            memoizedResults[splitIndex + i] = recursiveHelper(s, splitIndex + i, wordSet, memoizedResults);
        }
        if (memoizedResults[splitIndex + i]) {
            string word = s.substr(splitIndex, i);
            if (wordSet.count(word)) return true;
        }
    }
    return false;
}