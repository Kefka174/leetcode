import java.util.Deque;

class Solution {
    // Using int[] of length 2 instead of Pairs, modifies original maze
    public int nearestExit(char[][] maze, int[] entrance) {
        Deque<int[]> queue = new ArrayDeque<>();
        Deque<int[]> neighborQueue = new ArrayDeque<>();
        enqueueNeighbors(entrance, maze, neighborQueue);
        maze[entrance[0]][entrance[1]] = 'X';

        int stepsFromEntrance = 0;
        while (!queue.isEmpty() || !neighborQueue.isEmpty()) {
            if (queue.isEmpty()) {
                stepsFromEntrance++;
                Deque<int[]> temp = queue;
                queue = neighborQueue;
                neighborQueue = temp;
            }

            int[] currentCell = queue.poll();
            if (currentCell[0] == 0 || currentCell[0] == maze.length - 1 ||
                currentCell[1] == 0 || currentCell[1] == maze[0].length - 1)
                return stepsFromEntrance;

            enqueueNeighbors(currentCell, maze, neighborQueue);
        }
        return -1;
    }

    private void enqueueNeighbors(int[] cell, char[][] maze, Deque<int[]> queue) {
        int[] nextDirection = {0, 1};
        for (int i = 0; i < 4; i++) {
            int[] neighbor = {cell[0] + nextDirection[0], cell[1] + nextDirection[1]};
            boolean neighborInBounds = neighbor[0] >= 0 && neighbor[0] < maze.length &&
                                       neighbor[1] >= 0 && neighbor[1] < maze[0].length;
            
            if (neighborInBounds && maze[neighbor[0]][neighbor[1]] == '.') {
                maze[neighbor[0]][neighbor[1]] = 'X';
                queue.add(neighbor);
            }

            int temp = nextDirection[0];
            nextDirection[0] = nextDirection[1];
            nextDirection[1] = -temp;
        }
    }
}