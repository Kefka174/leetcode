#include <vector>
using namespace std;

int maxProfit(vector<int>& prices) {
    if (prices.size() < 2) return 0;
    int highestProfit = 0;
    int smallestDip = prices[0];

    for (int i = 1; i < prices.size(); i++) {
        if (prices[i] <= prices[i-1]) {
            if (prices[i] < smallestDip) smallestDip = prices[i];
        }
        else { // ith value > i-1th value
            if (prices[i] - smallestDip > highestProfit) highestProfit = prices[i] - smallestDip;
        }
    }
    return highestProfit;
}

int main() {
    return 0;
}