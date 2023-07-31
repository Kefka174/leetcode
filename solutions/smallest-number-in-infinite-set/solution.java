import java.util.PriorityQueue;
import java.util.Set;

class SmallestInfiniteSet {
    int smallestNum;
    PriorityQueue<Integer> numsAddedHeap;
    Set<Integer> numsAddedSet;

    public SmallestInfiniteSet() {
        smallestNum = 1;
        numsAddedHeap = new PriorityQueue<>();
        numsAddedSet = new HashSet<>();
    }
    
    public int popSmallest() {
        if (numsAddedHeap.isEmpty()) return smallestNum++;
        else {
            int smallest = numsAddedHeap.poll();
            numsAddedSet.remove(smallest);
            return smallest;
        }
    }
    
    public void addBack(int num) {
        if (num < smallestNum && !numsAddedSet.contains(num)) {
            numsAddedHeap.add(num);
            numsAddedSet.add(num);
        }
    }
}