import java.util.Deque;

class RecentCounter {
    int bufferSize = 3000;
    Deque<Integer> pingQueue;

    public RecentCounter() {
        pingQueue = new ArrayDeque<>();
    }
    
    public int ping(int t) {
        pingQueue.add(t);
        while (pingQueue.size() > 0 && pingQueue.peek() < t - bufferSize)
            pingQueue.poll();
        return pingQueue.size();
    }
}