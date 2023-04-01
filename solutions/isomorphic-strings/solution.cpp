#include <assert.h>
#include <string>
#include <map>
using namespace std;

bool isIsomorphic(string s, string t) {
    map<char, char> charMap;
    map<char, bool> duplicationCheck;
    for (int i = 0; i < s.length(); i++) {
        // if not mapped, set mapping
        if (charMap.count(s[i]) == 0) {
            if (duplicationCheck.count(t[i]) > 0) return false;

            charMap[s[i]] = t[i];
            duplicationCheck[t[i]] = true;
        }
        // else check if mapping fits
        else if (charMap[s[i]] != t[i]) return false;
    }
    return true;
}

int main() {
    string s1 = "egg", t1 = "add";
    assert(isIsomorphic(s1, t1));

    string s2 = "foo", t2 = "bar";
    assert(!isIsomorphic(s2, t2));

    string s3 = "paper", t3 = "title";
    assert(isIsomorphic(s3, t3));

    string s4 = "babc", t4 = "baba";
    assert(!isIsomorphic(s4, t4));

    string s5 = "leet", t5 = "ella";
    assert(isIsomorphic(s5, t5));

    return 0;
}