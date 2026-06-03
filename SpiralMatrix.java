import java.util.*;
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
ArrayList<Integer> list = new ArrayList<>();

   int startrow = 0;
    int endrow = matrix.length-1;
    int startcol = 0;
    int endcol = matrix[0].length-1;
    
while(startrow <= endrow && startcol<=endcol){
    
    for(int i = startcol; i<=endcol; i++){
        System.out.print ( matrix[startrow][i] + " ");
        list.add(matrix[startrow][i]);
    }
     startrow++;
     
    for(int i = startrow; i<=endrow; i++){
        System.out.print ( matrix[i][endcol] + " ");
        list.add(matrix[i][endcol]);
    }
    
    endcol--;
    
     if(startrow <= endrow){
 for(int i = endcol; i>=startcol; i--){
        System.out.print ( matrix[endrow][i] + " ");
        list.add(matrix[endrow][i]);
    }
    endrow--;
}

if(startcol <= endcol){
 for(int i = endrow; i>=startrow ; i--){
        System.out.print ( matrix[i][startcol] + " ");
        list.add(matrix[i][startcol]);
    }
    startcol++;
}
}
  System.out.println();
for(int i: list){
    System.out.print ( i + " ");}
    }
}
