class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int [][] matrix = {
            {5,1,9,11},
            {2,4,8,10},
            {13,3,6,7},
            {15,14,12,16}};
        // {{1,2,3},{4,5,6},{7,8,9}};
        int m = matrix.length;
        int n = matrix[0].length;

      // Transpose of n x n matrix
        for(int i=0; i<m; i++){
                for(int j =i+1 ; j<n; j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
            }
        }
        
        
          for (int i = 0; i < matrix.length; i++) {
        int left = 0;
        int right = matrix[i].length - 1;
        while (left < right) {
            // Swap elements
            int temp = matrix[i][left];
            matrix[i][left] = matrix[i][right];
            matrix[i][right] = temp;
            left++;
            right--;
        }
    }
        
         for(int i=0; i<m; i++){
                for(int j =0 ; j<n; j++){
                    System.out.print ( matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
