#include <vector>
#include <bitset>
using namespace std;

vector<int> countBits(int n) {
    vector<int> bitCounts;
    for (int i = 0; i < n + 1; i++) bitCounts.push_back(bitset<32>(i).count());
    return bitCounts;
}