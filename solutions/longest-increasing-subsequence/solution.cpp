#include <vector>
using namespace std;

int lengthOfLIS(vector<int>& nums) { // O(n*l) where l is the length of the longest subsequence
    vector<int> finalValInSubsequenceOfLengthI {nums[0]};
    for (int num : nums) {
        if (num <= finalValInSubsequenceOfLengthI[0]) finalValInSubsequenceOfLengthI[0] = num;
        else { // num can be part of an existing subsequence
            int subsequenceLength = finalValInSubsequenceOfLengthI.size();
            while (num <= finalValInSubsequenceOfLengthI[subsequenceLength - 1]) subsequenceLength--;

            if (subsequenceLength == finalValInSubsequenceOfLengthI.size()) finalValInSubsequenceOfLengthI.push_back(num);
            else if (num < finalValInSubsequenceOfLengthI[subsequenceLength]) finalValInSubsequenceOfLengthI[subsequenceLength] = num;
        }
    }
    return finalValInSubsequenceOfLengthI.size();
}