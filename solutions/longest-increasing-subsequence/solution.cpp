#include <vector>
#include <algorithm> // lower_bound
using namespace std;

// Builds the longest subsequence. For each num, replaces subsequence values with the minimum num for that place in the subsequence.
// ex. longestSubsequence = [1,5,8], num = 4. Num can't extend the subsequence, but it can replace the second value to make [1,4,8]
int lengthOfLISBinary(vector<int>& nums) { // O(n*logn)
    vector<int> longestSubsequence {nums[0]};
    for (int num : nums) {
        if (num > longestSubsequence.back()) longestSubsequence.push_back(num);
        else {
            // binary search find iterator to first number in subsequence greater than num
            vector<int>::iterator aboveNumIt = lower_bound(longestSubsequence.begin(), longestSubsequence.end(),num);
            // replace it with num
            *aboveNumIt = num;
        }
    }
    return longestSubsequence.size();
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Builds subsequences by storing the smallest final value of each subsequence length.
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