#include <vector>
#include <string>
#include <unordered_set>
using namespace std;

vector<string> wordBreak(string s, vector<string>& wordDict) {
    unordered_set<string> wordSet(wordDict.begin(), wordDict.end());
    vector<vector<string>> memoizedResults {{}};
    return recursiveHelper(s, 0, wordSet, memoizedResults);
}

vector<string> recursiveHelper(string& s, int splitIndex, unordered_set<string>& wordSet, vector<vector<string>>& memoizedResults) {
    vector<string> wordsAtSplit;
    for (int i = 1; i <= s.length() - splitIndex; i++) {
        if (memoizedResults.size() == splitIndex + i || memoizedResults.size() < s.length()) {
            memoizedResults.push_back(wordsAtSplit);
            memoizedResults[splitIndex + i] = recursiveHelper(s, splitIndex + i, wordSet, memoizedResults);
        }
        
        if (memoizedResults[splitIndex + i].size() || splitIndex + i == s.length()) {
            string word = s.substr(splitIndex, i);
            if (wordSet.count(word)) {
                if (splitIndex + i == s.length()) wordsAtSplit.push_back(word);
                else for (string s : memoizedResults[splitIndex + i]) wordsAtSplit.push_back(word + " " + s);
            }
        }
    }
    return wordsAtSplit;
}