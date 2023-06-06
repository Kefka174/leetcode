#include <vector>
using namespace std;

int maxSubArray(vector<int>& nums) {
    int maxTotal = nums[0];
    int subArrayTotal = 0;

    for (int num : nums) {
        subArrayTotal = max(num, subArrayTotal + num);
        maxTotal = max(maxTotal, subArrayTotal);
    }
    return maxTotal;
}