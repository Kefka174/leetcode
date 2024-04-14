import java.util.Arrays;
import java.util.Queue;

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) { // simulation O(nlogn)
        Queue<Integer> drawQueue = new LinkedList<>();
        for (int i = 0; i < deck.length; i++) drawQueue.add(i);
        int[] indexDrawOrder = new int[deck.length];
        
        Arrays.sort(deck);
        int[] revealOrder = new int[deck.length];
        for (int i = 0; i < deck.length; i++) {
            revealOrder[drawQueue.poll()] = deck[i];
            drawQueue.add(drawQueue.poll());
        }
        return revealOrder;
    }
}