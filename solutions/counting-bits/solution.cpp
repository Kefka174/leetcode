#include <vector>
#include <bitset>
#include <cmath> // pow(), log2()
using namespace std;

vector<int> countBitsManual(int n) { // O(n*logn)
    vector<int> bitCounts {0};
    for (int i = 1; i < n + 1; i++) {
        int iVal = i;
        int iBitCount = 0;
        for (int bit = ceil(log2(i)) + 1; bit >= 0 && iVal != 0; bit--) {
            if (iVal >= pow(2, bit)) {
                iVal -= pow(2, bit);
                iBitCount++;
            }
        }
        bitCounts.push_back(iBitCount);
    }
    return bitCounts;
}

///////////////////////////////////////////////////////////////////////////////
vector<int> countBitsBuiltIn(int n) {
    vector<int> bitCounts;
    for (int i = 0; i < n + 1; i++) bitCounts.push_back(bitset<32>(i).count());
    return bitCounts;
}