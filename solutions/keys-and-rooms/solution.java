import java.util.Deque;
import java.util.Set;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> roomsToVisit = new HashSet<>();
        for (int i = 1; i < rooms.size(); i++) roomsToVisit.add(i);
        Deque<Integer> roomKeys = new ArrayDeque<>();
        roomKeys.add(0);
        while (!roomKeys.isEmpty()) {
            int currentRoom = roomKeys.poll();
            for (int key : rooms.get(currentRoom)) {
                if (roomsToVisit.contains(key)) {
                    roomKeys.add(key);
                    roomsToVisit.remove(key);
                }
            }
        }
        return roomsToVisit.isEmpty();
    }
}