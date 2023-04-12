int climbStairsRecursive(int n) { // o(n^2)
    if (n <= 2) return n;
    return climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2);
}

int climbStairs(int n) {
    if (n <= 2) return n;
    int previous = 0, current = 1;
    for (int i = 0; i < n; i++) {
        int tempPrevious = previous;
        previous = current;
        current += tempPrevious;
    }
    return current;
}