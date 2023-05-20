#include <vector>
#include <string>
#include <unordered_map>
#include <algorithm>
using namespace std;

vector<vector<string>> groupAnagramsSorting(vector<string>& strs) {
    vector<vector<string>> anagrams;
    unordered_map<string, int> strGroups;

    for (string s : strs) {
        string sortedS = s;
        sort(sortedS.begin(), sortedS.end());
        
        if (strGroups.count(sortedS)) anagrams[strGroups[sortedS]].push_back(s);
        else {
            strGroups[sortedS] = anagrams.size();
            anagrams.push_back(vector<string> {s});
        }
    }
    return anagrams;
}


///////////////////////////////////////////////////////////////////////////////
vector<vector<string>> groupAnagrams(vector<string>& strs) {
    vector<vector<string>> anagrams;
    vector<unordered_map<char, int>> strGroups;

    for (string s : strs) {
        unordered_map<char, int> sChars = charCounter(s);
        int sGroup = -1;

        for (int i = 0; i < strGroups.size() && sGroup == -1; i++) {
            if (sChars == strGroups[i]) sGroup = i;
        }
        
        if (sGroup != -1) anagrams[sGroup].push_back(s);
        else {
            anagrams.push_back(vector<string> {s});
            strGroups.push_back(sChars);
        }
    }
    return anagrams;
}

unordered_map<char, int> charCounter(string& str) {
    unordered_map<char, int> sChars;
    for (char c : str) {
        if (sChars.count(c)) sChars[c]++;
        else sChars[c] = 1;
    }
    return sChars;
}