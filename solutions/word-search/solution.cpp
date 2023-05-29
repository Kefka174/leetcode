#include <vector>
#include <string>
#include <unordered_set>
#include <unordered_map>
#include <stack>
#include <iostream>
using namespace std;

unordered_set<int> checkNeighbors(int, int, char, vector<vector<char>>&);
unordered_map<char, int> count2DVector(vector<vector<char>>);
unordered_map<char, int> countString(string);

// needs refactor
bool exist(vector<vector<char>>& board, string word) { // O(n * w!) where w is the length of word
    unordered_map<char, int> boardCounter = count2DVector(board);
    unordered_map<char, int> wordCounter = countString(word);
    for (auto i = wordCounter.begin(); i != wordCounter.end(); i++) {
        if (boardCounter.count(i->first) == 0 || boardCounter[i->first] < i->second) return false;
    }

    stack<pair<pair<int, int>, unordered_set<int>>> alternatePaths; 
    int charNeededIndex = 0;
    for (int rowNum = 0; rowNum < board.size(); rowNum++) {
        for (int colNum = 0; colNum < board[0].size(); colNum++) {
            if (board[rowNum][colNum] == word[charNeededIndex]) {
                int currentRow = rowNum;
                int currentCol = colNum;
                charNeededIndex++;
                unordered_set<int> possibleNextDirections = checkNeighbors(currentRow, currentCol, word[charNeededIndex], board);
                bool backtracking = false;
                do {
                    if (!possibleNextDirections.empty()) {
                        int direction = *possibleNextDirections.begin();
                        possibleNextDirections.erase(direction);
                        alternatePaths.push({{currentRow, currentCol}, possibleNextDirections});
                        board[currentRow][currentCol] = '0';
                        charNeededIndex++;
                        // update current row and col to next direction
                        if (direction == 0) currentCol++;
                        else if (direction == 1) currentRow++;
                        else if (direction == 2) currentCol --;
                        else currentRow--;
                    }
                    else backtracking = true;

                    if (backtracking) {
                        while (!alternatePaths.empty() && possibleNextDirections.empty()) {
                            charNeededIndex--;
                            currentRow = alternatePaths.top().first.first;
                            currentCol = alternatePaths.top().first.second;
                            possibleNextDirections = alternatePaths.top().second;
                            alternatePaths.pop();
                            if (possibleNextDirections.empty()) board[currentRow][currentCol] = word[charNeededIndex - 1];
                        }
                        backtracking = false;
                    }
                    else possibleNextDirections = checkNeighbors(currentRow, currentCol, word[charNeededIndex], board);

                    if (charNeededIndex == word.length()) return true;
                } while (!alternatePaths.empty() || !possibleNextDirections.empty());

                charNeededIndex = 0;
            }
        }
    }
    return false;
}

unordered_set<int> checkNeighbors(int row, int col, char charNeeded, vector<vector<char>>& board) {
    unordered_set<int> validNeighbors;
    pair<int, int> nextDirection = {0, 1};
    for (int i = 0; i < 4; i++) {
        int neighborRow = row + nextDirection.first;
        int neighborCol = col + nextDirection.second;
        if (neighborRow >= 0 && neighborRow < board.size() && neighborCol >= 0 && neighborCol < board[0].size()) {
            if (board[neighborRow][neighborCol] == charNeeded) validNeighbors.insert(i);
        }
        nextDirection = {nextDirection.second, -nextDirection.first};
    }
    return validNeighbors;
}

unordered_map<char, int> count2DVector(vector<vector<char>> vect) {
    unordered_map<char, int> counts;
    for (vector<char> row : vect) {
        for (char c : row) {
            if (counts.count(c) == 0) counts[c] = 1;
            else counts[c]++;
        }
    }
    return counts;
}

unordered_map<char, int> countString(string s) {
    unordered_map <char, int> counts;
    for (char c : s) {
        if (counts.count(c) == 0) counts[c] = 1;
        else counts[c]++;
    }
    return counts;
}

int main() {
    vector<vector<char>> board;
    board.push_back({'A','B','C','E'});
    board.push_back({'S','F','C','S'});
    board.push_back({'A','D','E','E'});
    cout << exist(board, "ABCCED") << endl; // 1
    // cout << exist(board, "ABCCEF") << endl; // 0
    // cout << exist(board, "SEE") << endl; // 1
    // cout << exist(board, "ABCCFSADEESE") << endl; // 1

    board.clear();
    board.push_back({'A','B','C','E'});
    board.push_back({'S','F','E','S'});
    board.push_back({'A','D','E','E'});
    // cout << exist(board, "ABCEFSADEESE") << endl; // 1

    board.clear();
    board.push_back({'a','b'});
    board.push_back({'c','d'});
    // cout << exist(board, "abcd") << endl; // 0

    board.clear();
    board.push_back({'C','A','A'});
    board.push_back({'A','A','A'});
    board.push_back({'B','C','D'});
    // cout << exist(board, "AAB") << endl; // 1

    board.clear();
    board.push_back({'A','B','C','E'});
    board.push_back({'S','F','E','S'});
    board.push_back({'A','D','E','E'});
    // cout << exist(board, "ABCESEEEFS") << endl; // 1

    return 0;
}