import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (a , b) -> a[0] - b[0]);
        Comparator comp = Comparator.comparing((long[] arr) -> arr[0])
                                    .thenComparing((long[] arr) -> arr[1]);
        PriorityQueue<long[]> roomAvailability = new PriorityQueue<>(n, comp);
        for (int i = 0; i < n; i++) roomAvailability.add(new long[]{0, i});

        int[] roomUsage = new int[n];
        for (int[] meeting : meetings) {
            while (roomAvailability.peek()[0] < meeting[0]) {
                roomAvailability.add(new long[]{meeting[0], roomAvailability.poll()[1]});
            }
            long startTime = roomAvailability.peek()[0];
            long room = roomAvailability.poll()[1];
            roomUsage[(int)room]++;
            roomAvailability.add(new long[]{startTime + (meeting[1] - meeting[0]), room});
        }
        
        int mostUsedRoom = 0;
        for (int i = 0; i < roomUsage.length; i++) {
            if (roomUsage[i] > roomUsage[mostUsedRoom]) mostUsedRoom = i;
        }
        return mostUsedRoom;
    }
}