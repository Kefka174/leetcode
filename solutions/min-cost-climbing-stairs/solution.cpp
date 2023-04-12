#include <vector>
using namespace std;

int minCostClimbingStairs(vector<int>& cost) {
    vector<int> minCostToStep(cost.size() + 1);

    for (int i = 2; i < cost.size() + 1; i++) {
        int singleStepCost = minCostToStep[i-1] + cost[i-1];
        int doubleStepCost = minCostToStep[i-2] + cost[i-2];
        if (singleStepCost < doubleStepCost) minCostToStep[i] = singleStepCost;
        else minCostToStep[i] = doubleStepCost;
    }
    return minCostToStep.back();
}