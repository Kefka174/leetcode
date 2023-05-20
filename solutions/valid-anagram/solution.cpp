#include <string>
#include <unordered_map>
using namespace std;

bool isAnagram(string s, string t) {
    unordered_map<char, int> sChars;
    for (char c : s) {
        if (sChars.count(c)) sChars[c]++;
        else sChars[c] = 1;
    }

    for (char c : t) {
        if (!sChars[c]) return false;
        sChars[c]--;
        if (sChars[c] == 0) sChars.erase(c);
    }
    
    return sChars.empty();
}