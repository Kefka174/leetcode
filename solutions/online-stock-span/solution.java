import java.util.Deque;

// Using arrays of length 2 in place of Pairs
class StockSpanner {
    Deque<int[]> monoStack;

    public StockSpanner() {
        monoStack = new ArrayDeque<>();
    }
    
    public int next(int price) {
        int span = 1;
        while (!monoStack.isEmpty() && price >= monoStack.peek()[0]) {
            span += monoStack.pop()[1];
        }
        monoStack.push(new int[] {price, span});
        return span;
    }
}