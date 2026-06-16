class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = 0;
    while(row < image.length){
    int i =0;
    int j =image[0].length-1;
        while(i <= j){
            int temp = image[row][i];
             image[row][i] = image[row][j];
             image[row][j] = temp;

             i++;
             j--;
        } 
        row++;
}
        for(int i=0; i<image.length; i++){
            for(int j =0; j<image[0].length; j++){
                image[i][j] = image[i][j] ^ 1;
            }
        }

        return image;
        
    }
}
