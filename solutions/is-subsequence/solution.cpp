#include <assert.h>
#include <string>
using namespace std;

bool isSubsequence(string s, string t) {\
    int i, j;
    for (i = 0, j = 0; i < s.length(); i++, j++) {
        while (t[j] != s[i]) {
            j++;
            if (j > t.length()) return false;
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

    string s4 = "aaaaaa", t4 = "bbaaaa";
    assert(!isSubsequence(s4, t4));

    return 0;
}