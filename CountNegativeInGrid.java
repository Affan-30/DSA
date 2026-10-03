class Solution {
    // Method to ciunt the negative numbers from a 2D grid which is sorted
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0; i < grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] < 0){
                    count++;
                }
            }
        }
        return count;
    }
}
