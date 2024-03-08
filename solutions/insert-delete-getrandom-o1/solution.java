import java.util.List;
import java.util.Map;
import java.util.Random;

class RandomizedSet {
    Map<Integer, Integer> indexMap;
    List<Integer> valList;
    public RandomizedSet() {
        indexMap = new HashMap<>();
        valList = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if (indexMap.containsKey(val)) return false;

        indexMap.put(val, valList.size());
        valList.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if (!indexMap.containsKey(val)) return false;

        if (indexMap.get(val) != valList.size() - 1) {
            int lastVal = valList.get(valList.size() - 1);
            valList.set(indexMap.get(val), lastVal);
            indexMap.put(lastVal, indexMap.get(val));
        }
        valList.remove(valList.size() - 1);
        indexMap.remove(val);
        return true;
    }
    
    public int getRandom() {
        return valList.get(new Random().nextInt(valList.size()));
    }
}