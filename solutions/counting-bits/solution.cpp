#include <vector>
#include <bitset>
#include <cmath> // pow(), log2()
using namespace std;

// Dividing an integer by 2 shifts its bits to the right, so any integer x has the same number of set bits as x/2 
// plus the least-significant-bit lost in the shift. If x is odd, then the lsb was set to 1.
vector<int> countBitsManual(int n) { // O(n)
    vector<int> bitCounts {0};
    for (int i = 1; i < n + 1; i++) {
        int iBitCount = bitCounts[i / 2] + (i % 2);
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