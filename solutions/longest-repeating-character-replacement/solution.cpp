#include <string>
using namespace std;

int characterReplacement(string s, int k) {
    int longestLength = 1;
    for (int i = 0; i < s.length(); i++) {
        int replacements = k;
        int substringStart = i;
        int substringStop = i + 1;
        while (substringStop < s.length() && (replacements > 0 || s[substringStop] == s[i])) {
            if (replacements > 0 && s[substringStop] != s[i]) replacements--;
            substringStop++;
        }
        if (replacements > 0) { // reached the far right but could still replace to the left
            while (substringStart > 0 && (replacements > 0 || s[substringStart - 1] == s[i])) {
                if (replacements > 0 && s[substringStart - 1] != s[i]) replacements--;
                substringStart--;
            }
        }
        if (substringStop - substringStart > longestLength) longestLength = substringStop - substringStart;
    }
    return longestLength;
}