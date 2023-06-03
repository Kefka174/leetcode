#include <vector>
using namespace std;

int maxSubArray(vector<int>& nums) {
    int maxTotal = nums[0];
    bool inSubArray = false;
    int subArrayTotal;

    for (int num : nums) {
        if (inSubArray) {
            subArrayTotal += num;
            if (subArrayTotal > maxTotal) maxTotal = subArrayTotal;
            if (subArrayTotal < 0) inSubArray = false;
        }
        else {
            if (num > maxTotal) maxTotal = num;
            if (num > 0) {
                inSubArray = true;
                subArrayTotal = num;
            }
        }
    }
    return maxTotal;
}