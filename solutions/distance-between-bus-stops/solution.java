class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int forwardDistance = 0;
        for (int i = start; i != destination; i++) {
            forwardDistance += distance[i];
            if (i == distance.length - 1) i = -1;
        }

        int backwardDistance = 0;
        for (int i = start - 1; i != destination - 1; i--) {
            if (i < 0) i = distance.length - 1;
            backwardDistance += distance[i];
        }
        
        return Math.min(forwardDistance, backwardDistance);
    }
}