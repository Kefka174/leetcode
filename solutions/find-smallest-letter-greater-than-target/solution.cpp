#include <vector>
using namespace std;

char nextGreatestLetterBinary(vector<char>& letters, char target) { // O(logn)
    int startIndex = 0;
    int endIndex = letters.size() - 1;
    while (startIndex <= endIndex) {
        int middleIndex = ((endIndex - startIndex) / 2) + startIndex;
        
        if (letters[middleIndex] <= target) startIndex = middleIndex + 1;
        else endIndex = middleIndex - 1;
    }
    if (startIndex == letters.size()) return letters[0];
    return letters[startIndex];
}


//////////////////////////////////////////////////////////////////////////
char nextGreatestLetterBrute(vector<char>& letters, char target) { // O(n)
    for (char letter : letters) {
        if (letter > target) return letter;
    }
    return letters[0];
}