import java.util.Map;
import java.util.HashMap;
import java.util.TreeSet;
import javafx.util.Pair;

class Solution {
    public int makeArrayIncreasing(int[] arr, int[] arr2) {
        TreeSet<Integer> swapSet = new TreeSet<>();
        for (int num : arr2) swapSet.add(num);
        Map<Pair<Integer, Integer>, Integer> dp = new HashMap<>();
        
        return recursiveHelper(arr, 0, -1, swapSet, dp);
    }

    private int recursiveHelper(int[] arr, int arrIndex, int prevValue, TreeSet<Integer> swapSet, Map<Pair<Integer, Integer>, Integer> dp) {    
        Pair<Integer, Integer> inputPair = new Pair<Integer,Integer>(arrIndex, prevValue);    
        if (arrIndex == arr.length) return 0;
        else if (dp.containsKey(inputPair)) return dp.get(inputPair);

        // move to next index if arr is still sorted
        int maintainCurrentIndex = -1;
        if (arr[arrIndex] > prevValue) {
            maintainCurrentIndex = recursiveHelper(arr, arrIndex + 1, arr[arrIndex], swapSet, dp);
        }
        // replace value at index
        int replaceCurrentIndex = -1;
        Integer replacementValue = swapSet.higher(prevValue);
        if (replacementValue != null) {
            replaceCurrentIndex = recursiveHelper(arr, arrIndex + 1, replacementValue, swapSet, dp);
            if (replaceCurrentIndex != -1) replaceCurrentIndex++;
        }

        int opCount;
        if (maintainCurrentIndex == -1) opCount = replaceCurrentIndex;
        else if (replaceCurrentIndex == -1) opCount = maintainCurrentIndex;
        else opCount = Math.min(maintainCurrentIndex, replaceCurrentIndex);

        dp.put(inputPair, opCount);
        return opCount;
    }


    // Testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = {1,5,3,6,7};
        int[] arr2 = {1,3,2,4};
        System.out.println(sol.makeArrayIncreasing(arr1, arr2)); // 1

        arr1 = new int[] {1,5,3,6,7};
        arr2 = new int[] {4,3,1};
        System.out.println(sol.makeArrayIncreasing(arr1, arr2)); // 2

        arr1 = new int[] {1,5,3,6,7};
        arr2 = new int[] {1,6,3,3};
        System.out.println(sol.makeArrayIncreasing(arr1, arr2)); // -1

        arr1 = new int[] {5,16,19,2,1,12,7,14,5,16};
        arr2 = new int[] {6,17,4,3,6,13,4,3,18,17,16,7,14,1,16};
        System.out.println(sol.makeArrayIncreasing(arr1, arr2)); // 8
    }
}