#include <assert.h>
#include <string>
using namespace std;

bool isSubsequence(string s, string t) {
    for (int i = 0; i < s.length(); i++) {
        while (t[i] != s[i]) {
            t.erase(i, 1);
            if (t.length() < s.length()) return false;
        }
    }
    return true;
}

int main() {
    string s1 = "abc", t1 = "ahbgdc";
    assert(isSubsequence(s1, t1));

    string s2 = "axc", t2 = "ahbgdc";
    assert(!isSubsequence(s2, t2));

    string s3 = "b", t3 = "c";
    assert(!isSubsequence(s3, t3));

    return 0;
}