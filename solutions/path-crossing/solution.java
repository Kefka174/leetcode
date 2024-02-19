import java.util.Set;
import javafx.util.Pair;

class Solution {
    public boolean isPathCrossing(String path) {
        int currentX = 0, currentY = 0;
        Set<Pair<Integer, Integer>> oldPoints = new HashSet<>();
        oldPoints.add(new Pair(0, 0));
        
        for (int i = 0; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case 'N':
                    currentY++;
                    break;
                case 'S':
                    currentY--;
                    break;
                case 'E':
                    currentX++;
                    break;
                case 'W':
                    currentX--;
                    break;
            }
            Pair<Integer, Integer> currentPoint = new Pair(currentX, currentY);
            if (oldPoints.contains(currentPoint)) return true;
            oldPoints.add(currentPoint);
        }
        return false;
    }
}