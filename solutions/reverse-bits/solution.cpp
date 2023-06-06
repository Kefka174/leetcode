#include <cstdint>
using namespace std;

uint32_t reverseBits(uint32_t n) {
    uint32_t reversed = 0;
    for (int i = 0; i < 32; i++) {
        if (n & (1 << i)) reversed = reversed | (1 << 31 - i);
    }
    return reversed;
}