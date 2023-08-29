import java.util.Deque;

class MyStack {
    Deque<Integer> queue;

    public MyStack() {
        queue = new ArrayDeque<>();
    }
    
    public void push(int x) { // O(n)
        queue.add(x);
        for (int i = 0; i < queue.size() - 1; i++)
            queue.add(queue.poll());
    }
    
    public int pop() { // O(1)
        return queue.poll();
    }
    
    public int top() { // O(1)
        return queue.peek();
    }
    
    public boolean empty() { // O(1)
        return queue.isEmpty();
    }
}