import java.util.Deque;
import java.util.List;
import java.util.Map;

class Solution {
    // could use list of lists and visited boolean array instead of hashmap
    public int minReorder(int n, int[][] connections) {
        Map<Integer, List<Integer>> unvisitedCities = new HashMap<>();
        for (int i = 0; i < n; i++) unvisitedCities.put(i, new ArrayList<>());
        for (int i = 0; i < connections.length; i++) {
            unvisitedCities.get(connections[i][0]).add(i);
            unvisitedCities.get(connections[i][1]).add(i);
        }

        Deque<Integer> cityStack = new ArrayDeque<>();
        cityStack.push(0);
        int numRoadsReordered = 0;
        while (!cityStack.isEmpty()) {
            int currentCity = cityStack.pop();
            for (int road : unvisitedCities.get(currentCity)) {
                int source = connections[road][0];
                int destination = connections[road][1];

                if (source == currentCity) {
                    if (unvisitedCities.containsKey(destination)) {
                        numRoadsReordered++;
                        cityStack.push(destination);
                    }
                }
                else if (unvisitedCities.containsKey(source))
                    cityStack.push(source);
            }
            unvisitedCities.remove(currentCity);
        }
        return numRoadsReordered;
    }
}