#include <vector>
#include <algorithm>
#include <unordered_set>
using namespace std;

bool canMakeArithmeticProgression(vector<int>& arr) { // O(n) time and space
    int minVal = arr[0];
    int maxVal = arr[0];
    for (int i = 1; i < arr.size(); i++) {
        minVal = min(minVal, arr[i]);
        maxVal = max(maxVal, arr[i]);
    }

    if ((maxVal - minVal) % (arr.size() - 1) != 0) return false;
    int minDiff = (maxVal - minVal) / (arr.size() - 1);
    if (minDiff == 0) return true;

    unordered_set<int> diffsUsed; // can be done with O(1) space by swapping values in the original
    for (int i = 0; i < arr.size(); i++) {
        int currentDiff = arr[i] - minVal;
        if (currentDiff % minDiff != 0 || diffsUsed.count(currentDiff)) return false;
        diffsUsed.insert(currentDiff);
    }
    return true;
}

/////////////////////////////////////////////////////////////////
bool canMakeArithmeticProgressionSort(vector<int>& arr) { // O(nlogn)
    sort(arr.begin(), arr.end());
    int diff = arr[1] - arr[0];
    for (int i = 2; i < arr.size(); i++) {
        if (arr[i] - arr[i - 1] != diff) return false;
    }
    return true;
}