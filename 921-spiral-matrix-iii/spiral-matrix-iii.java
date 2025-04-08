public class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        // Directions: East, South, West, North
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        List <int[]> ans = new ArrayList<>();

        // Initial coordinates and direction index
        int r = rStart, c = cStart;
        int directionIdx = 0;
        int steps = 1; // Number of steps to take in current direction
        
        ans.add(new int[] {rStart, cStart}); // Add starting point

        while (ans.size() < rows * cols) {
            for (int i = 0; i < 2; i++) {
                // Looping twice for same number of steps
                for (int j = 0; j < steps; j++) {
                    r += directions[directionIdx][0];
                    c += directions[directionIdx][1];

                    // Check if within bounds
                    if (r >= 0 && r < rows && c >= 0 && c < cols) {
                        ans.add(new int[]{r, c});
                    }
                }
                // Change direction
                directionIdx = (directionIdx + 1) % 4;
            }
            steps++; // Increase the steps after traversing in each direction pair
        }

        return ans.toArray(new int[rows * cols][2]);
    }

}