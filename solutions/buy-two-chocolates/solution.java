class Solution {
    public int buyChoco(int[] prices, int money) {
        int smallest = Math.min(prices[0], prices[1]);
        int secondsmallest = Math.max(prices[0], prices[1]);
        for (int i = 2; i < prices.length; i++) {
            if (prices[i] < smallest) {
                secondsmallest = smallest;
                smallest = prices[i];
            }
            else if (prices[i] < secondsmallest) {
                secondsmallest = prices[i];
            }
        }
        
        if (smallest + secondsmallest <= money) {
            return money - (smallest + secondsmallest);
        }
        return money;
    }
}