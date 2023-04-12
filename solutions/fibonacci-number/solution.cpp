int fib(int n) {
    if (n == 0) return 0;
    int previous = 0, current = 1;
    for (int i = 1; i < n; i++) {
        int tempPrevious = previous;
        previous = current;
        current += tempPrevious;
    }
    return current;
}

int fibRecursive(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    return fibRecursive(n-1) + fibRecursive(n-2);
}