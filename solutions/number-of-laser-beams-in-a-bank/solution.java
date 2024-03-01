class Solution {
    public int numberOfBeams(String[] bank) {
        int beamCount = 0, prevDevices = 0;
        for (String row : bank) {
            int devicesInRow = 0;
            for (int i = 0; i < row.length(); i++) {
                if (row.charAt(i) == '1') devicesInRow++;
            }
            if (devicesInRow > 0) {
                beamCount += devicesInRow * prevDevices;
                prevDevices = devicesInRow;
            }
        }
        return beamCount;
    }
}