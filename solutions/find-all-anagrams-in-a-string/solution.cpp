#include <vector>
#include <string>
using namespace std;

vector<int> findAnagrams(string s, string p) {
    vector<int> startIndices;
    vector<int> pCharCounts(26);

    for (char c : p) pCharCounts[c-'a']++;

    for (int i = 0; i < s.length(); i++) {
        int pPosition = p.find_first_of(s[i]);
        if (pPosition != string::npos && s.length() - i >= p.length()) {
            vector<int> windowCharCounts(26);
            for (int j = i; j < i + p.length(); j++) {
                windowCharCounts[s[j]-'a']++;
            }
            if (windowCharCounts == pCharCounts) startIndices.push_back(i);
        }
    }
    return startIndices;
}