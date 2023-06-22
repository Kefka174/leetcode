class Solution {
    public int maxProfit(int[] prices, int fee) {
        int currentProfit = 0, holdingProfit = 0;
        int boughtPrice = Integer.MAX_VALUE;
        int soldPrice = 0;

        for (int price : prices) {
            if (price < boughtPrice || price < soldPrice - fee) {
                boughtPrice = price;
                holdingProfit = currentProfit;
                soldPrice = 0;
            }
            else if (price - fee > boughtPrice) {
                int potentialProfit = holdingProfit + price - boughtPrice - fee;
                if (potentialProfit > currentProfit) {
                    soldPrice = price;
                    currentProfit = potentialProfit;
                }
            }
        }
        
        return currentProfit;
    }
}