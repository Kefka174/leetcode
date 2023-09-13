class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int timeRequired = 0;
        int ticketsBeforeK = tickets[k];
        for (int i = 0; i < tickets.length; i++) {
            timeRequired += Math.min(tickets[i], ticketsBeforeK);
            if (i == k) ticketsBeforeK--;
        }
        return timeRequired;
    }
}