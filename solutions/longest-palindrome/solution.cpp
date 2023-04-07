#include <iostream>
#include <string>
#include <map>
using namespace std;

int longestPalindrome(string s) {
    map<char, int> charCount;
    bool singleCharTaken = false;
    int palindromeLength = 0;

    for (int i = 0; i < s.length(); i++) charCount[s[i]]++;
    
    for (auto i : charCount) {
        palindromeLength += (i.second / 2) * 2; // integer division
        if (i.second % 2 == 1 && !singleCharTaken) { // a single character can sit in the middle of the palindrome
            singleCharTaken = true;
            palindromeLength++;
        }
    }
    return palindromeLength;
}

int main() {
    string s1 = "abccccdd";
    cout << longestPalindrome(s1) << "\n";

    string s2 = "a";
    cout << longestPalindrome(s2) << "\n";
}