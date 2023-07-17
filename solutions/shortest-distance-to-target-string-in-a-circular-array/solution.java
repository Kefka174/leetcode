class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int minTargetDistance = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                int straightDistance = Math.abs(startIndex - i);
                int loopAroundDistance = Math.min(startIndex, i) + 
                                         (words.length - Math.max(startIndex, i));

                int wordIDistance = Math.min(straightDistance, loopAroundDistance);
                if (wordIDistance < minTargetDistance) minTargetDistance = wordIDistance;
            }
        }
        if (minTargetDistance == Integer.MAX_VALUE) return -1;
        return minTargetDistance;
    }
}