class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        
        // Mark guards as 1, walls as -1
        for (int[] guard : guards) {
            grid[guard[0]][guard[1]] = 1;
        }
        for (int[] wall : walls) {
            grid[wall[0]][wall[1]] = -1;
        }

        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        // Mark guarded cells as 2
        for (int[] guard : guards) {
            int row = guard[0];
            int col = guard[1];

            for (int[] dir : dirs) {
                int r = row + dir[0];
                int c = col + dir[1];

                while (r >= 0 && r < m && c >= 0 && c < n && grid[r][c] != 1 && grid[r][c] != -1) {
                    // Mark as guarded if empty
                    if (grid[r][c] == 0) {
                        grid[r][c] = 2;
                    }
                    r += dir[0];
                    c += dir[1];
                }
            }
        }

        // Count unguarded cells
        int unguarded = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    unguarded++;
                }
            }
        }

        return unguarded;
    }
}
