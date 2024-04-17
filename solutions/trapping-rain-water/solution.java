import java.util.Deque;

class Solution {
    public int trap(int[] height) {
        Deque<int[]> monoStack = new LinkedList<>();
        int waterTrapped = 0, valleyFloor = 0;
        for (int i = 1; i < height.length; i++) {
            if (height[i - 1] > height[i]) {
                monoStack.push(new int[]{height[i - 1], i - 1});
                valleyFloor = height[i];
            }
            else {
                while (!monoStack.isEmpty() && valleyFloor < height[i]) {
                    int newWaterLevel, leftWallIndex = monoStack.peek()[1];
                    if (monoStack.peek()[0] <= height[i]) newWaterLevel = monoStack.pop()[0];
                    else newWaterLevel = height[i];
                    waterTrapped += (newWaterLevel - valleyFloor) * (i - leftWallIndex - 1);
                    valleyFloor = newWaterLevel;
                }
            }
        }
        return waterTrapped;
    }
}