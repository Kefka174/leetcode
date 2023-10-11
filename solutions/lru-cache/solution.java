import java.util.LinkedHashMap;

class LRUCache {
    int capacity;
    LinkedHashMap cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new LinkedHashMap<>(capacity) {
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacity;
            }
        };
    }
    
    public int get(int key) {
        if (cache.containsKey(key)) {
            int value = (int)cache.remove(key);
            cache.put(key, value);
            return value;
        }
        else return -1;
    }
    
    public void put(int key, int value) {
        cache.remove(key);
        cache.put(key, value);
    }
}