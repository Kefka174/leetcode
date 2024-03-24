import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int index = 0;
        PriorityQueue<Integer> bricksUsedPerBuilding = new PriorityQueue<>(Collections.reverseOrder());
        do {
            while (index + 1 < heights.length && bricks >= 0) {
                int diff = heights[index + 1] - heights[index];
                if (diff > 0) {
                    bricks -= diff;
                    bricksUsedPerBuilding.add(diff);
                }
                index++;
            }
            if (ladders > 0 && !bricksUsedPerBuilding.isEmpty()) {
                bricks += bricksUsedPerBuilding.poll();
                ladders--;
            }
        } while (bricks >= 0 && index + 1 < heights.length);

        if (bricks < 0) index--;
        return index;
    }
}