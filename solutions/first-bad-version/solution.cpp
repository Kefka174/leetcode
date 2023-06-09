bool isBadVersion(int version) {}

int recursiveHelper(int bottom, int top) {
    if (bottom == top) return bottom;
    int middle = bottom + ((top - bottom) / 2);
    if (isBadVersion(middle)) return recursiveHelper(bottom, middle);
    return recursiveHelper(middle + 1, top);
}

int firstBadVersionRecursive(int n) {
    return recursiveHelper(1, n);
}

int firstBadVersion(int n) {
    int bottom = 1;
    int top = n;

    while (bottom < top) {
        int middle = bottom + ((top - bottom) / 2);
        if (isBadVersion(middle)) top = middle;
        else bottom = middle + 1;
    }
    return bottom;
}