#include <stdint.h>
using namespace std;

int hammingWeight(uint32_t n) {
    int bitCount = 0;
    while (n > 0) {
        bitCount += n % 2;
        n /= 2;
    }
    return bitCount;
}