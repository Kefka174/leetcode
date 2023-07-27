import java.util.Arrays;

class Solution {
    public int minSpeedOnTimeBrute(int[] dist, double hour) {
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