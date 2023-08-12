import java.util.Arrays;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int higherSpeed = Arrays.stream(piles).max().getAsInt();
        int lowerSpeed = 1;

        while (lowerSpeed <= higherSpeed) {
            int middleSpeed = ((higherSpeed - lowerSpeed) / 2) + lowerSpeed;
            long timeWithMiddleSpeed = timeCostAtSpeed(middleSpeed, piles);

            if (timeWithMiddleSpeed <= h) higherSpeed = middleSpeed - 1;
            else lowerSpeed = middleSpeed + 1;
        }

        return lowerSpeed;
    }

    private long timeCostAtSpeed(int speed, int[] piles) {
        long timeCost = 0;
        for (int i = 0; i < piles.length; i++)
            timeCost += (int)Math.ceil(piles[i] / (double)speed);
        return timeCost;
    }
}