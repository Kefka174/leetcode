import java.util.Arrays;

class Solution {
    public int minSpeedOnTime(int[] dist, double hour) { // O(n*logk) where k = 10000000
        if (hour <= dist.length - 1) return -1;

        int higherSpeed = 10000000;
        int lowerSpeed = (int)Math.floor(Arrays.stream(dist).sum() / hour);
        while (lowerSpeed <= higherSpeed) {
            int middleSpeed = ((higherSpeed - lowerSpeed) / 2) + lowerSpeed;
            double timeWithMiddleSpeed = trainTimeAtSpeed(middleSpeed, dist);

            if (timeWithMiddleSpeed <= hour) higherSpeed = middleSpeed - 1;
            else lowerSpeed = middleSpeed + 1;
        }
        return lowerSpeed;
    }

    private double trainTimeAtSpeed(int speed, int[] dist) {
        double timeCost = 0;
        for (int i = 0; i < dist.length; i++) {
            if (i != dist.length - 1) timeCost += Math.ceil(dist[i] / (double)speed);
            else timeCost += dist[i] / (double)speed;
        }
        return timeCost;
    }


    ///////////////////////////////////////////////////////////////////////////
    public int minSpeedOnTimeBrute(int[] dist, double hour) { // O(cringe)
        if (hour < dist.length - 1) return -1;

        double speed = Math.ceil(Arrays.stream(dist).sum() / hour);
        while (true) {
            double timeCost = 0;
            for (int i = 0; i < dist.length; i++) {
                if (i != dist.length - 1) timeCost += Math.ceil(dist[i] / speed);
                else timeCost += dist[i] / speed;
            }
            if (timeCost <= hour) return (int)speed;
            speed++;
        }
    }
}