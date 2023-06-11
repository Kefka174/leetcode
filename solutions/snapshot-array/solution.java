import java.util.TreeMap;

class SnapshotArray {
    private TreeMap<Integer, Integer>[] values;
    int currentSnapID = 0;

    @SuppressWarnings("unchecked")
    public SnapshotArray(int length) {
        values = new TreeMap[length];
        for (int i = 0; i < length; i++) {
            values[i] = (new TreeMap<Integer, Integer>());
            values[i].put(0, 0);
        }
    }
    
    public void set(int index, int val) {
        values[index].put(currentSnapID, val);
    }
    
    public int snap() {
        return currentSnapID++;
    }
    
    public int get(int index, int snap_id) {
        return values[index].floorEntry(snap_id).getValue();
    }
}